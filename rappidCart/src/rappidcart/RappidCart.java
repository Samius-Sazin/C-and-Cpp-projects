package rappidcart;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class RappidCart {
    
    void connection()
    {
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");

            Statement statement = connection.createStatement();
            
            //Boolean write_result = statement.execute("INSERT INTO `rappid_cart`.`login_signup` (`user_name`, `password`) VALUES ('sfss', '14411');");
            
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    
    
    public static void calling(){
        loading_page l_p = new loading_page();
        l_p.connect_loading_page();
        
        login l_g = new login();
        l_g.connect_login_page();
    }
    
    
    public static void main(String[] args) {
        RappidCart rc = new RappidCart();
        rc.connection();
        
        rc.calling();
    }
}
