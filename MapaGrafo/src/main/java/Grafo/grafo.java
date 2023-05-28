/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;


/**
 *
 * @author PC-ELHID
 */
public class grafo {
    HashMap<Character, HashMap<Character, Integer>> Grafo;

    public grafo() {
        Grafo = new HashMap<Character, HashMap<Character, Integer>>();
    }

    public void crearVertice(char vertice, HashMap<Character, Integer> relacion) {
        Grafo.put(vertice, relacion);
    }

    public HashMap<Character, Integer> getVertice(char vertice) {
        return Grafo.get(vertice);
    }

    public HashMap<Character, Integer> dijkstra(char origen) {
        HashMap<Character, Integer> distancias = new HashMap<Character, Integer>();
        PriorityQueue<Character> cola = new PriorityQueue<Character>(Comparator.comparingInt(distancias::get));
        HashMap<Character, Character> padres = new HashMap<Character, Character>();

        // Inicializar las distancias con infinito excepto para el nodo de origen
        for (char vertice : Grafo.keySet()) {
            if (vertice == origen)
                distancias.put(vertice, 0);
            else
                distancias.put(vertice, Integer.MAX_VALUE);
            cola.offer(vertice);
        }

        while (!cola.isEmpty()) {
            char nodoActual = cola.poll();

            if (distancias.get(nodoActual) == Integer.MAX_VALUE)
                break;

            HashMap<Character, Integer> vecinos = Grafo.get(nodoActual);
            for (char vecino : vecinos.keySet()) {
                int peso = vecinos.get(vecino);
                int distanciaNueva = distancias.get(nodoActual) + peso;

                if (distanciaNueva < distancias.get(vecino)) {
                    distancias.put(vecino, distanciaNueva);
                    padres.put(vecino, nodoActual);
                    // Actualizar la prioridad en la cola de prioridad
                    cola.remove(vecino);
                    cola.offer(vecino);
                }
            }
        }

        return distancias;
    }        
    
}
