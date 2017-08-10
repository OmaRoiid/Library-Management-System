

import java.sql.*;

public class DataContect {
    Connection connection;

    /**
     *
     * @return
     */
    public static  Connection ConetctDB (){
        try{
               Class.forName("org.sqlite.JDBC");
                Connection conn= DriverManager.getConnection("jdbc:sqlite:E:\\LMS\\added.sqlite");
                return conn;
        }
        catch(Exception e){
                    
        return null;
        }
    }
}
