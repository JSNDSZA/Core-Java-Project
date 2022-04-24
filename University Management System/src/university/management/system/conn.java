package university.management.system;

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///ums","root","Jason@25*");    
            s =c.createStatement();  
            s.executeUpdate(null);
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
