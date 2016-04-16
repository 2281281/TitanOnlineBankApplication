
package TOBA.Controllers;

import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
 
public class LoginServlet extends HttpServlet { 

    private String url;
    
    @Override
    public void doGet(HttpServletRequest Request,
        HttpServletResponse Response) 
        throws IOException, ServletException { 
        
        String username = Request.getParameter("username"); 
        String password = Request.getParameter("password"); 
                
        if ((username==null) || (password==null)) { 
        
           url = "/login_failure.html"; }
        
            if (username.equals("jsmith@toba.com") && password.equals("letmein")) {
           url = "/account_activity.html"; }
            
            else 
               {
           url = "/login_failure.html"; }
    }
}