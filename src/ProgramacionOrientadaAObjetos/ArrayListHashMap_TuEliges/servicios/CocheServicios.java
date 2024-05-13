package ProgramacionOrientadaAObjetos.ArrayListHashMap_TuEliges.servicios;

import ProgramacionOrientadaAObjetos.ArrayListHashMap_TuEliges.modelo.Coche;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CocheServicios {
    //HashMap para almacenar los coches utilizando la matricula como clave
    private Map<String, Coche> coches;

    public CocheServicios(){coches = new HashMap<>();}

    //Metodo para buscar un coche por matricula
    public Coche buscarCochePorMatricula(String matricula){
        return coches.get(matricula);
    }

    //Metodo para añadir coche
    public boolean añadirCoche(Coche coche){
        if (!coches.containsKey(coche.getMatricula())){
            coches.put(coche.getMatricula(), coche);
            return true;
        }
        return false; //Ya existe yun coche con esa matricula
    }

    //Metodo para eliminar un coche por matricula
    public boolean eliminarCoche(String matricula){
        if (coches.containsKey(matricula)){
            coches.remove(matricula);
            return true;
        }
        return false; //No se encotro ningun coche con esa matricula
    }

    //Metodo para obtener los coches de una marca especifica
    public List<Coche> obtenerCochesMarca(String marca){
        List<Coche> cochesMarca=new ArrayList<>();
        for (Coche coche : coches.values()){
            if (coche.getMarca().equalsIgnoreCase(marca)){
                cochesMarca.add(coche);
            }
        }
        return cochesMarca;
    }

    //Metodo para obrener todos los coches ordenados por marca o matricula
    public List<Coche> obtenerTodos(int tipo){
        if (tipo == 1){
            return ordenadosPorMarca();
        } else if (tipo == 2) {
            return ordenadosPorMatricula();
        }else return null;
    }

    //Metodo privado para obtener los coches ordenadro por matricula
    private List<Coche> ordenadosPorMatricula() {
        List<Coche> cochesOrdenados = new ArrayList<>(coches.values());
        cochesOrdenados.sort((c1, c2) -> c1.getMatricula().compareTo(c2.getMatricula()));
        return cochesOrdenados;
    }

    //Metodo privado para obtener los coches ordenados por marca
    private List<Coche> ordenadosPorMarca() {
        List<Coche> cochesOrdenados = new ArrayList<>(coches.values());
        cochesOrdenados.sort((c1, c2) -> c1.getMarca().compareTo(c2.getMarca()));
        return cochesOrdenados;
    }
}
