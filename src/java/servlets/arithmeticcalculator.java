package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class arithmeticcalculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);
        //IMPORTANT
        request.setAttribute("result","---");
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        
        
      
        
        if( first == null || first.equals("") ||  second == null || second.equals(""))
        {
            request.setAttribute("result","invalid");
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);
            return;
        }
        
        if(first.matches("[a-zA-Z]+") || second.matches("[a-zA-Z]+"))
        {
            request.setAttribute("result","invalid");
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);
            return;
        }
        else{
            
            String math = request.getParameter("math");
            
            int firstNum = Integer.parseInt(first);
            int secondNum = Integer.parseInt(second);
            
            if(math.equals("+")){
                request.setAttribute("result",(firstNum+secondNum));
            }
            if(math.equals("-")){
                request.setAttribute("result", (firstNum - secondNum));
            }
            if(math.equals("*")){
                request.setAttribute("result", (firstNum * secondNum));
            }
            if(math.equals("%")){
                request.setAttribute("result", (firstNum % secondNum));
            }
           
            getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);
            return;
        }
        
        
        
        /*
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
*/
        
        
    
    }
}
