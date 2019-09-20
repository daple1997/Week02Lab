/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 791105
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String result = request.getParameter("result");
        String action = request.getParameter("math");
        //        request.setAttribute("result","---");
        if(first.equals("") || second.equals("")){
            request.setAttribute("result","invalid");
        }
        else{
            boolean b = true;
            for(int i = 0; i < first.length(); i++){
                char c = first.charAt(i);
                if(!Character.isDigit(c)){
                    b = false;
                    request.setAttribute("result","invalid");
                }
            }
            for(int i = 0; i < second.length(); i++){
                char c = second.charAt(i);
                if(!Character.isDigit(c)){
                    b = false;
                    request.setAttribute("result","invalid");
                }
            }
            if(b == true){
                int firstNumber = new Integer(first);
                int secondNumber = new Integer(second);
                int sum = 0;
                if ("+".equals(action)) {
                    sum = firstNumber + secondNumber;
                } else if ("-".equals(action)) {
                    sum = firstNumber - secondNumber;
                } else if ("*".equals(action)){
                    sum = firstNumber * secondNumber;
                } else if ("%".equals(action)){
                    sum = firstNumber % secondNumber;
                }
                request.setAttribute("result",sum + "");
            }
        }
    }
        
        
    }
    

    


