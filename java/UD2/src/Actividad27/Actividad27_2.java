package Actividad27;

public class Actividad27_2 {

    public static void main(String[] args) {
        
        //Declaramos las variables
        int contadorFin = 10;
        int contador = 0;
        int numero = 2;

        //Iniciamos el primer bucle que es el que hara que sean los 10 primeros
        while (contador < contadorFin) {
            boolean esPrimo = true;
            
            //Iniciamos el segundo bucle, si entra en el if provoca que no sume
            //en el contador y que no se pinte, ya que pone el booleano en false
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            
            //Si no entra en el if anterior lo pintara y sumara 1 en el contador
            if (esPrimo) {
                System.out.println(numero + " es numero primo");
                contador++;
            }
            //Para que el numero que estamos comprobando vaya sumando uno y asi
            //comprobar otro numero
            numero++;
        }
    }
}
