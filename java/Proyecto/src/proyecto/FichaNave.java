
package proyecto;


/* Hecho por Alejandro */

public class FichaNave {


    public static void main(String[] args) {
     
    final double CONSUMO = 170.4;
    final double COMBUSTIBLE_MAX = 2000.0;   
    String piloto = "Manuel";
    char rango = 'C';
    int nivel = 4;
    double combustible = 1260.50;
    //Incrementamos el nivel del piloto
    ++nivel;
    //Calculamos Años L uz por combustible
    double añosLuz = (int) (COMBUSTIBLE_MAX / CONSUMO);
    //Calculamos el % de combustible
    double porcentaje = (combustible/COMBUSTIBLE_MAX)*100;
   
    
    System.out.println("Años luz posibles para recorrer " + añosLuz);
    System.out.println("Queda el " + porcentaje + ("%"));
    }
}
