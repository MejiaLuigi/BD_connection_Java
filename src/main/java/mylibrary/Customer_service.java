package mylibrary;

import java.util.Scanner;

public class Customer_service {

   static Scanner sc = new Scanner(System.in);

    public static void createCustomer(){
        System.out.println("Identificacion");
        int id = sc.nextInt();

        System.out.println("Tipo Documento");
        String docType = sc.next();

        System.out.println("Nombres");
        String name = sc.next();

        System.out.println("Apellidos");
        String lastname = sc.next();

        System.out.println("Correo");
        String email = sc.next();

        System.out.println("Grupo");
        String groupClass = sc.next();

        Customer_model register = new Customer_model();
        register.setIdentifyDoc(id);
        register.setDocType(docType);
        register.setName(name);
        register.setLastName(lastname);
        register.setEmail(email);
        register.setGroupClass(groupClass);

        CostumerDAO.createCustomerDB(register);
    }

    public static void readCustomer(){
        CostumerDAO.readCustomerDB();

    }

    public static void updateCustomer(){

    }

    public static void deleteCustomer(){

    }

}
