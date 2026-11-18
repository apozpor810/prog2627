package Actividad20;

public class Actividad20 {

    public static void main(String[] args) {
        int[][] numeros = {
            {2, 4, 6, 8},
            {1, 3, 5, 7},
            {10, 20, 30, 40}
        };

        mostrar(numeros);
    }

    public static void mostrar(int[][] numeros) {

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("");
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");

            }
        }
        
            /*public static int[] sumarFilas(int[][] numeros) {


        
        return 0;*/
    }

}
