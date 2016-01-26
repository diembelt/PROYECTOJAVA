/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package general;

/**
 * Declaracion de la clase Menu  
 * Contiene los diferentes menus utilizados en el proyecto 
 * @version 1.0, 13/12/15
 * @author GRUPO : HURTARES-BELTRAN-CORONEL-ESCOBAR
 */
public class Menu {
    
    //Imprime el menú principal del programa
    public static void imprimirMenuPrincipal(){
        
        System.out.println("                8888888888  888    88888");
        System.out.println("               88     88   88 88   88  88");
        System.out.println("                8888  88  88   88  88888");
        System.out.println("                   88 88 888888888 88  88");
        System.out.println("            88888888  88 88     88 88   888888");
        System.out.println("");
        System.out.println("            88  88  88   888    88888   888888");
        System.out.println("            88  88  88  88 88   88  88 88");
        System.out.println("            88 8888 88 88   88  88888   8888");
        System.out.println("             888  888 888888888 88   88    88");
        System.out.println("              88  88  88     88 88    888888");
        System.out.println("                                        ╔───────╗            /~\\                                    ");
        System.out.println("                                        ║Bienvenido ║ <<<<<<<< :( 00 )                                ");
        System.out.println("╔ ╔╝╔╝╔╝╔╝╔╝╔╝╔╝╔╝╗          ╚───────╝           \\= /                         ");
        System.out.println("╚╗   ╔─────────╗   ╚╗               ╔──╗           /¯¯  ¯¯\\                                 ");
        System.out.println("╚╗   ║MENÚ PRINCIPAL║   ╚╗              /( 0 ) \\         //:/¯¯\\:\\\\                   ");
        System.out.println("╚╗   ╚─────────╝   ╚╗          ╔─╚────╝─╗    ││ \\__/ ││                          ");
        System.out.println("╚╗       1.INGRESO       ╚╗          │  │ ▄▀▄│  │    ││:\\  /:││                            ");
        System.out.println("╚╗       2.CONSULTA      ╚╗          │__│  0   │__│     # \\__ __/ #                               ");
        System.out.println("╚╗       3.EDICIÓN       ╚╗            ││  0   ││         │ │ │                                ");
        System.out.println("╚╗       4.ELIMINACIÓN   ╚╗            ││ __*__││         │ │ │                         ");
        System.out.println("╚╗       5.INTEGRANTES   ╚╗           │~│ \\   /│~│        []│ []                       ");
        System.out.println("╚╗       0.SALIR         ╚╗           /=\\   /=\\  /=\\        │ │ │                          ");
        System.out.println("╚╗                       ╚╗           [  ] [  ]  [  ]      /  ] [  \\                           ");
        System.out.println("╚ ╚╗╚╗╚╗╚╗╚╗╚╗╚╗╚╗╝");
    }
    
    public static void imprimirConsultar(){
        Utilidades.limpiarPantalla();
                    System.out.println("           \\|||/            ");
                    System.out.println("          ( Ö Ö )           ");
                    System.out.println("------oo0---(_)---0oo-------");
                    System.out.println("╔════════════════╗");
                    System.out.println("║--------CONSULTA----------║");
                    System.out.println("║1. Consultar Sensores     ║");
                    System.out.println("║2. Consultar Actuadores   ║");
                    System.out.println("╚════════════════╝");
                    System.out.println("----------------------------");
                    System.out.println("       |___|     |___|      ");
                    System.out.println("        | |       | |       ");
                    System.out.println("        oo0       0oo       ");
    }
    
    //Imprime el submenú de eliminar , aqui podemos elegir si eliminar sensores o actuadores
    public static void imprimirEliminar(){
        Utilidades.limpiarPantalla();
                    System.out.println("           ( ( (             ");
                    System.out.println("            ) ) )            ");
                    System.out.println("           ( ( (             ");
                    System.out.println("        '. _____ .'           ");
                    System.out.println("        ' ( > < ) '          ");
                    System.out.println("------oo0---(_)---0oo-------");
                    System.out.println("╔════════════════╗");
                    System.out.println("║----QUE DESEA ELIMINAR---║");
                    System.out.println("║1. Eliminar Sensores     ║");
                    System.out.println("║2. Eliminar Actuadores   ║");
                    System.out.println("╚════════════════╝");
                    System.out.println("----------------------------");
                    System.out.println("       |___|     |___|      ");
                    System.out.println("        | |       | |       ");
                    System.out.println("        oo0       0oo       ");
    }
    
    //Imprime el submenú de Ingreso - podemos ingresar valores de un sensor o de un actuador
    public static void imprimirIngresar(){
        Utilidades.limpiarPantalla();
                    System.out.println("          ( Ö Ö )           ");
                    System.out.println("------oo0---(_)---0oo-------");
                    System.out.println("╔════════════════╗");
                    System.out.println("║---------INGRESO---------║");
                    System.out.println("║1.Ingresar Sensores              ║");
                    System.out.println("║2.Ingresar Actuadores            ║");
                    System.out.println("╚════════════════╝");
                    System.out.println("----------------------------");
                    System.out.println("       |___|     |___|      ");
                    System.out.println("        | |       | |       ");
                    System.out.println("        oo0       0oo       ");
                    
    }
    
    //Imprime el submenú de Editar - Sirve para indicar que se va a editar sensores o actuadores 
    public static void imprimirEditar(){
        Utilidades.limpiarPantalla();
                    System.out.println("            ???             ");
                    System.out.println("          ( Ö Ö )           ");
                    System.out.println("------oo0---(_)---0oo-------");
                    System.out.println("╔────────────────╗");
                    System.out.println("║---------EDITAR ---------║");
                    System.out.println("║1.Editar Sensores              ║");
                    System.out.println("║2.Editar Actuadores            ║");
                    System.out.println("╚────────────────╝");
                    System.out.println("----------------------------");
                    System.out.println("       |___|     |___|      ");
                    System.out.println("        | |       | |       ");
                    System.out.println("        oo0       0oo       ");
    }
}
