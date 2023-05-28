/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrincipalMap;

import Grafo.grafo;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author PC-ELHID
 */
public class GrafoPrincipal {
    
    public static void main(String args[]) {
        
        grafo g = new grafo();
        char[] vertices = {'S', 'a', 'b', 'c', 'F', 'd', 'e', 'f', 'A', 'g', 'h', 'i', 'M', 'j', 'k', 'l', 'C', 'm', 'n', 'o', 'L', 'p', 'q', 'r', 'B', 's', 't', 'u', 'T'};

        HashMap<Character, Integer> rut1 = new HashMap<Character, Integer>();
        rut1.put('a', 13);
        rut1.put('b', 11);
        rut1.put('c', 15);
        g.crearVertice('S', rut1);


        HashMap<Character, Integer> rut2 = new HashMap<Character, Integer>();

        rut2 = new HashMap<Character, Integer>();
        rut2.put('d', 13);
        rut2.put('e', 14);
        rut2.put('f', 17);
        g.crearVertice('F', rut2);


        HashMap<Character, Integer> rut3 = new HashMap<Character, Integer>();

        rut3 = new HashMap<Character, Integer>();
        rut3.put('g', 16);
        rut3.put('h', 18);
        rut3.put('i', 22);
        g.crearVertice('A', rut3);


        HashMap<Character, Integer> rut4 = new HashMap<Character, Integer>();

        rut4 = new HashMap<Character, Integer>();
        rut4.put('j', 24);
        rut4.put('k', 26);
        rut4.put('l', 26);
        g.crearVertice('M', rut4);


        HashMap<Character, Integer> rut5 = new HashMap<Character, Integer>();

        rut5 = new HashMap<Character, Integer>();
        rut5.put('m', 17);
        rut5.put('n', 21);
        rut5.put('o', 28);
        g.crearVertice('C', rut5);


        HashMap<Character, Integer> rut6 = new HashMap<Character, Integer>();

        rut6 = new HashMap<Character, Integer>();
        rut6.put('p', 40);
        rut6.put('q', 30);
        rut6.put('r', 46);
        g.crearVertice('L', rut6);


        HashMap<Character, Integer> rut7 = new HashMap<Character, Integer>();

        rut7 = new HashMap<Character, Integer>();
        rut7.put('s', 37);
        rut7.put('t', 37);
        rut7.put('u', 39);
        g.crearVertice('B', rut7);


        System.out.println("San Cristobal Totonicapan tiene 3 rutas hacia Toto" + " que son:" + rut1 + "km " );
        System.out.println("Te recomiendo usar la ruta de 13km ya que te llevarias 10min a tu destino");
        
        System.out.println("San Francisco El Alto tiene 3 rutas hacia Toto" + " que son:" + rut2 + "km " );
        System.out.println("Te recomiendo usar la ruta de 13km ya que te llevarias 14min a tu destino");
        
        System.out.println("San Andres Xecul tiene 3 rutas hacia Toto" + " que son:" + rut3 + "Km" );
        System.out.println("Te recomiendo usar la ruta de 16km ya que te llevarias 12min a tu destino");
        
        System.out.println("Momostenango tiene 3 rutas hacia Toto" + " que son:" + rut4 + "Km" );
        System.out.println("Te recomiendo usar la ruta de: k 24km ya que te llevarias 26min hacia tu destino");
         
        System.out.println("Santa Maria Chiquimula tiene 3 rutas hacia Toto" + " que son:" + rut5 + "Km " );
        System.out.println("Te recomiendo usar la ruta de 17km ya que te llevarias 18min a tu destino");
         
        System.out.println("Santa Lucia La Reforma tiene 3 rutas hacia Toto" + " que son:" + rut6 + "Km" );
        System.out.println("Te recomiendo usar la ruta de 40km ya que te llevarias 32min a tu destino");
         
        System.out.println("San Bartolo tiene 3 rutas hacia Toto" + " que son:" + rut7 + "Km" );
        System.out.println("Te recomiendo usar la ruta de: s 37km ya que te llevarias 32min hacia tu destino");

        char origen = 'T';
        Map<Character, Integer> distancias = g.dijkstra(origen);
         for (char vertice : distancias.keySet()) {
           int distancia = distancias.get(vertice);
             System.out.println("De " + origen + ": " + distancia + " km " + vertice);
        }
        
    }
        
        
  }
    

