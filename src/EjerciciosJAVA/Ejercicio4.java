package EjerciciosJAVA;

public class Ejercicio4 {
    public static void main(String[] args) {
        int a=1, b=2, c=3, d=4; //faltaria tener otra variable auxiliar para poder guardar el primer valor de b para darselo a d
        System.out.println("Valores iniciales: \na "+ a +
                "\nb =" + b +
                "\nc = " + c +
                "\nd = "+ d +
                "\nValores finales\nb toma el valor de c, b ahora vale: " +(b=c)+
                "\nc toma el valor de a, c ahora vale: " +(c=a)+
                "\na toma el valor de d, a ahora vale: " +(a=d)+
                "\nd toma el valor de b, d ahora vale: " +(d=b)

        );
    }
}
