package mylibrary;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

        Conexion dbConnect=new Conexion();

        PreparedStatement ps = null;

        ResultSet resultSet = null;

        try (Connection connect = dbConnect.getConnection()) {

            String query = "SELECT * FROM customer";
            ps = connect.prepareStatement(query);
            resultSet = ps.executeQuery();

            while(resultSet.next()){
                System.out.println("ID: "+resultSet.getInt("Document_ID"));
                System.out.println("Tipo Documento: "+resultSet.getString("Doc_Type"));
                System.out.println("Nombre: "+resultSet.getString("Name"));
                System.out.println("Apellidos: "+resultSet.getString("Last_name"));
                System.out.println("Correo: "+resultSet.getString("Email"));
                System.out.println("Grupo: "+resultSet.getString("Class"));
                


            }

        }catch (SQLException e){
            System.out.println("No se recuperaron los registros");
            System.out.print("e");
        }

    }

    public static void updateCustomerDB(){

    }

    public static void deleteCustomerDB(){

    }
}
