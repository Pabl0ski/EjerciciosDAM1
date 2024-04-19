package ProgramacionOrientadaAObjetos.Anexo2Ejemplo1_Ejemplo3_Ejemplo4;

public class MainArticulo3 {
    public static void main(String[] args) {
        Articulo[] misArticulos = new Articulo[10];
        for (int i = 0; i < misArticulos.length ; i++) {
        //public Articulo(String codigoArticulo, Styring titulo, String formato, double precioAlquiler)
        misArticulos[i] = new Articulo(""+i, "Articulo"+i, "DVD", Math.random()*10);
        }

        for (int i = 0; i < misArticulos.length; i++) {
            System.out.println("----- Código Artículo " + misArticulos[i].getCodigoArticulo());
            System.out.println("Alquiler 1 día " + misArticulos[i].calcularPrecio1());
            System.out.println("Alquiler 2 día " + misArticulos[i].calcularPecio2());
            System.out.println("Alquiler 1 semana " + misArticulos[i].calcularPecioSemana());
        }

    }
}
