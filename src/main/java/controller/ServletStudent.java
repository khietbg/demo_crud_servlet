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
    StudentIPML studentIPML;
    List<Student> students;
    public void init(){
        studentIPML = new StudentIPML();
        students = studentIPML.findAll();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action!=null){
            switch (action){
                case "SHOW":
                    showAllStudent(request,response);
            break;
                case "DELETE":
                    String idDel = request.getParameter("id");
                    studentIPML.delete(idDel);
                    showAllStudent(request,response);
            break;
                case "EDIT":
                    String idUp = request.getParameter("id");
                    for (Student s:students) {
                        if (s.getId().equals(idUp)){
                            request.setAttribute("studentEdit",s);
                            request.getRequestDispatcher("view/edit.jsp").forward(request,response);
                            break;
                        }
                    }
                    break;
                case "WATCH":
                    String idW = request.getParameter("id");
                    for (Student stu:students) {
                        if (stu.getId().equals(idW)){
                            request.setAttribute("studentD",stu);
                            request.getRequestDispatcher("view/detail.jsp").forward(request,response);
                            break;
                        }
                    }
                    break;


            }
        }

    }
    public void showAllStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        students = studentIPML.findAll();
        request.setAttribute("list", students);
        request.getRequestDispatcher("view/students.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action!=null){
            switch (action){
                case "CREATE":
                    String id = request.getParameter("id");
                    String name = request.getParameter("name");
                    int age = Integer.parseInt(request.getParameter("age"));
                    String address = request.getParameter("address");
                    String phone = request.getParameter("phone");
                    Student student = new Student(id,name,age,address,phone);
                    System.out.println(student);
                    studentIPML.createStudent(student);
                    showAllStudent(request,response);
          break;
                case "UPDATE":
                    String idUp = request.getParameter("id");
                    String nameUp = request.getParameter("name");
                    int ageUp = Integer.parseInt(request.getParameter("age"));
                    String addressUp = request.getParameter("address");
                    String phoneUp = request.getParameter("phone");
                studentIPML.updateStudent(new Student(idUp,nameUp,ageUp,addressUp,phoneUp));
                showAllStudent(request,response);
                break;


            }
        }
    }
}
