package TOBA.Customer;

import TOBA.Business.User;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//import Controllers.User;
//import Controllers.UserDB;

public class NewCustomerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/new_customer.html";
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "register";  // default action
        }
          // perform action and set URL to appropriate page
        if (action.equals("register")) {
            url = "/new_customer.jsp";    // the "register new customer" page
        } 
        else if (action.equals("add")) {
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String phone = request.getParameter("phone");
            String address = request.getParameter("address");
            String address2 = request.getParameter("address2");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String zip = request.getParameter("zip");
            String email = request.getParameter("email");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
        
                   // store data in User object
            User user = new User(firstName, lastName, phone, address, address2, city, state, zip, email);
            
            //create username
            username=lastName + zip;
            password="welcome1";
            
            // validate the parameters
            if (firstName == null || lastName == null || phone == null || address == null 
                    || address2 == null || city == null || state == null || zip == null
                    || email == null ||
                    firstName.isEmpty() || lastName.isEmpty() || 
                    phone.isEmpty() || address.isEmpty() ||
                    address2.isEmpty() || city.isEmpty() ||
                    state.isEmpty() || zip.isEmpty() || email.isEmpty()) {
                url = "/new_customer.jsp";
            }
            else {
                url = "/success.jsp";
                //TOBA.Data.UserDB.insert(user);
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