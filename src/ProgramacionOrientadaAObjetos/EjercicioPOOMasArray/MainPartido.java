package ProgramacionOrientadaAObjetos.EjercicioPOOMasArray;

import java.util.Scanner;

public class MainPartido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Partido[] partidos= {
                //Jornada 1
                new Partido("Guadalcacín", "Leganés", 1, 7),
                new Partido("Roldán", "Mostoles", 2, 2),
                new Partido("Burela Sala", "Zaragoza", 2, 0),
                new Partido("Penya Viaxes Amarelle", "Amarelle", 1, 0),
                new Partido("Femisport", "Poio", 2, 2),
                new Partido("Majadahonda", "Universidad De Alicante", 1, 6),
                new Partido("Futsi Atletico", "UCAM Pozo Murcia", 8, 0),
                new Partido("Alcorcón", "Ourense Envialia", 3, 4),
                //Jornada 2
                new Partido("La Bocatelia Futsal", "RTV Roldán", 3, 1),
                new Partido("Guadalcin", "Leganés", 0, 2),
                new Partido("Majadahonda", "Futsi Navalcarnero", 3, 3),
                new Partido("Melilla", "Alcorcon", 4, 3),
                new Partido("Poio", "Mostoles", 0, 0),
                new Partido("UCAM El Pozo", "Universidad de Alicante", 1, 3),
                new Partido("Ourense Envialia", "Amarelle", 0, 0),
                new Partido("Femisport", "Zaragoza", 5,1),
                //Jornada 3
                new Partido("RTV Roldan", "La Bocatelia Futsal", 1, 2)
                //Agregar mas partidos si es necesario
        };
        int opcion;
        int jornada=1;
        do {
            System.out.println("Menú:");
            System.out.println("1) Ver todos los partidos");
            System.out.println("2) Ver partidos empate");
            System.out.println("3) Ver partido con mayor goleada");
            System.out.println("4) Ver partidos por jornada");
            System.out.println("5) Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    // Mostrar los resultados de los partidos
                    mostrarResultados(partidos);
                    // Calcular estadísticas
                    calcularEstadisticas(partidos);
                    break;
                case 2:
                    System.out.println("Aún por implementar");
                    break;
                case 3:
                    System.out.println("Aún por implementar");
                    break;
                case 4:
                    mostrarResultadosPorJornadas(partidos, jornada);
                    jornada++;
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción incorrecta. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 5);
    }

    // Método para mostrar los resultados de los partidos
    public static void mostrarResultados(Partido[] partidos) {
        for (Partido partido : partidos) {
            String codigoPartido = partido.getEquipoLocal().substring(0, 1).toLowerCase() + partido.getGolesLocal() +
                    "." + partido.getGolesVisitante() + partido.getEquipoVisitante().substring(0, 1).toUpperCase();
            System.out.println(partido.getEquipoLocal() + " " + partido.getGolesLocal() + " - " +
                    partido.getGolesVisitante() + " " + partido.getEquipoVisitante() + " - Código del partido: " + codigoPartido);
            System.out.println();
        }
    }

    // Método para calcular estadísticas
    public static void calcularEstadisticas(Partido[] partidos) {
        int victoriasLocal = 0;
        int victoriasVisitante = 0;
        int empates = 0;

        for (Partido partido : partidos) {
            if (partido.getGolesLocal() > partido.getGolesVisitante()) {
                victoriasLocal++;
            } else if (partido.getGolesLocal() < partido.getGolesVisitante()) {
                victoriasVisitante++;
            } else {
                empates++;
            }
        }

        System.out.println("Número de partidos con victoria del local: " + victoriasLocal);
        System.out.println("Número de partidos con victoria del visitante: " + victoriasVisitante);
        System.out.println("Número de empates: " + empates);
    }

    public static void mostrarResultadosPorJornadas(Partido[] partidos, int jornada) {
        int inicio = (jornada - 1) * 8;
        int fin = Math.min(jornada * 8, partidos.length);

        System.out.println("Jornada " + jornada + ":");
        for (int i = inicio; i < fin; i++) {
            Partido partido = partidos[i];
            String codigoPartido = partido.getEquipoLocal().substring(0, 1).toLowerCase() + partido.getGolesLocal() +
                    "." + partido.getGolesVisitante() + partido.getEquipoVisitante().substring(0, 1).toUpperCase();
            System.out.println(partido.getEquipoLocal() + " " + partido.getGolesLocal() + " - " +
                    partido.getGolesVisitante() + " " + partido.getEquipoVisitante() + " - Código del partido: " + codigoPartido);
            System.out.println();
        }
    }
}
