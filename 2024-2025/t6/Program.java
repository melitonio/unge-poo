package t6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Persona {

    private int edad;
    private String nombre;

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + " -> " + edad + " años";
    }
}

public class Program {

    /*     public static void main(String[] args) {

        Persona[] personas = new Persona[3];
        personas[0] = new Persona(25, "Ana");
        personas[1] = new Persona(30, "Luis");
        personas[2] = new Persona(22, "María");

        for(Persona p : personas) {
            System.out.println(p.toString());
        }
    } */
 /*     public static void main(String[] args) {
    int[] elementos = { 4, -7, 9, 15, 5, 94 };
    
    for (int i = 0; i < elementos.length; i++) {
    System.out.println("Elemento " + i + ": " + elementos[i]);
    }
    
    for (int elemento : elementos) {
    System.out.println("Elemento: " + elemento);
    }
    } */
 /*     public static void main(String[] args) {
        int[][] m = new int[3][4];  // 3 filas, 4 columnas
        int[][] c = {{1, 2}, {3, 4}, {5, 6}};

        System.out.println("El elemento es: " + c[2][0]);

// Recorrido anidado
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = i - 2 * j;
            }
        }

// Impresión
        for (int[] fila : c) {
            System.out.println(Arrays.toString(fila));
        }
    } */
    // Búsqueda lineal
    /*     public static int buscar(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    } 
     */

 /*     public static void main(String[] args) {
  int[] elementos = {4, -7, 9, 15, 5, 94};
  int p = buscar(elementos,9);
 
  if (p < 0) {
      System.out.println("No encontrado"); 
  }else {
      System.out.println("El elemento ocupa la psocion :" + p);
  }
 } */
 /*     public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        System.out.println("Tamaño de la lista: " + nombres.size());
        System.out.println("El elemento es: " + nombres.get(0));            // "Ana"
        nombres.remove("Luis");
        System.out.println("Tamaño de la lista: " + nombres.size());

        Set<Integer> s = new HashSet<>();
        s.add(3);
        s.add(3);
        s.add(5);
        System.out.println("Tamaño del conjunto: " + s.size());

        Map<String, Integer> edad = new HashMap<>();
        edad.put("Juan", 22);
        edad.put("Ana", 25);
        edad.put("Luis", 30);
        System.out.println("Tamaño del mapa: " + edad.size());
        System.out.println("Edad de ana: " + edad.get("Ana"));
        System.out.println("Edad de Pedro: " + edad.get("Pedro"));
    } */
    public static void main(String[] args) {

        // De array a stream:
        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        int sumaPares = Arrays.stream(nums)
                .filter(n -> n % 2 == 0)
                .sum();

        System.err.println("la suma es: " + sumaPares);

// Sobre Lista:
        List<String> nombres = List.of("Leandro", "Zacarias", "maria");

        List<String> mayus = nombres.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        for (String s : mayus) {
            System.out.println(s);
        }

    }

}
