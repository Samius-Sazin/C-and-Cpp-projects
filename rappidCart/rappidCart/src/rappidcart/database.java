package rappidcart;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class database {
    String full_name;
    String last_name;
    String user_name;
    String gmail;
    String password;
    Boolean seler;
    Boolean client;
    
    public void set_data_to_database_from_signUpPage(String full_name, String last_name, String user_name, String gmail, String password)
    {
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");

            Statement statement = connection.createStatement();
            
            //set Data to database
            Boolean write_result = statement.execute("INSERT INTO `rappid_cart`.`login_signup` (`first_name`, `last_name`, `user_name`, `gmail`, `password`, `seller`, `client`) VALUES ('"+ full_name +"', '"+ last_name +"', '"+ user_name +"', '" + gmail + "', '" + password + "', '1', '0');");
            
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public Boolean check_usernameOrGmail_password(String usernameOrGmail, String password){
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");

            Statement statement = connection.createStatement();
            
            //data read
            ResultSet read_result = statement.executeQuery("SELECT * FROM rappid_cart.login_signup;");
            
            Boolean check_username = false;
            Boolean check_pass = false;
            
            while (read_result.next()) {
                if(read_result.getString("user_name").compareTo(usernameOrGmail)==0 || read_result.getString("gmail").compareTo(usernameOrGmail)==0){
                    check_username = true;
                }
                
                if(read_result.getString("password").compareTo(password) == 0){
                    check_pass = true;
                }
            }
            
            if(check_username == true && check_pass == true){
                return true;
            }
            else{
                return false;
            }
            
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    
    
}
