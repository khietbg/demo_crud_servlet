package until;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
    private static String DRIVER ="com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/CRUD";
    private static String USER ="root";
    private static String PASSWORD = "Minhkhiet1";
    public static Connection getConnection(){
        Connection conn = null;
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }
    public static void closeConnection(Connection conn){
        try {
            if (conn != null){
                conn.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
//    public static void main(String[] args) {
//        Connection conn = getConnection();
//        System.out.println(conn);
//    }
}
