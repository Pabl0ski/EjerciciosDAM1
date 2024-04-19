package ProgramacionOrientadaAObjetos.Anexo2Ejemplo1_Ejemplo3_Ejemplo4;

public class MainArticulos2 {
    public static void main(String[] args) {
        //se instancian dos objetos tipo Articulo
        Articulo articulo1 = new Articulo();
        //utilizando los setters le daos valor a sus atributos
        articulo1.setCodigoArticulo("1");
        articulo1.setTítulo("titulo 1");
        articulo1.setFormato("DVD");
        articulo1.setPrecioAlquiler(2.5);

        //utilizando constructor con parámetros
        Articulo articulo2 = new Articulo("2", "titulo articulo 2", "CD", 3);
        Articulo articulo3 = new Articulo("3", "titulo articulo 3", "DVD", 5);

        //utilizando sus métodos
        System.out.println("Alquiler artículo "+articulo1.getCodigoArticulo() +", 1 día: "+ articulo1.calcularPrecio1());
        System.out.println("Alquiler artículo "+articulo2.getCodigoArticulo() +", 1 día: "+ articulo2.calcularPrecio1());

        System.out.println("Número de artículos: "+Articulo.getStock());
        System.out.println("Identificador del artículo 1: "+articulo1.getIdentificador());
        System.out.println("Identificador del artículo 2: "+articulo2.getIdentificador());
        System.out.println("Identificador del artículo 3: "+articulo3.getIdentificador());
        System.out.println("Precio con IVA del artículo 1, 1 día: "+((articulo1.calcularPrecio1())*(1+Articulo.IVA)));
        System.out.println("Precio con IVA del artículo 1, 1 día: "+((articulo2.calcularPrecio1())*(1+Articulo.IVA)));

    }
}
