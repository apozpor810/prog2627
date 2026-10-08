
package Actividad26;

public class Actividad26 {
        public static void main(String args[]) {
        //Primero la multiplicacion, luego la suma y luego la comparacion dando 
        //falso ya que 20 no es mas grande que 20 y como lo de adelante es un &&
        //es falso
        boolean a = 10 + 5 * 2 > 20 && 4 == 4;
        
        //Primero sumamos, nos da que es falso porque 10 no es mayor a 10 pero
        //como tiene una ! es verdadero y como es || es verdadero
        boolean b = !(7 + 3 > 10) || 3 * 2 <= 6;
        
        //Primero hacemos la division y luego la multiplicacion, quedaria 5 + 15
        // que daria 20 y es falso porque no es igual a 19 y como delante hay un
        //&& es falso directamente
        boolean c = 10 / 2 + 3 * 5 == 19 && true;
        
        //Declaramos x como 5
        int x = 5;
        
        //Hacemos la multiplicacion primero y luego lo sumamos a x que daria 11
        x += 3 * 2;
        
        //Se declara que d es false
        boolean d = false;
        
        // ! vuelve d verdadero lo cual ya lo hace verdadero y al tener || queda
        //verdadero
        d = !d || 7 % 2 == 1;
        
        System.out.println("a es " + a);
        System.out.println("b es " + b);
        System.out.println("c es " + c);
        System.out.println("x es " + x);
        System.out.println("d es " + d);
        
   } 
}
