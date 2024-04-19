import java.util.Scanner;

public class EjerciciosArrays1to8 {
    public static void main(String[] args) {
        System.out.println("*_*_*_*_*_*_ Ejercicios Arrays 1-->8 _*_*_*_*_*_*");
        Scanner sc = new Scanner(System.in);
        int opcion;  //opcion es la entrada del usuario para elegir el ejercicio que quiere ejecutar
        final int NUM_EJERCICIOS = 8+1;
        final String MENSAJE_DESPEDIDA = "ADIÓS";
        final String MENSAJE_OPCION_ERROR = "Esa opción no existe. Por favor, introduzca una correcta.";
        //final: hace que las variables sean constantes y no se puedan modificar, solo inicializar o utilizar

        do {
            System.out.println("Elige ejercicio:");
            mostrarMenu(NUM_EJERCICIOS); //mostramos el menú de opciones

            System.out.print("----- Opcion: ");
            opcion = sc.nextInt(); //opcion es la entrada del usuario para elegir el ejercicio que quiere ejecutar
            switch (opcion) {
                case 1 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio1(sc);
                }
                case 2 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio2(sc);
                }
                case 3 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio3(sc);
                }
                case 4 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio4(sc);
                }
                case 5 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio5(sc);
                }
                case 6 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio6(sc);
                }
                case 7 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio7(sc);
                }
                case 8 ->{
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio8(sc);
                }

                case 0 -> System.out.println(MENSAJE_DESPEDIDA);
                default -> System.out.println(MENSAJE_OPCION_ERROR);
            }
        } while (opcion != 0);

    }
    private static String mostrarTituloEjercicio(int opcion) {
        return "****** EJERCICIO " + opcion + " ****** ";
        //las dos líneas anteriores también puede ponerse así:
        //  return "****** EJERCICIO "+opcion+" ****** ";
    }
    private static void mostrarMenu(int NUM_EJERCICIOS) {
        for (int i = 1; i < NUM_EJERCICIOS; i++) {
            System.out.println(i + ". Ejercicio " + i);
        }
        System.out.println("0. Salir");
    }

    private static int[]  leeArrayInt (Scanner sc, int longitud){
        int[] numeros = new int[longitud];
        //leemos los numeros con bucles
        System.out.println("Introduce "+ longitud+" numeros enteros segun te lo pida");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("siguiente numero");
            numeros[i]= sc.nextInt();
        }
        return numeros;
    }

    /*
    Funciones con los ejercicios a continuacion:
     */

    private static void ejercicio1(Scanner sc) {
        System.out.println("Ejercicio1:- Leer 5 números y mostrarlos en el mismo orden introducido. ");
        int[] unArray = new int[5];
        for(int i = 0; i < unArray.length; i++) {
            int num= sc.nextInt();
            unArray[i]=num;
        }
        System.out.println("Tus valores son los siguientes:");
        for(int i : unArray){
            System.out.println(i);
        }
    }

    private static void ejercicio2 (Scanner sc){
        System.out.println("Ejercicio2:- Leer 5 números y mostrarlos en orden inverso al introducido. ");
        int[] unArray = new int[5];
        for(int i = 0; i < unArray.length; i++) {
            int num= sc.nextInt();
            unArray[i]=num;
        }
        System.out.println("Tus valores en orden inverso:");
        System.out.println(unArray[4]+"\n"+unArray[3]+"\n"+unArray[2]+"\n"+unArray[1]+"\n"+unArray[0]);
    }

    private static void ejercicio3(Scanner sc){
        System.out.println("Ejercicio3: Crea un programa que pida diez números reales por teclado," +
                " los almacene en un array, y luego lo recorra para averiguar el máximo y mínimo" +
                " y mostrarlos por pantalla.");
        double[] numeros = new double[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escribe el numero "+(i+1)+":");
            numeros[i]= sc.nextDouble();
        }

        double max = numeros[0];
        double min = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>max){
                max=numeros[i];
            }
            if (numeros[i]<min){
                min = numeros[i];
            }
        }
        System.out.println("El maximo es: "+max);
        System.out.println("El minimo es: "+min);
    }

    private static void ejercicio4 (Scanner sc){
        System.out.println("Ejercicio4:- Crea un programa que pida veinte números enteros por teclado," +
                " los almacene en un array y luego muestre por separado" +
                " la suma de todos los valores positivos y negativos. ");
        double[] numeros = new double[20];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escribe el numero "+(i+1)+":");
            numeros[i]= sc.nextDouble();
        }

        int sumaPositivos=0;
        int sumaNegativos=0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
            }

        }
        System.out.println("La suma de todos los valores positivos es: " + sumaPositivos);
        System.out.println("La suma de todos los valores negativos es: " + sumaNegativos);
    }

    private static void ejercicio5 (Scanner sc){
        System.out.println("- Leer 10 números por teclado y a continuación realizar la media de los números positivos," +
                " la media de los negativos y contar el número de ceros.");
        double[] numeros = new double[10];
        int contadorPositivos=0;
        int contadorNegativos=0;
        int contadorCEROS=0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escribe el numero " + (i + 1) + ":");
            numeros[i] = sc.nextDouble();
            if (numeros[i]==0){
                contadorCEROS++;
            }
            else if (numeros[i]>0) {
                contadorPositivos++;
            }
            else if (numeros[i]<0) {
                contadorNegativos++;
            }
        }

        int mediaPositivos;
        int sumaPositivos=0;

        int mediaNegativos;
        int sumaNegativos=0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
            }
        }
        mediaPositivos=sumaPositivos/contadorPositivos;
        mediaNegativos=sumaNegativos/contadorNegativos;

        System.out.println("La media de los numeros positivos es: "+mediaPositivos+" " +
                "\nLa media de los numeos negativos es: "+mediaNegativos+" "+
                "\nLa cantidad de 0 introducida es de: "+contadorCEROS);
    }

    private static void ejercicio6 (Scanner sc){
        System.out.println("- Leer 10 números enteros. Debemos mostrarlos en el siguiente orden:" +
                " el primero, el último, el segundo, el penúltimo, el tercero, el antepenúltimo, el cuarto, etc." +
                " Deberá funcionar siempre con Arrays de tamaño par, es decir, si el array que se crea es de 100 números," +
                " el código debería funcionar.");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Ingrese un número entero: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros en el orden solicitado:");
        for (int i = 0; i < numbers.length / 2; i++) {
            System.out.println((i * 2 + 1) + ": " + numbers[i * 2]);
            System.out.println((i * 2 + 2) + ": " + numbers[numbers.length - i * 2 - 1]);
        }
    }

    private static void ejercicio7 (Scanner sc){
        System.out.println("Crear dos Arrays de 5 números enteros cada uno. Rellenarlo con números cualesquiera." +
                " Mezclarlos en un tercer array de la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc." +
                " Muestra el contenido del tercer array.");
        int[] arrayA = new int[5];
        int[] arrayB = new int[5];
        int[] arrayC = new int[arrayA.length + arrayB.length];

        System.out.println("Escribe los 5 numeros para el Array A");
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i]=sc.nextInt();
        }

        System.out.println("Escribe los 5 numeros para el Array B");
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i]=sc.nextInt();
        }

        for (int i = 0, j = 0; i <arrayC.length; i = i + 2, j++) {
            arrayC[i]=arrayA[j];
            arrayC[i+1]=arrayB[j];
            //cojo de arrayA cuando i es par, en los impares cojo del arrayB
            //en cada bloque avanzo una vez el indice de arrayA y arrayB
        }

        //solucino del profe (variables contador para cada array)
        /*
        int i1=0, i2=0;
        for (int i = 0; i < arrayC.length; i++) {
            if (i%2==0){
                arrayB[i]=arrayA[i1];
                i1++;
            }else {
                arrayC[i]=arrayB[i2];
                i2++;
            }
        }
        */
        for (int elemento:arrayC) {
            System.out.println(elemento);
        }
    }

    private static void ejercicio8 (Scanner sc) {
        System.out.println("Leer los datos correspondiente a dos arrays de 12 elementos numéricos," +
                " y mezclarlos en un tercero de la forma: 3 del array A, 3 del B, otros 3 de A, otros 3 del B, etc.");
        int[] arrayA = leeArrayInt(sc, 12);
        int[] arrayB = leeArrayInt(sc, 12);
        int[] arrayC = new int[24];
        for (int i = 0, j = 0, k = 0; i < arrayC.length; i++) {
            if (i % 12 < 3) {
                arrayC[i] = arrayA[j++];
            } else if (i % 12 < 6) {
                arrayC[i] = arrayB[k++];
            } else {
                arrayC[i] = arrayA[j++];
            }
        }
        for (int elemento:arrayC) {
            System.out.println(elemento);
        }
        System.out.println();
    }




}

