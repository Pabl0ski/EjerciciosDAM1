package ProgramacionOrientadaAObjetos.Anexo2Ejemplo1_Ejemplo3_Ejemplo4;

public class Articulo {
    //atributos de la clase
    private String codigoArticulo;
    private String título;
    private String formato;
    private double precioAlquiler;
    public static final double IVA = 0.21;
    private static int stock = 0;
    private String identificador;


    //metodos de la clase
    //constructor vacio
    public Articulo(){
        stock++;
        this.identificador = "00"+stock;
    }
    //constructor
    public Articulo(String codigoArticulo, String título, String formato, double precioAlquiler){
        this.codigoArticulo = codigoArticulo;
        this.formato = formato;
        this.título = título;
        this.precioAlquiler = precioAlquiler;
        stock++;
        this.identificador ="00"+stock;
    }
    //getters and setters_ get --> obtener // setter --> moidficar


    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public static int getStock() {
        return stock;
    }

    public String getIdentificador() {
        return identificador;
    }


    //otros métodos
    //El método calculaPrecio1 devuelve el valor del precio de alquiler del artículo.
    public double calcularPrecio1(){
        return precioAlquiler;
    }
    /*El método calculaPrecio2 calcula el precio de alquiler de dos días haciendo un descuento
    del 30% (por eso se multiplica por 1,7). Por último el método precioSemana calcula el
    precio de una semana multiplicando por 6 el precio de alquiler.
    */
    public double calcularPecio2(){
        double precioTotal = precioAlquiler * 1.8;
        return precioTotal;
    }
    public double calcularPecioSemana(){
        return precioAlquiler * 5;
    }
}
