package mylibrary;

import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);
    Customer_service service = new Customer_service();

    public void menuApp(){

        int opt;


        do{

            System.out.println("1. Registrar Usuario \n" +
                    "2. Listar Usuario \n" +
                    "3. Actualizar Usuario \n" +
                    "4. Borrar Usuario \n" +
                    "5. Salir");
            System.out.println("Ingrese una opcion");
            opt = sc.nextInt();

            switch (opt){
                case 1:
                    System.out.println("Registro de Usuario");
                    Customer_service.createCustomer();
                    break;
                case 2:
                    System.out.println("Listado de Usuario");
                    break;
                case 3:
                    System.out.println("Actualizar Datos de Usuario");
                    break;
                case 4:
                    System.out.println("Borrar Usuario");
                    break;
                case 5:
                    System.out.println("Salir Del Sistema");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }

        }while(opt != 5);

    }

}
