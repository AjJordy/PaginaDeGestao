package servlet;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crudhibernate.Aluno;
import crudhibernate.AlunoDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/DashboardServlet")
public class DashboardServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) 
                        throws ServletException, java.io.IOException {

        try{
            if (request.getParameter("cadastrar") != null) {
                AlunoDAO alunoDAO = new AlunoDAO();
                Aluno aluno = new Aluno();
                aluno.setNome(request.getParameter("nome"));
                aluno.setMateria(request.getParameter("materia"));
                aluno.setMatricula(request.getParameter("materia"));
                alunoDAO.persist(aluno);
            } else if (request.getParameter("pesquisar") != null){
                AlunoDAO alunoDAO = new AlunoDAO();
                List<Aluno> alunos = alunoDAO.findAll();
            } else if (request.getParameter("editar") != null) {
                AlunoDAO alunoDAO = new AlunoDAO();
                Aluno aluno = new Aluno();
                aluno.setNome(request.getParameter("nome"));
                aluno.setMateria(request.getParameter("materia"));
                aluno.setMatricula(request.getParameter("materia"));
                alunoDAO.editar(aluno);
            }  
            
        }     
            
        catch (Throwable theException) {
            System.out.println(theException); 
        }
        
    }
}