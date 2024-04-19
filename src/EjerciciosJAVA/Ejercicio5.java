package EjerciciosJAVA;

public class Ejercicio5 {
    public static void main(String[] args) {
        int a=15, b=-1, c=33;
        if (a%2!=0)
            System.out.println(a+ " es impar");
        else {System.out.println(a+ "No es impar");}

        if (b>=0)
            System.out.println(b+ " Es positivo");
        else {
            System.out.println(b+ " Es negativo");}

        if (c%2!=0)
            System.out.println(c+ " Es impar");
        else {
            System.out.println(c+ " Es par");}

        if (c%5==0)
            System.out.println(c+ " Es multiplo de 5");
        else {
            System.out.println(c+ " No es multiplo de 5");}

        if (c%10==0)
            System.out.println(c+ " Es ,ultiplo de 10");
        else {
            System.out.println(c+ " No es multiplo de 10");}

        if (c<100)
            System.out.println(c+ " Es menor que 100");
        else {
            System.out.println(b+ " Es mayor");}
    }
}
