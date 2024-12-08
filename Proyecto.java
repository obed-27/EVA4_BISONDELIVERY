/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto;

import java.util.Scanner;

/**
 *
 * @author obeds
 */
public class Proyecto {
    
public static String k, jh;
public static int tiempo, aram=0,q=0;// q sirve para ver cuantos productos llevamos y para limitar los productos que llevamos
public static String[] villagran=new String[20];
public static String[] aulas = {"Edificio F", "Edificio E","Edificio D","Edificio C","Edificio B","Edificio G","Centro de computo"};
public static String[] edificios = {"Administrativo","Biblioteca"};   
public static int contadorObservaciones = 0;
public static String[] observaciones = new String[100];
public static String[] chips_s ={"Ruffles", "Fritos", "Rancheritos", "Doritos Nacho", "Doritos Dinamita","Doritos 3D","Doritos Incognita", "Doritos Flamin Hot","Sabritas Original","Sabritas Receta Crujiente Jalapeno", "Sabritas Receta Crujiente Flamin Hot","Papas caseras","Chettos Puffs","Chettos Flamin Hot","Paketaxo Mezcladito", "Paquetaxo Quexo","Paketaxo Botanero", "Paketaxo Flamin Hot", "Cacahuates Japoneses", "Cacahuates Incognita", "Cacahuates Churrumaiz", "Tostitos Salsa Verde", "Tostitos Flamin Hot" };
public static String[] drinks = {"Agua natural chica","Agua natural grande", "Agua de horchata", "Agua de limon", "Mtn Dew","Mtn Dew Raspberry", "Mtn Dew Watermelon","Mtn Dew Pineapple","Coca Cola","Coca Cola Light","Coca Cola Zero", "Pepsi", "Pepsi light","Seven-up","Mirinda","Cafe","Volt","Amper","Red bull",};
public static String[] cookies = {"Oreo", "Chips Ahoy", "Chokis", "Choko Chokis", "Chokis Chocobase", "Chokis Rellena"};
public static String[] meals = {"Boneless BBQ", "Boneless Buffallo", "Hamburguesa", "Torta De Lomo", "Montado De Bisteck", "Chilaquiles", "Sopa De Tortilla"};
public static String[] treats = {"Pelon Pelo Rico", "Hersheys", "Halls", "Dubalin", "Paleta Pinta Azul", "Paleta De Cerveza", "Paleta De Sandia", "Mazapan"};
public static double[] chips_p = {20.0, 18.5, 17.0, 22.0, 22.5, 25.0, 25.5, 25.0, 15.0, 20.0, 20.0, 18.5, 18.0, 20.0, 30.0, 30.5, 30.0, 30.5, 10.5, 12.0, 10.0, 22.5, 22.0};
public static double[] drinks_p = {10.0, 15.5, 20.0, 20.5, 25.0, 30.0, 30.5, 30.0, 20.0, 20.0, 20.0, 18.5,  18.0, 18.0, 18.5, 15.0, 30.5, 30.0, 35.0 }; 
public static double[] cookies_p = {12.5, 13.0, 14.0, 14.5, 15.0, 15.5};
public static double[] meals_p = {50.0, 55.0, 60.0, 45.0, 40.0, 35.0, 30.0};
public static double[] treats_p = {5.0, 10.0, 8.0, 6.0, 5.5, 7.0, 6.5, 10.0};
public static String[] listaO=new String[35];
public static double[] listaP=new double[35] ;

public static void main(String[] args) {
Aplicacion();
}

//inicio de aplicacion

public static void Aplicacion () {
    
    int opcion=1;//el bucle del while
    
    Scanner scanner = new Scanner(System.in);

    while (opcion!=3) {//la aplicacion de opcion si es igual a dos no se corre
    
        System.out.println("===== BISON-DELIVERY =====");

        System.out.println("1. Acceder como cliente");
        
        System.out.println("2. Acceder como empleado");
        
        System.out.println("3. Salir");
        
        System.out.print("Seleccione una opción: ");
        
        opcion = scanner.nextInt();

            switch (opcion) {
        
                case 1 -> menu();
                
                case 2 -> iniciarSesion();
                
                case 3 ->
                
                {
                
                    System.out.println("Saliendo de la aplicación...");
                    
                    return;
                    
                }
            
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            
            }
        
    }
    
}

//inicio de sesion de usuario

public static void iniciarSesion() {

    Scanner scanner = new Scanner(System.in);

    String[][] usuarios = {//es una tabla de 3x3 con la informacion de cada usuario (un tik tak tou de usuarios)

        {"admin", "admin123", "Administrador"},
        
        {"repartidor", "repartidor123", "Repartidor"}
            
        //usuarios registrados
            
    };
    
    while (true) { 
    
        System.out.println("===== INICIO DE SESIÓN =====");
        
        System.out.print("Usuario: ");
        
        String usuario = scanner.nextLine();
        
        System.out.print("Contraseña: ");
        
        String contrasena = scanner.nextLine();

        for (String[] u : usuarios) {//u es para alnlizar a los usuarios que son validos si esto no es correcto no corre
        
            if (u[0].equals(usuario) && u[1].equals(contrasena)) { //equals es un igual para las palabras 
            
                System.out.println("Inicio de sesión exitoso como " + u[2]);

                switch (u[2]) {
                
                    case "Administrador" -> menuAdministrador();
                    
                    case "Repartidor" -> menuRepartidor();
                
                }

                return;
            
            }
        
        }

        System.out.println("Credenciales incorrectas. Intente de nuevo.");

    }

}

//menu del cliente 

public static void menu(){

    int eleccion; 
    
    Scanner mtr = new Scanner(System.in);

    System.out.println("elija sus productos");
    
    for (int i = 0; i < listaO.length; i++) {

        listaO[i] = " ";
        
        listaP[i] = 0.0;
        
        //tener la listas de precios y productos en 0
        
    }
    
    do {

        System.out.println("Opciones disponibles:");
        
        System.out.println("1. Papas");
        
        System.out.println("2. Bebidas");
        
        System.out.println("3. Galletas");
        
        System.out.println("4. Comida preparada");
        
        System.out.println("5. Dulces");
        
        System.out.println("6. Ver carrito");
        
        System.out.println("7. Eliminar producto del carrito");
        
        System.out.println("8. agrregar observaciones ");
        
        System.out.println("9. Salir y mostrar ticket");
        
        eleccion = mtr.nextInt();

            switch (eleccion) {
        
                case 1 -> q = procesarCompra(mtr, chips_s, chips_p, listaO, listaP, q);
                
                case 2 -> q = procesarCompra(mtr, drinks, drinks_p, listaO, listaP, q);
                
                case 3 -> q = procesarCompra(mtr, cookies, cookies_p, listaO, listaP, q);
                
                case 4 -> q = procesarCompra(mtr, meals, meals_p, listaO, listaP, q);
                
                case 5 -> q = procesarCompra(mtr, treats, treats_p, listaO, listaP, q);
                
                //todos los anteriores mandan al procesar compra que analiza el nombre del arreglo marcado para deciir si son papas, bebidas, galletas, comidas preparadas o dulceses
                
                case 6 -> mostrarCarrito(q);
                
                case 7 -> q = eliminarProducto(mtr, q);
                
                case 8 -> agregarObservacion();
                
                //agrega observaciones sobre el pedido realizado 
                
                case 9 -> {
                
                    imprimirTicket(q);
                    
                    System.out.println("Gracias por usar bisonDelivery.");informacion();
                
                }
                
                default -> System.out.println("Opción inválida. Intenta de nuevo.");
            
            }
            
        } while (eleccion != 8);
     
    for (int i = 0; i < q; i++) {
    
        if (!listaO[i].equals(" ")) {

            System.out.println(listaO[i] + " - $" + listaP[i]);
            
        }
        
    }
    
}

//eleccion de tu compra

    public static int procesarCompra(Scanner mtr, String[] productos, double[] precios, String[] listaO, double[] listaP, int q) {

        System.out.println("Seleccione un producto:");

        for (int i = 0; i < productos.length; i++) {

            System.out.println(i + ". " + productos[i] + " - $" + precios[i]);

        }
        
        //un bucle para mostrar los productos

        int subeleccion = mtr.nextInt();

        if (subeleccion >= 0 && subeleccion < productos.length) {

            double costo = precios[subeleccion];

            listaO[q] = productos[subeleccion];
            
            listaP[q] = costo;
            
            q++;
            
            System.out.println("Compra realizada: " + productos[subeleccion] + " - $" + costo);
            
            //muestra el producto elegido
        
        } else {
        
            System.out.println("Selección inválida.");
        
        }
        
        for (int i = 0; i < q; i++) {
        
            if (!listaO[i].equals(" ")) {
            
                System.out.println((i + 1) + ". " + listaO[i] + " - $" + listaP[i]);
                
                //muestra la lista de lo que lleva el carrito
            
            }
        
        }

        return q;
    
    }
    
    //mostrar carrito
    
    public static void mostrarCarrito(int q) {
    
        System.out.println("Carrito de compras:");
        
        double total = 0.0;
        
        for (int i = 0; i < q; i++) {
        
            if (!listaO[i].equals(" ")) {
            
                System.out.println((i + 1) + ". " + listaO[i] + " - $" + listaP[i]);
                
                total += listaP[i];
            
            }
            
        }
        
        System.out.println("Total gastado: $" + total);
        
        //muestra todo lo que llevamos mas el dinero gastado
    
    }
    
    //eliminar al producto deseado
    
    public static int eliminarProducto(Scanner mtr, int q) {
    
        mostrarCarrito(q);
        
        System.out.println("Seleccione el número del producto a eliminar:");
        
        int eliminar = mtr.nextInt();

        if (eliminar > 0 && eliminar <= q) {

            System.out.println("Producto eliminado: " + listaO[eliminar - 1]);

            for (int i = eliminar - 1; i < q - 1; i++) {

                listaO[i] = listaO[i + 1];

                listaP[i] = listaP[i + 1];

            }
            
            //recorremos desede el producto que elegimos eliminar hasta que todos los prductos de adelante se recorran 

            listaO[q - 1] = " ";

            listaP[q - 1] = 0.0;

            q--;

        } else {

            System.out.println("Selección inválida.");

        }

        mostrarCarrito(q);

        return q;

    }
    
    //imprimir primer ticket
    
    public static void imprimirTicket(int q) {

        System.out.println("========== TICKET DE COMPRA ==========");
    
        double total = 0.0, repartidor;
    
        for (int i = 0; i < q; i++) {
        
            if (!listaO[i].equals(" ")) {
            
                System.out.println((i + 1) + ". " + listaO[i] + " - $" + listaP[i]);
            
                total += listaP[i];
        }
    }
    repartidor=total*.10;
    
    
            
    
    repartidor=total+repartidor;
    System.out.println("Total gastado: $" + total);
    System.out.println("Mas el porcentaje del repartidor es: $" + repartidor);
    System.out.println("=======================================");
}
    
    //menu de las opcciones del administrador
    
public static void menuAdministrador() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("===== MENÚ ADMINISTRADOR =====");
            System.out.println("1. Ver productos y precios");
            System.out.println("2. Cambiar nombre de producto");
            System.out.println("3. Cambiar precio de producto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1 -> {verProductos();}
                case 2 -> {cambiarNombreProducto();}
                case 3 -> {cambiarPrecioProducto();}
                case 4 -> {System.out.println("¡Hasta luego!");Aplicacion();}
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

//lista de todos los productos 

    public static void verProductos() {
        System.out.println("===== PRODUCTOS DISPONIBLES =====");
        System.out.println("papas:");
        for (int i = 0; i < chips_s.length; i++) {
            System.out.println(i + ". " + chips_s[i] + " - $ " + chips_p[i]);
        }

        System.out.println("Bebidas:");
        for (int i = 0; i < drinks.length; i++) {
            System.out.println(i + ". " + drinks[i] + " - $ " + drinks_p[i]);
        }
        System.out.println("galletas");
        for (int i = 0; i < cookies.length; i++) {
            System.out.println(i + ". " + cookies[i] + " - $ " + cookies_p[i]);
        }
        System.out.println("comidas preparadas");
        for (int i = 0; i < meals.length; i++) {
            System.out.println(i + ". " + meals[i] + " - $ " + meals_p[i]);
        }
        System.out.println("dulce");
        for (int i = 0; i < treats.length; i++) {
            System.out.println(i + ". " + treats[i] + " - $ " + treats_p[i]);
        }
    }
    
    //cambia el nombre del producto deseado
    
    public static void cambiarNombreProducto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de producto para cambiar nombre:");
        System.out.println("1. papas");
        System.out.println("2. Bebidas");
        System.out.println("3. galletas");
        System.out.println("4. comidas preparadas");
        System.out.println("5. dulces");
        int tipo = scanner.nextInt();
        scanner.nextLine();
        switch (tipo) {
            case 1 -> {
                System.out.println("Seleccione el número del producto de papas para cambiar el nombre:");
                for (int i = 0; i < chips_s.length; i++) {
                    System.out.println(i + ". " + chips_s[i]);
                }
                int producto = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Ingrese el nuevo nombre del producto: ");
                String nuevoNombre = scanner.nextLine();
                chips_s[producto] = nuevoNombre;
                System.out.println("El nombre del producto ha sido cambiado a: " + nuevoNombre);
                for (int i = 0; i < chips_s.length; i++) {
                    System.out.println(i + ". " + chips_s[i]);
                }
            }
            case 2 -> {
                System.out.println("Seleccione el número del producto de bebidas para cambiar el nombre:");
                for (int i = 0; i < drinks.length; i++) {
                    System.out.println(i + ". " + drinks[i]);
                }
                int producto = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Ingrese el nuevo nombre del producto: ");
                String nuevoNombre = scanner.nextLine();
                drinks[producto] = nuevoNombre;
                System.out.println("El nombre del producto ha sido cambiado a: " + nuevoNombre);
                for (int i = 0; i < drinks.length; i++) {
                    System.out.println(i + ". " + drinks[i]);
                }
            }
            case 3 -> {
                System.out.println("seleccione el numero del producto de galletas para cambiar el nombre: ");
                for (int i = 0; i < cookies.length; i++) {
                    System.out.println(i + ". " + cookies[i]);
                }
                int producto = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Ingrese el nuevo nombre del producto: ");
                String nuevoNombre = scanner.nextLine();
                cookies[producto] = nuevoNombre;
                System.out.println("El nombre del producto ha sido cambiado a: " + nuevoNombre);
                for (int i = 0; i < cookies.length; i++) {
                    System.out.println(i + ". " + cookies[i]);
                }
            }
            case 4 -> {
                System.out.println("Seleccione el número del producto de comida preparada para cambiar el nombre:");
                for (int i = 0; i < meals.length; i++) {
                    System.out.println(i + ". " + meals[i]);
                }
                int producto = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Ingrese el nuevo nombre del producto: ");
                String nuevoNombre = scanner.nextLine();
                meals[producto] = nuevoNombre;
                System.out.println("El nombre del producto ha sido cambiado a: " + nuevoNombre);
                for (int i = 0; i < meals.length; i++) {
                    System.out.println(i + ". " + meals[i]);
                }
            }
            case 5 -> {
                System.out.println("seleccione el numero del producto de dulces para cambiar el nombre: ");
                for (int i = 0; i < treats.length; i++) {
                    System.out.println(i + ". " + treats[i]);
                }
                int producto = scanner.nextInt();
                
                scanner.nextLine();
                
                System.out.print("Ingrese el nuevo nombre del producto: ");
                
                String nuevoNombre = scanner.nextLine();
                
                treats[producto] = nuevoNombre;
                
                System.out.println("El nombre del producto ha sido cambiado a: " + nuevoNombre);
                for (int i = 0; i < treats.length; i++) {
                    System.out.println(i + ". " + treats[i]);
                }
            }
            default -> {
                
            System.out.println("Opción no válida.");
            }
        }
    }
    
    //cambiar el precio del producto deseado
    
    public static void cambiarPrecioProducto() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seleccione el tipo de producto para cambiar el precio:");
        
        System.out.println("1. Chips");
        
        System.out.println("2. Bebidas");
        
        System.out.println("3. galletas");
        
        System.out.println("4. comidas preparadas");
        
        System.out.println("5. dulces");
        
        int tipo = scanner.nextInt();
        
        scanner.nextLine();
        
        switch (tipo) {
            
            case 1 -> {
                System.out.println("Seleccione el número del producto de chips para cambiar el precio:");
                
                for (int i = 0; i < chips_p.length; i++) {
                    
                    System.out.println(i + ". " + chips_s[i] + " - $ " + chips_p[i]);
                }
                int producto = scanner.nextInt();
                
                scanner.nextLine();
                
                System.out.print("Ingrese el nuevo precio del producto: ");
                
                double nuevoPrecio = scanner.nextDouble();
                
                chips_p[producto] = nuevoPrecio;
                
                System.out.println("El precio del producto ha sido cambiado a: $ " + nuevoPrecio);
            }
            case 2 -> {
                System.out.println("Seleccione el número del producto de bebidas para cambiar el precio:");
                
                for (int i = 0; i < drinks_p.length; i++) {
                    
                    System.out.println(i + ". " + drinks[i] + " - $ " + drinks_p[i]);
                }
                int producto = scanner.nextInt();
                
                scanner.nextLine(); 
                
                System.out.print("Ingrese el nuevo precio del producto: ");
                
                double nuevoPrecio = scanner.nextDouble();
                
                drinks_p[producto] = nuevoPrecio;
                
                System.out.println("El precio del producto ha sido cambiado a: $ " + nuevoPrecio);
            }
            case 3 ->{
                System.out.println("Seleccione el número del producto de galletas para cambiar el precio:");
                
                for (int i = 0; i < cookies_p.length; i++) {
                    
                    System.out.println(i + ". " + cookies[i] + " - $ " + cookies_p[i]);
                }
                int producto = scanner.nextInt();
                
                scanner.nextLine(); 
                
                System.out.print("Ingrese el nuevo precio del producto: ");
                
                double nuevoPrecio = scanner.nextDouble();
                
                cookies_p[producto] = nuevoPrecio;
                
                System.out.println("El precio del producto ha sido cambiado a: $ " + nuevoPrecio);
            }
            case 4 ->{
                
                System.out.println("Seleccione el número del producto de comidas preparadas para cambiar el precio:");
                
                for (int i = 0; i < meals_p.length; i++) {
                    
                    System.out.println(i + ". " + meals[i] + " - $ " + meals_p[i]);
                }
                int producto = scanner.nextInt();
                
                scanner.nextLine(); 
                
                System.out.print("Ingrese el nuevo precio del producto: ");
                
                double nuevoPrecio = scanner.nextDouble();
                        
                meals_p[producto] = nuevoPrecio;
                
                System.out.println("El precio del producto ha sido cambiado a: $ " + nuevoPrecio);
            }
            case 5 -> {
                
                System.out.println("Seleccione el número del producto de galletas para cambiar el precio:");
                
                for (int i = 0; i < treats_p.length; i++) {
                    
                    System.out.println(i + ". " + treats[i] + " - $ " + treats_p[i]);
                }
                int producto = scanner.nextInt();
                
                scanner.nextLine(); 
                
                System.out.print("Ingrese el nuevo precio del producto: ");
                
                double nuevoPrecio = scanner.nextDouble();
                
                treats_p[producto] = nuevoPrecio;
                
                System.out.println("El precio del producto ha sido cambiado a: $ " + nuevoPrecio);
            }
            default -> System.out.println("Opción no válida.");
        }
    }
    
    //menu del repartidor con sus elecciones
    
    public static void menuRepartidor() {
        
    Scanner scanner = new Scanner(System.in);
    
    int opcion;

    do {
        
        System.out.println("===== MENÚ REPARTIDOR =====");
        
        System.out.println("1. Ver ticket de pedido");
        
        System.out.println("2. Marcar pedido como en proceso");
        
        System.out.println("3. Marcar pedido como entregado");
        
        System.out.println("4. VER OBSERVACIONES");
        
        System.out.println("5. Salir");
        
        System.out.print("Seleccione una opción: ");
        
        opcion = scanner.nextInt();
        
        scanner.nextLine(); 

        switch (opcion) {
            
            case 1 -> {ticketFinalR();}
            
            case 2 -> {marcarEnProceso();}
            
            case 3 -> {marcarEntregado();}
            
            case 4 -> verObservaciones();
            
            case 5 -> {System.out.println("¡Hasta luego!");Aplicacion();}
            
            default -> System.out.println("Opción no válida. Intente de nuevo.");
        }
    } while (opcion != 5);
}

    //muestra la primera parte del ticket
    
public static void verTicket() {
    
    System.out.println("========== TICKET DE PEDIDO ==========");
    
    double total = 0.0, ganancia;
    
    for (int i = 0; i < listaO.length; i++) {
        
        if (!listaO[i].equals(" ")) {
            
            System.out.println((i + 1) + ". " + listaO[i] + " - $" + listaP[i]);
            
            total += listaP[i];
        }
    }
    ganancia=total*.10;
    System.out.println("Total del pedido: $" + total);
    System.out.println("Mas la parte del repartidor es: $"+ganancia);
    System.out.println("=======================================");
}

//marcar el pedido en proceso

public static void marcarEnProceso() {   

    System.out.println("El pedido ha sido marcado como EN PROCESO.");

}

//marcar el pedido  como entregado

public static void marcarEntregado() {
    
    System.out.println("El pedido ha sido marcado como ENTREGADO.");

}

//agregar observaciones delpedido

public static void agregarObservacion() {
        if (contadorObservaciones < observaciones.length) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese su observación para el pedido: ");
            String observacion = scanner.nextLine();
            observaciones[contadorObservaciones] = observacion; // Guardar en el arreglo
            contadorObservaciones++;
            System.out.println("Observación agregada: " + observacion);
            menu();
        } else {
            System.out.println("No se pueden agregar más observaciones. El límite ha sido alcanzado.");
        }
    }

//mostrar las observaciones  del pedido

public static void verObservaciones() {
        System.out.println("========== OBSERVACIONES ==========");
        if (contadorObservaciones == 0) {
            System.out.println("No hay observacio1nes registradas.");
        } else {
            for (int i = 0; i < contadorObservaciones; i++) {
                System.out.println((i + 1) + ". " + observaciones[i]);
            }
        }
        System.out.println("====================================");
    }

//pide las ultimas partes del producto

public static void informacion(){
    Scanner scanner = new Scanner(System.in);
    int opcion;
    while(true){
         System.out.println("===== INFORMACION =====");
            System.out.println("1. NOMBRE");
            System.out.println("2. UBICACION");
            System.out.println("3. FORMA DE PAGO");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> cliente();
                case 2 -> ubicacion();
                case 3 -> forma_de_pago();
                case 4 ->
                    {
                    System.out.println("Saliendo...");ticketFinal();
                    return;                    
                }
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }
    }    
}

//nombre del cliente 

    public static void cliente(){
        Scanner mtr = new Scanner(System.in);
        System.out.print("Inserta tu nombre: ");
        villagran[aram]=mtr.nextLine();
        aram+=1;
    }
    
    //ubicacion del cliente
    
    public static void ubicacion() {
        int opcion;
        Scanner mtr = new Scanner(System.in);
        System.out.println("1. Ver Edificios");
        System.out.println("2. Ver Aulas");
        System.out.println("3. Salir");
        do {
            opcion = mtr.nextInt();
            switch (opcion) {
                case 1 -> {seleccionarEdificio(); opcion=3;}// Seleccionar un edificio
                case 2 -> {seleccionarAula(); opcion=3;} // Seleccionar un aula
                case 3 -> {
                    System.out.println("Saliendo...");
                    informacion();  // Volver al menú principal
                }
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 3);
    }
    
    //formas disponibles de pago
    
    public static void forma_de_pago(){
        Scanner mtr = new Scanner(System.in);
        int eleccion;
        do{
            System.out.println("1. Pago en efectivo");
            System.out.println("2. Pago en transferecnia");
            eleccion=mtr.nextInt();
        switch (eleccion){
            case 1 -> {
                jh="pago en efectivo";
                System.out.println("tu metodo seleccionado a sido "+jh);
                informacion();
            }
            case 2 -> {
                jh="pago con tarjeta";
                System.out.println("tu metodo seleccionado a sido "+jh);
                informacion();
            }
            default -> {
                System.out.println("Opción inválida. Intente de nuevo.");
                
            }
        }
        }while (eleccion!=4);
    }
    
    //mostrar aulas disponibles
    
    public static void aula(String edificio) {
        System.out.println("\nAulas en el " + edificio + ":");
        for (String aula : aulas) {
            System.out.println(edificio + " - " + aula);
        }
    }
    
    //seleccionar edificio deseado
    
    public static void seleccionarEdificio() { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione un edificio:");
        for (int i = 0; i < edificios.length; i++) {
            System.out.println((i + 1) + ". " + edificios[i]);
        }
        int opcion = scanner.nextInt();
        k=edificios[opcion-1];
    }
    
    //seleccionar el aula deseada
    
    public static void seleccionarAula() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione un aula:");
        for (int i = 0; i < aulas.length; i++) {
            System.out.println((i + 1) + ". " + aulas[i]);
        }
        int opcion = scanner.nextInt();
        if (opcion >= 1 && opcion <= aulas.length) {
            System.out.println("Has seleccionado " + aulas[opcion - 1]);
            k=aulas[opcion-1];
        } else {
            System.out.println("Opción inválida. Intente de nuevo.");
        }
    }
    
    //mostrar ticket final
    
    public static void ticketFinal() {
        Scanner mtr = new Scanner(System.in);
        System.out.println("==============================================");
        imprimirTicket(q);
        if (aram > 0) {
            System.out.println("Cliente: " + villagran[aram - 1]);
        } else {
            System.out.println("No se ha registrado ningún cliente.");
        }
        System.out.print("Ubicacion:");
        System.out.println(k);
        System.out.println("el metodo de pago sera: "+jh);
        System.out.println("==============================================");
        mtr.nextLine();
        Aplicacion();
    }
    public static void ticketFinalR() {
        Scanner mtr = new Scanner(System.in);
        System.out.println("==============================================");
        imprimirTicket(q);
        if (aram > 0) {
            System.out.println("Cliente: " + villagran[aram - 1]);
        } else {
            System.out.println("No se ha registrado ningún cliente.");
        }
        System.out.print("Ubicacion:");
        System.out.println(k);
        System.out.println("el metodo de pago sera: "+jh);
        System.out.println("==============================================");
        mtr.nextLine();
        menuRepartidor();
    }
}