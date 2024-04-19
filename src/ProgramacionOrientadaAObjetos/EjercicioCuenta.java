package ProgramacionOrientadaAObjetos;

public class EjercicioCuenta {
    public static class Cuenta {
        private double saldo;

        public Cuenta(double saldo) {
            this.saldo = saldo;
        }

        public double getSaldo() {
            return saldo;
        }

        public void ingresar(double cantidad) {
            if (cantidad > 0) {
                this.saldo += cantidad;
                System.out.println("Se ha ingresado " + cantidad + " euros. El nuevo saldo es: " + this.saldo);
            } else {
                System.out.println("La cantidad a ingresar debe ser positiva.");
            }
        }

        public void retirar(double cantidad) {
            if (cantidad > 0 && cantidad <= this.saldo) {
                this.saldo -= cantidad;
                System.out.println("Se ha retirado " + cantidad + " euros. El nuevo saldo es: " + this.saldo);
            } else {
                System.out.println("La cantidad a retirar debe ser positiva y no superar el saldo disponible.");
            }
        }

        public void transferir(Cuenta destino, double cantidad) {
            if (cantidad > 0 && cantidad <= this.saldo) {
                this.retirar(cantidad);
                destino.ingresar(cantidad);
                System.out.println("Se ha transferido " + cantidad + " euros desde esta cuenta (" + this.saldo + " euros) a la cuenta destino (" + destino.getSaldo() + " euros).");
            } else {
                System.out.println("La cantidad a transferir debe ser positiva y no superar el saldo disponible.");
            }
        }
    }

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta(1000);
        Cuenta c2 = new Cuenta(500);
        c1.ingresar(200);
        c2.retirar(300);
        c1.transferir(c2, 250);
    }
}