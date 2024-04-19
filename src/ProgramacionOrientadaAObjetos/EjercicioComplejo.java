package ProgramacionOrientadaAObjetos;

public class EjercicioComplejo {
    public static void main(String[] args) {
        EjercicioComplejo c1 = new EjercicioComplejo(3, 4);
        EjercicioComplejo c2 = new EjercicioComplejo(1, 2);
        c1.imprimir();
        c2.imprimir();
        c1.sumar(c2);
        c1.imprimir();
    }
    private double pReal;
    private double pImag;

    public EjercicioComplejo(double real, double imag) {
        this.pReal = real;
        this.pImag = imag;
    }

    public void asignar(double real, double imag) {
        this.pReal = real;
        this.pImag = imag;
    }

    public void sumar(EjercicioComplejo b) {
        this.pReal += b.pReal;
        this.pImag += b.pImag;
    }

    public void imprimir() {
        System.out.println("(" + this.pReal + ", " + this.pImag + "i)");
    }


}
