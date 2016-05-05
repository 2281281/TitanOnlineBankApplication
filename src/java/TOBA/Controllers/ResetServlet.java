package TOBA.Controllers;

import TOBA.Business.User;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResetServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/password_reset.html";
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "reset";  // default action
        }
          // perform action and set URL to appropriate page
        if (action.equals("reset")) {
            url = "/password_reset.html";    // the "register new customer" page
        } 
        
        if (action.equals("add")) 
        {
                       // get parameters from the request

            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String npassword = request.getParameter("npassword");
            
            // store data in User object
            User user = new User(username, password, npassword);
            
            // validate the parameters
            if (username == null || password == null ||
                    
                    username.isEmpty() || password.isEmpty()) {
                
                url = "/login.jsp";
            }
            
            if(username.equals("jsmith@toba.com") && password.equals("letmein")){
            password = npassword;
            url = "/login.jsp";
	}
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