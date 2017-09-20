/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 686623
 */
public class AgeCalculatorServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
        
       
     }
    
    
   


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        calculate(request,response);
       
        
        }
    
    
    protected void calculate(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
    
        String currentAge = request.getParameter("cAge");
        request.setAttribute("currentage", currentAge);
        
        
        if(currentAge == null || currentAge.trim().isEmpty())
        {
           
         request.setAttribute("errorMessage", "You must give your current age.");
         getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            
        }
        else if(!currentAge.matches(".*[0-9].*"))
        {
            
         request.setAttribute("invalidMessage", "You must enter a number");
         getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            
        }
        else
        {
            int nextAge = Integer.parseInt(currentAge);
            String nextBirthdayMessage = "Your age next birthday will be ";
            nextAge++;
            
            request.setAttribute("nextBirthday",nextBirthdayMessage + nextAge);
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
        }
    }
}




