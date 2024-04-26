package ProgramacionOrientadaAObjetos.Ejercicio2Persona;

import java.util.Random;

public class Persona {
    //Atributos
    private String nombre;
    private  int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    private static final char DEFAULT_SEXO = 'H'; //Valor por de fecto de sexo es H de hombre

    //Valores de los pesos:
    private static final int PESO_IDEAL = 0;
    private static final int BAJO_PESO = -1;
    private static final int SOBREPESO = 1;

    public Persona(){
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = 0; //Valor por defecto de edad
        this.sexo = DEFAULT_SEXO;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    //Constructor con nombre, edad y peso, el resto por defecto
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad=edad;
        this.DNI="";
        this.sexo=sexo;
        this.peso=0.0;
        this.altura=0.0;
    }

    //Constructor con todos lo atributos
    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //Metodos

    private char comprobarSexo(char sexo){
        if (sexo== 'H' || sexo == 'M'){
            return sexo;
        }else return DEFAULT_SEXO;
    }

    public int calcularIMC() {
        double imc = peso / (altura *altura);
        if (imc<18.5) {
            return BAJO_PESO;
        } else if (imc>=18.5&&imc<25){
            return PESO_IDEAL;
        } else {
           return SOBREPESO;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    private String generarDNI() {
        Random r = new Random();
        int numDNI = r.nextInt(99999999 - 10000000 + 1) + 10000000;
        String tablaNIF = "TRWAGMYFPDXBNJZSQVHLCKE";
        int modulo = numDNI % 23;
        return String.valueOf(numDNI) + tablaNIF.charAt(modulo);
    }

    @Override
    public String toString() {
        return "Persona{ " +
                "nombre='" + nombre + "\n" +
                ", edad=" + edad + "\n" +
                ", DNI='" + DNI + "\n" +
                ", sexo=" + sexo  + "\n" +
                ", peso=" + peso + "kg\n" +
                ", altura=" + altura + "m\n" +
                '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
