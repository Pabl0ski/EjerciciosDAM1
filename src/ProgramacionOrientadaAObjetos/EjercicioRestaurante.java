package ProgramacionOrientadaAObjetos;
import java.util.Scanner;

public class EjercicioRestaurante {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Almacen almacen;
            double papas, chocos, mermaPapas, mermaChocos;
            int option;

            almacen = new Almacen(0, 0);

            do {
                System.out.println("\nOpciones:");
                System.out.println("1) Añadir papas");
                System.out.println("2) Mostrar almacén papas");
                System.out.println("3) Añadir chocos");
                System.out.println("4) Mostrar almacén chocos");
                System.out.println("5) Merma de chocos");
                System.out.println("6) Merma de papas");
                System.out.println("7) Número de clientes que puede atender el restaurante");
                System.out.println("8) Salir");
                System.out.print("Ingrese una opción: ");
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("\nIngrese los kilos de papas a añadir:");
                        papas = sc.nextDouble();
                        almacen.setPapas(almacen.getPapas() + papas);
                        break;
                    case 2:
                        System.out.println("\nKilos de papas en el almacén: " + almacen.getPapas());
                        break;
                    case 3:
                        System.out.println("\nIngrese los kilos de chocos a añadir:");
                        chocos = sc.nextDouble();
                        almacen.setChocos(almacen.getChocos() + chocos);
                        break;
                    case 4:
                        System.out.println("\nKilos de chocos en el almacén: " + almacen.getChocos());
                        break;
                    case 5:
                        System.out.println("\nIngrese los kilos de chocos en merma:");
                        mermaChocos = sc.nextDouble();
                        almacen.setChocos(almacen.getChocos() - mermaChocos);
                        break;
                    case 6:
                        System.out.println("\nIngrese los kilos de papas en merma:");
                        mermaPapas = sc.nextDouble();
                        almacen.setPapas(almacen.getPapas() - mermaPapas);
                        break;
                    case 7:
                        System.out.println("\nNúmero de clientes que puede atender el restaurante: " + Almacen.numeroClientes());
                        break;
                    case 8:
                        System.out.println("\nSaliendo...");
                        break;
                    default:
                        System.out.println("\nOpción inválida. Por favor, intente de nuevo.");
                }
            } while (option != 8);

            sc.close();
        }
    }

class Almacen {
    private static double papas;
    private static double chocos;

    public Almacen(double papas, double chocos) {
        this.papas = papas;
        this.chocos = chocos;
    }

    public double getPapas() {
        return papas;
    }

    public void setPapas(double papas) {
        this.papas = papas;
    }

    public double getChocos() {
        return chocos;
    }

    public void setChocos(double chocos) {
        this.chocos = chocos;
    }

    public static double numeroClientes() {
        return papas * 4 / 0.25 + chocos * 4 / 0.25;
    }
}