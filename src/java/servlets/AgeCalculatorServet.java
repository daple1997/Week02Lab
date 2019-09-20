package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 791105
 */
public class AgeCalculatorServet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String age = request.getParameter("age");
         String message = "";

         boolean isNumber = true;
         if(!age.isEmpty()){
            for(int i = 0; i < age.length(); i++){
               char c = age.charAt(i); 
               if(!Character.isDigit(c)){
                   isNumber = false;
               } 
            }
         } 
         else{
             isNumber = false;
         }
         if (!isNumber) {
            request.setAttribute("message","you must give your own age");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);      
        }
         else if(isNumber){
             int newAge = new Integer(age);
             newAge++;
             String newMessage = message + "Your age next birthday will be ";
             request.setAttribute("age", newAge + "");
             request.setAttribute("message", newMessage);
             getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
         }
     }
}
