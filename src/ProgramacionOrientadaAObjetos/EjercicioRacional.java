package ProgramacionOrientadaAObjetos;

public class EjercicioRacional {
    private int numerador;
    private int denominador;

    public EjercicioRacional(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    public void asignaNumerador(int x) {
        numerador = x;
        simplificar();
    }

    public void asignaDenominador(int y) {
        if (y == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero");
        }
        denominador = y;
        simplificar();
    }

    public void imprimir() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Racional { numerador = " + numerador + ", denominador = " + denominador + " }";
    }

    public EjercicioRacional suma(EjercicioRacional b) {
        int numeradorComun = denominador * b.denominador + numerador * b.denominador;
        int denominadorComun = denominador * b.denominador;
        return new EjercicioRacional(numeradorComun, denominadorComun);
    }

    public EjercicioRacional resta(EjercicioRacional b) {
        int numeradorComun = denominador * b.denominador - numerador * b.denominador;
        int denominadorComun = denominador * b.denominador;
        return new EjercicioRacional(numeradorComun, denominadorComun);
    }

    public EjercicioRacional producto(EjercicioRacional b) {
        int numeradorComun = numerador * b.numerador;
        int denominadorComun = denominador * b.denominador;
        return new EjercicioRacional(numeradorComun, denominadorComun);
    }

    public EjercicioRacional division(EjercicioRacional b) {
        if (b.numerador == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        int numeradorComun = numerador * b.denominador;
        int denominadorComun = denominador * b.numerador;
        return new EjercicioRacional(numeradorComun, denominadorComun);
    }

    public boolean esIgual(EjercicioRacional b) {
        return numerador == b.numerador && denominador == b.denominador;
    }

    private void simplificar() {
        int maximoComunDivisor = maximoComunDivisor(numerador, denominador);
        numerador /= maximoComunDivisor;
        denominador /= maximoComunDivisor;
    }

    private int maximoComunDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        EjercicioRacional a = new EjercicioRacional(1, 2);
        EjercicioRacional b = new EjercicioRacional(3, 4);
        EjercicioRacional suma = a.suma(b);
        EjercicioRacional resta = a.resta(b);
        EjercicioRacional producto = a.producto(b);
        EjercicioRacional division = a.division(b);
        boolean igual = a.esIgual(b);
        a.imprimir();
        b.imprimir();
        suma.imprimir();
        resta.imprimir();
        producto.imprimir();
        division.imprimir();
        System.out.println("a es igual a b: " + igual);
    }
}
