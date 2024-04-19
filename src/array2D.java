public class array2D {
    public static void main(String[] args) {
        int[][] nombres = new int[5][3];
        //forma de recorrer un array BiDimensional
        for (int i = 0; i < nombres.length; i++) { //i llega hasta 5, que son los array que hay
            for (int j = 0; j < nombres[i].length; j++) { //j llega hasta 3 que es el tamaño de cada array
                //esto puede ser sustituido por un Scanner sc
                nombres[i][j] = (int)(Math.random()*100);
            }
        }
        System.out.println("nombres verison 0 "+nombres);
        System.out.println();
        System.out.println("nombres version 1 ");
        for (int[] array: nombres){
            System.out.print(array+", ");
        }

        //fomra valida de sacar por pantalla los array
        System.out.println();
        System.out.println("nombres version 2 ");
        for (int[] array:nombres) {
            for (int numeros:array) System.out.print(numeros+", ");
            System.out.println();
        }
    }
}
