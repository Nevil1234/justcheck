import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Collablestatement {
    public static void main(String arhs[])
    {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/nevil","root", "");
        CallableStatement cst=con.prepareCall("{call name(?,?)}");
        cst.setInt(1,1);
        cst.registerOutParameter(2, java.sql.Types.VARCHAR);
        cst.execute();
        System.out.println("success");  
        System.out.println(cst.getString(2));
         
  

        }
        catch(Exception e){
            System.out.println(e);
        } 
    }
    
}