package mylibrary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface CostumerDAO {

    public static void createCustomerDB(Customer_model cm){

        Conexion dbConnect=new Conexion();

        try(Connection connect = dbConnect.getConnection()){
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO customer (Document_ID, Doc_type, Name, Last_name, Email, Class)VALUES(?,?,?,?,?,?)";
                ps = connect.prepareStatement(query);
                ps.setInt(1,cm.getIdentifyDoc());
                ps.setString(2,cm.getDocType());
                ps.setString(3,cm.getName());
                ps.setString(4,cm.getLastName());
                ps.setString(5,cm.getEmail());
                ps.setString(6,cm.getGroupClass());
                ps.executeUpdate();
                System.out.println("Registro Exitoso");

            }catch (SQLException ex){
                System.out.println(ex);

            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }

    public static void readCustomerDB(){

    }

    public static void updateCustomerDB(){

    }

    public static void deleteCustomerDB(){

    }
}
