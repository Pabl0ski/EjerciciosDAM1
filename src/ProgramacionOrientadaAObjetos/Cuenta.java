package ProgramacionOrientadaAObjetos;

import java.util.Scanner;

import java.util.Scanner;

class Cuenta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de la cuenta 1:");
        String numero1 = scanner.nextLine();
        System.out.println("Ingrese el nombre del titular de la cuenta 1:");
        String titular1 = scanner.nextLine();
        System.out.println("Ingrese el saldo inicial de la cuenta 1:");
        double saldo1 = scanner.nextDouble();
        scanner.nextLine(); // Consume el salto de línea
        Cuenta cuenta1 = new Cuenta(numero1, titular1, saldo1);

        System.out.println("Ingrese el número de la cuenta 2:");
        String numero2 = scanner.nextLine();
        System.out.println("Ingrese el nombre del titular de la cuenta 2:");
        String titular2 = scanner.nextLine();
        System.out.println("Ingrese el saldo inicial de la cuenta 2:");
        double saldo2 = scanner.nextDouble();
        scanner.nextLine(); // Consume el salto de línea
        Cuenta cuenta2 = new Cuenta(numero2, titular2, saldo2);

        int opcion;
        do {
            System.out.println("\nMenú de operaciones:");
            System.out.println("1. Ingresar dinero en la cuenta 1");
            System.out.println("2. Retirar dinero de la cuenta 1");
            System.out.println("3. Transferir dinero de la cuenta 1 a la cuenta 2");
            System.out.println("4. Salir");
            System.out.println("Ingrese la opción deseada:");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consume el salto de línea

            String mensaje;
            Cuenta destino = null;
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad a ingresar en la cuenta 1:");
                    double cantidad1 = scanner.nextDouble();
                    mensaje = cuenta1.ingresar(cantidad1);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a retirar de la cuenta 1:");
                    double cantidad2 = scanner.nextDouble();
                    mensaje = cuenta1.retirar(cantidad2);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a transferir de la cuenta 1 a la cuenta 2:");
                    double cantidad3 = scanner.nextDouble();
                    destino = cuenta2;
                    mensaje = cuenta1.transferir(destino, cantidad3);
                    break;
                case 4:
                    mensaje = "Saliendo...";
                    break;
                default:
                    mensaje = "Opción inválida.";
            }
            System.out.println(mensaje);
        } while (opcion != 4);

        scanner.close();
    }
    private String numero;
    private String titular;
    private double saldo;

    public Cuenta(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String ingresar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;        return "Ingreso realizado correctamente. Nuevo saldo: " + this.saldo;
        } else {
            return "Error: La cantidad a ingresar debe ser mayor a 0.";
        }
    }

    public String retirar(double cantidad) {
        if (cantidad > 0 && this.saldo >= cantidad) {
            this.saldo -= cantidad;
            return "Retiro realizado correctamente. Nuevo saldo: " + this.saldo;
        } else {
            return "Error: La cantidad a retirar debe ser mayor a 0 y menor o igual al saldo.";
        }
    }

    public String transferir(Cuenta destino, double cantidad) {
        if (cantidad > 0 && this.saldo >= cantidad) {
            this.saldo -= cantidad;
            destino.saldo += cantidad;
            return "Transferencia realizada correctamente. Nuevo saldo: " + this.saldo + ". Nuevo saldo en la cuenta destino: " + destino.saldo;
        } else {
            return "Error: La cantidad a transferir debe ser mayor a 0 y menor o igual al saldo.";
        }
    }

    public String getSaldo(Cuenta destino) {
        return "Saldo de la cuenta 1: " + this.saldo + ". Saldo de la cuenta 2: " + destino.saldo;
    }

}


