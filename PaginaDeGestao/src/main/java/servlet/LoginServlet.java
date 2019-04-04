package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import crudhibernate.Professor;
import crudhibernate.ProfessorDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServerlet")
public class LoginServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) 
                        throws ServletException, java.io.IOException {

        try{	
            if (request.getParameter("cadastrar") != null) {    
                ProfessorDAO profDAO = new ProfessorDAO();
                Professor professor = new Professor();
                professor.setLogin(request.getParameter("login"));
                professor.setSenha(request.getParameter("senha"));

                professor = profDAO.login(professor);
                            
                HttpSession session = request.getSession(true);	    
                session.setAttribute("currentSessionUser",professor); 
                response.sendRedirect("index.jsp"); //logged-in page  
            }             
        }     
            
        catch (Throwable theException) {
            System.out.println(theException); 
        }
        
    }
}