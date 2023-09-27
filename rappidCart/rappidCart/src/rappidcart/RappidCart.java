package rappidcart;

public class RappidCart {
    
    public static void calling(){
        loading_page l_p = new loading_page();
        l_p.connect_loading_page();
        
        login l_g = new login();
        l_g.connect_login_page_From_RappidCart();//login page call signup page
    }
    
    public static void main(String[] args) {
        RappidCart rc = new RappidCart();
        rc.calling();
               
    }
}