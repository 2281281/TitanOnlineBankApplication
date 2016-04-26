package TOBA.Controllers;

import TOBA.Business.User;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/login.jsp";
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "login";  // default action
        }
          // perform action and set URL to appropriate page
        if (action.equals("login")) {
            url = "/login.jsp";    // the "register new customer" page
        } 
        else if (action.equals("add")) {
                       // get parameters from the request

            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            // store data in User object
            User user = new User(username, password);
            
            // validate the parameters
            if (username == null || password == null ||
                    
                    username.isEmpty() || password.isEmpty()) {
                
                url = "/login.jsp";
            }
            
            if(username.equals("jsmith@toba.com") && password.equals("letmein")){
            url = "/account_activity.jsp";
            }
          //      if ((username == this.getInitParameter(username))
          //     && (password == this.getInitParameter(password))){
          //      url = "/account_activity.jsp";
          //  }
                
            
            else{
                url = "/login_failure.html";
            }
                
            request.setAttribute("user", user);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }    
}