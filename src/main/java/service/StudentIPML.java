package service;

import model.Student;
import until.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentIPML {
    public List<Student> findAll(){
        Connection conn = null;
        List<Student> students = new ArrayList<>();
        try {
            conn = ConnectionDB.getConnection();
            PreparedStatement pre = conn.prepareStatement("select * from students ");
            ResultSet rs = pre.executeQuery();
            while (rs.next()){
                Student st = new Student();
                st.setId(rs.getString(1));
                st.setName(rs.getString(2));
                st.setAge(rs.getInt(3));
                st.setAddress(rs.getString(4));
                st.setPhone(rs.getString(5));
                students.add(st);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return students;
    }
    public boolean createStudent(Student student){
        try {
            Connection conn = ConnectionDB.getConnection();
            PreparedStatement pre= conn.prepareStatement("insert into Students values (?,?,?,?,?)");
            pre.setString(1,student.getId());
            pre.setString(2,student.getName());
            pre.setInt(3,student.getAge());
            pre.setString(4,student.getAddress());
            pre.setString(5,student.getPhone());
            int i = pre.executeUpdate();
            System.out.println(i);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public boolean updateStudent(Student student){

        try {
            Connection conn = ConnectionDB.getConnection();
            PreparedStatement pre = conn.prepareStatement(
                    "update  students  set name =?, age =?, address=?, phone=? where id=?");
            pre.setString(1,student.getName());
            pre.setInt(2,student.getAge());
            pre.setString(3,student.getAddress());
            pre.setString(4,student.getPhone());
            pre.setString(5,student.getId());
            pre.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public boolean delete(String id){
        try {
            Connection conn = ConnectionDB.getConnection();
            PreparedStatement pre = conn.prepareStatement("DELETE from Students WHERE id = ?");
            pre.setString(1, id);
            pre.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
