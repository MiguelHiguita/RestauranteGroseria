package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer= new Scanner(System.in);

        String nombreUsuarioBD="miguel";
        String nombreUsuario;
        String correoUsuarioBD="uncorreonormal@gmail.com";
        String correoUsuario;
        String contrasenaUsuarioBD="1234";
        String contrasenaUsuario;
        String opcion;
        String propina;
        Integer cantidadPlatos;
        Integer intentos=0;
        Integer opcionPlatos;
        Double precioPlato=0.0;
        Double totalPlato1=0.0;
        Double totalPlato2=0.0;
        Double totalPlato3=0.0;
        Double totalPlato4=0.0;
        Double totalPlato5=0.0;
        Double totalPlato6=0.0;
        Double granTotal;
        Double granTotalConPropina;




        System.out.println("**El restaurante de Rigoberto***");
        do {
            System.out.println("Ingrese su nombre de Usuario: ");
            nombreUsuario = leer.nextLine();
            System.out.println("Ingrese su correo: ");
            correoUsuario = leer.nextLine();
            System.out.println("Ingrese su contraseña: ");
            contrasenaUsuario = leer.nextLine();

            if (nombreUsuario.equals(nombreUsuarioBD) && contrasenaUsuario.equals(contrasenaUsuarioBD)) {
                //Ingresar

                System.out.println("Bienvenido");
                do {
                    System.out.println("Menu principal:");
                    System.out.println("Opcion 1: Ingresar orden");
                    System.out.println("Opcion 2: Modificar orden");
                    System.out.println("Opcion 3: Terminar orden y calcular total");
                    System.out.println("Opcion 4: Salir");
                    opcion = leer.nextLine();

                    if (opcion.equals("1")) {
                        //mostrar menú
                        do {
                            System.out.println("Menu platos:");
                            System.out.println("1. Entrada de cangrejo de urrao: $28.000");
                            System.out.println("2. Escalopes a la rigo: $35.000");
                            System.out.println("3. Filete tour de francia: $150.000");
                            System.out.println("4. Corvina de rigo: $80.000");
                            System.out.println("5. Coctel michelle: $20.000");
                            System.out.println("6. Jugos de urrao: 18.500");
                            System.out.println("7. Terminar orden");
                            System.out.println("Digite el numero del plato que desea: ");
                            opcionPlatos = leer.nextInt();
                            if (opcionPlatos == 1) {
                                precioPlato = 28000.0;
                                System.out.println("Digite la cantidad de platos que desea: ");
                                cantidadPlatos = leer.nextInt();
                                totalPlato1 = precioPlato + cantidadPlatos;
                            }else if(opcionPlatos == 2){
                                precioPlato = 35000.0;
                                System.out.println("Digite la cantidad de platos que desea: ");
                                cantidadPlatos = leer.nextInt();
                                totalPlato2 = precioPlato + cantidadPlatos;
                            }else if(opcionPlatos == 3){
                                precioPlato = 150000.0;
                                System.out.println("Digite la cantidad de platos que desea: ");
                                cantidadPlatos = leer.nextInt();
                                totalPlato3 = precioPlato + cantidadPlatos;
                            }else if(opcionPlatos == 4){
                                precioPlato = 80000.0;
                                System.out.println("Digite la cantidad de platos que desea: ");
                                cantidadPlatos = leer.nextInt();
                                totalPlato4 = precioPlato + cantidadPlatos;
                            }else if(opcionPlatos == 5){
                                precioPlato = 20000.0;
                                System.out.println("Digite la cantidad de platos que desea: ");
                                cantidadPlatos = leer.nextInt();
                                totalPlato5 = precioPlato + cantidadPlatos;
                            }else if(opcionPlatos == 6){
                                precioPlato = 18500.0;
                                System.out.println("Digite la cantidad de platos que desea: ");
                                cantidadPlatos = leer.nextInt();
                                totalPlato6 = precioPlato + cantidadPlatos;
                            }else if(opcionPlatos == 7){

                            }else{
                                System.out.println("Digita una opcion valida");
                            }
                        }while (opcionPlatos!=7);

                    } else if (opcion.equals("2")) {
                        //Modificar orden
                        System.out.println("Que numero de orden desea modificar?");
                        opcionPlatos= leer.nextInt();
                        if (opcionPlatos == 1) {
                            precioPlato = 28000.0;
                            System.out.println("Digite la cantidad de platos que desea: ");
                            cantidadPlatos = leer.nextInt();
                            totalPlato1 = precioPlato + cantidadPlatos;
                        }else if(opcionPlatos == 2){
                            precioPlato = 35000.0;
                            System.out.println("Digite la cantidad de platos que desea: ");
                            cantidadPlatos = leer.nextInt();
                            totalPlato2 = precioPlato + cantidadPlatos;
                        }else if(opcionPlatos == 3){
                            precioPlato = 150000.0;
                            System.out.println("Digite la cantidad de platos que desea: ");
                            cantidadPlatos = leer.nextInt();
                            totalPlato3 = precioPlato + cantidadPlatos;
                        }else if(opcionPlatos == 4){
                            precioPlato = 80000.0;
                            System.out.println("Digite la cantidad de platos que desea: ");
                            cantidadPlatos = leer.nextInt();
                            totalPlato4 = precioPlato + cantidadPlatos;
                        }else if(opcionPlatos == 5){
                            precioPlato = 20000.0;
                            System.out.println("Digite la cantidad de platos que desea: ");
                            cantidadPlatos = leer.nextInt();
                            totalPlato5 = precioPlato + cantidadPlatos;
                        }else if(opcionPlatos == 6){
                            precioPlato = 18500.0;
                            System.out.println("Digite la cantidad de platos que desea: ");
                            cantidadPlatos = leer.nextInt();
                            totalPlato6 = precioPlato + cantidadPlatos;
                        }else{
                            System.out.println("Digite una opcion valida.");
                        }

                    } else if (opcion.equals("3")) {
                        //Terminar orden y cancular total
                        granTotal=totalPlato1+totalPlato2+totalPlato3+totalPlato4+totalPlato5+totalPlato6;
                        System.out.println("El total de su compra es de: $"+granTotal);
                        System.out.println("Desea dejar propina del 10%?");
                        propina=leer.nextLine();
                        if(propina.equals("si")){
                            granTotalConPropina=granTotal+granTotal*0.1;
                            System.out.println("el total con propina es de: $"+granTotalConPropina);
                            intentos=intentos+5;
                        }else{
                            intentos=intentos+5;
                        }
                    } else if (opcion.equals("4")) {
                        //salir
                        intentos=intentos+5;
                    } else {
                        System.out.println("Digite una opcion valida");
                    }
                }while(intentos<3);
            }else{
                System.out.println("Nombre de usuario o contraseña incorrectas.");
                intentos = intentos + 1;
            }
        }while (intentos<3);

        System.out.println("Adios.");

    }
}