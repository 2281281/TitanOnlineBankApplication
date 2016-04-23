/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TOBA.Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import TOBA.Business.User;
import TOBA.Data.UserDB;

public class UserController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {

        String requestURI = request.getRequestURI();
        String url = "";
        if (requestURI.endsWith("/deleteCookies")) {
            url = deleteCookies(request, response);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }


    private String deleteCookies(HttpServletRequest request,
            HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            cookie.setMaxAge(0);  //delete the cookie
            cookie.setPath("/");  //entire application
            response.addCookie(cookie);
        }
        return "/delete_cookies.jsp";
    }

   }