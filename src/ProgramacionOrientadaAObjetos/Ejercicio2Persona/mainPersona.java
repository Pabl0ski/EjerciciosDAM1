package ProgramacionOrientadaAObjetos.Ejercicio2Persona;

import java.util.Scanner;

public class mainPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pedir datos por teclado
        System.out.println("Introduce los datos para la primera persona");
        System.out.print("Nombre: ");
        String nombre1 = sc.nextLine();
        System.out.print("Edad: ");
        int edad1 = sc.nextInt();
        System.out.print("Sexo (H/M): ");
        char sexo1 = sc.next().charAt(0);
        System.out.print("Peso (KG): ");
        double peso1 = sc.nextDouble();
        System.out.print("Altura (m): ");
        double altura1 = sc.nextDouble();
        sc.nextLine();

        //crear el primer objeto de Persona con todos los atriburos
        Persona persona1 = new Persona(nombre1, edad1, "", sexo1, peso1, altura1);

        //pedir datos por teclado para el segundo objeto
        System.out.println("Introduce los datos para la segunda persona (sin peso y altura)");
        System.out.print("Nombre: ");
        String nombre2 = sc.nextLine();
        System.out.print("Edad: ");
        int edad2 = sc.nextInt();
        System.out.print("Sexo (H/M): ");
        char sexo2 = sc.next().charAt(0);
        Persona persona2 = new Persona(nombre2, edad2, "", sexo2, 0.0, 0.0);

        //crear tercer obejeto con valores por defecto

        Persona persona3 = new Persona();

        // Introducir valores para el tercer objeto utilizando setters
        System.out.println("\nIntroduce los valores por defecto para la tercera persona: ");
        System.out.print("Nombre: ");
        String nombre3 = sc.nextLine();
        persona3.setNombre(nombre3);
        System.out.print("Edad: ");
        int edad3 = sc.nextInt();
        persona3.setEdad(edad3);
        System.out.print("Sexo (H/M): ");
        char sexo3 = sc.next().charAt(0);
        persona3.setSexo(sexo3);

        // mostrar informacion y comprovar condiciones para cada objeto
        System.out.println("\nInformación de la primera persona:");
        mostrarInformacion(persona1);
        System.out.println("\nInformación de la segunda persona:");
        mostrarInformacion(persona2);
        System.out.println("\nInformación de la tercera persona:");
        mostrarInformacion(persona3);
    }

    //Metodo para mostrar informacion y comprobar condiciones
    public static void mostrarInformacion(Persona persona){
        System.out.println(persona.toString());
        int imc = persona.calcularIMC();
        if (imc==-1){
            System.out.println("Está por debajo de su peso ideal");
        } else if (imc==0) {
            System.out.println("Está en su peso ideal");
        }else System.out.println("Tiene sobrepeso");

        if (persona.esMayorDeEdad()){
            System.out.println("Es mayor de edad");
        }else System.out.println("Es menor de edad");

    }


}
