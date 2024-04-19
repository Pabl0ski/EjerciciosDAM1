package ProgramacionOrientadaAObjetos.Anexo2Ejemplo1_Ejemplo3_Ejemplo4;

public class MainArticulos{

public static void main(String[] args) {
        //se instancian dos objetos tipo Articulo
        Articulo articulo1 = new Articulo(); //utilizando constructor vacío
        //utilizando los setters le damos valor a sus atributos
        articulo1.setCodigoArticulo("001");
        articulo1.setTítulo("titulo 1");
        articulo1.setFormato("DVD");
        articulo1.setPrecioAlquiler(2.5);

        //utilizando constructor con parámetros
        Articulo articulo2 = new Articulo(  "002", "titulo articulo 2", "CD", 3);
        //utilizando constructor con parámetros


        //utilizando sus métodos
        System.out.println("Alquiler artículo "+articulo1.getCodigoArticulo() +", 1 día: "+articulo1.calcularPrecio1());
        double precioArt1 = articulo1.calcularPecio2();
        System.out.println("Alquiler artículo "+articulo1.getCodigoArticulo() +", 2 día: "+precioArt1);
        System.out.println("Alquiler artículo "+articulo1.getCodigoArticulo() +", 1 semana: "+articulo1.calcularPecioSemana());
        System.out.println("Alquiler artículo "+articulo2.getCodigoArticulo() +", 1 día: "+articulo2.calcularPrecio1());
        System.out.println("Alquiler artículo "+articulo2.getCodigoArticulo() +", 2 día: "+ articulo2.calcularPecio2());
        System.out.println("Alquiler artículo "+articulo2.getCodigoArticulo() +", 1 semana: "+articulo2.calcularPecioSemana());
    }
}
