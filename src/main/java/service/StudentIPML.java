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
                st.setId(rs.getString("id"));
                st.setName(rs.getString("name"));
                st.setAge(rs.getInt("age"));
                st.setAddress(rs.getString("address"));
                st.setPhone(rs.getString("phone"));
                students.add(st);

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return students;
    }
}
