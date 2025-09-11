package programacion.estructurada;

import java.util.Scanner;

public class ProgramacionEstructurada {

    public static void main(String[] args) {
        // Elige qué ejercicio ejecutar descomentando uno
        //ejercicio1(args);
        //ejercicio2(args);
        //ejercicio3(args);
        //ejercicio4(args);
        //ejercicio5(args);
        //ejercicio6(args);
        //ejercicio7(args);
        //ejercicio8(args);
        //ejercicio9(args);
        //ejercicio10(args);
        //ejercicio11(args);
        //ejercicio12(args);
        ejercicio13(args);
    }

    // ==================== EJERCICIO 1 ====================
    public static void ejercicio1(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Escriba aqui un año: ");
        int anio = input.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println(anio + " es un año bisiesto");
        } else {
            System.out.println(anio + " no es un año bisiesto");
        }
    }

    // ==================== EJERCICIO 2 ====================
    public static void ejercicio2(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = input.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = input.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        int num3 = input.nextInt();

        int mayor;

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        System.out.println(mayor + " es el mayor número");
    }

    // ==================== EJERCICIO 3 ====================
    public static void ejercicio3(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();

        if (edad < 12) {
            System.out.println("Niño");
        } else if (edad <= 17) {
            System.out.println("Adolescente");
        } else if (edad <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto mayor");
        }
    }

    // ==================== EJERCICIO 4 ====================
    public static void ejercicio4(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese precio: ");
        double precio = input.nextDouble();

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String categoria = input.next().toUpperCase();

        double descuento = 0;
        double precioFinal = precio;

        if (categoria.equals("A")) {
            descuento = 0.10;
        } else if (categoria.equals("B")) {
            descuento = 0.15;
        } else if (categoria.equals("C")) {
            descuento = 0.20;
        } else {
            System.out.println("Categoría inválida. No se aplica descuento.");
        }

        precioFinal = precio - (precio * descuento);

        System.out.println("Precio original: $" + precio);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: $" + precioFinal);
    }

    // ==================== EJERCICIO 5 ====================
    public static void ejercicio5(String[] args) {
        Scanner input = new Scanner(System.in);

        int sumPares = 0;
        System.out.print("Ingrese un número (0 para terminar): ");
        int num = input.nextInt();

        while (num != 0) {
            if (num % 2 == 0) {
                sumPares += num;
            }
            System.out.print("Ingrese un número (0 para terminar): ");
            num = input.nextInt();
        }

        System.out.println("La suma de los números pares es: " + sumPares);
    }

    // ==================== EJERCICIO 6 ====================
    public static void ejercicio6(String[] args) {
        Scanner input = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int num = input.nextInt();

            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }

    // ==================== EJERCICIO 7 ====================
    public static void ejercicio7(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = input.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente.");
    }

    // ==================== EJERCICIO 8 ====================
    public static void ejercicio8(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = input.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje: ");
        double impuesto = input.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje: ");
        double descuento = input.nextDouble();

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("El precio final del producto es: " + precioFinal);
    }

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double impuestoDecimal = impuesto / 100;
        double descuentoDecimal = descuento / 100;
        return precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
    }

    // ==================== EJERCICIO 9 ====================
    public static void ejercicio9(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = input.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = input.nextDouble();
        input.nextLine();

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = input.nextLine();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }

    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            return 0;
        }
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    // ==================== EJERCICIO 10 ====================
    public static void ejercicio10(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = input.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = input.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = input.nextInt();

        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    // ==================== EJERCICIO 11 ====================
    static double DESCUENTO_GLOBAL = 0.10;

    public static void ejercicio11(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();

        double descuentoAplicado = precio * DESCUENTO_GLOBAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    // ==================== EJERCICIO 12 ====================
    public static void ejercicio12(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }

    // ==================== EJERCICIO 13 ====================
    public static void ejercicio13(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        mostrarPrecios(precios, 0);

        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        mostrarPrecios(precios, 0);
    }

    public static void mostrarPrecios(double[] precios, int index) {
        if (index < precios.length) {
            System.out.println("Precio: $" + precios[index]);
            mostrarPrecios(precios, index + 1);
        }
    }
}
