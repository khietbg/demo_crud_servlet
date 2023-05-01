package controller;

import model.Student;
import service.StudentIPML;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletStudent", value = "/ServletStudent")
public class ServletStudent extends HttpServlet {
    StudentIPML studentIPML = new StudentIPML();
    List<Student> students = new ArrayList<>();
    public void init(){
        students = studentIPML.findAll();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action!=null){
            if (action.equals("SHOW")){
               showAllStudent(request,response);
            }
        }

    }
    public void showAllStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", students);
        request.getRequestDispatcher("view/students.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
