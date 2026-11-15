
package Actividad1;

/*

1. Localiza las instrucciones repetidas: Identifica qué bloques de código realizan exactamente la misma tarea con distintas variables.

Literalmente todo el codigo, menos los comentarios que es minimo el cambio

2. Describe con tus palabras qué hacen esas instrucciones repetidas y por qué crees que no es eficiente escribir el programa de esta manera.

calcula el area de cada zona, pero es ineficiente porque podemos hacer que un metodo haga el caluclo de cada uno sin repetir todo el rato el codigo

3. Piensa un método que calcule el área de un rectángulo, ¿qué recibiría? ¿qué devolvería?

recibiria las medidas y dentro del metodo calcularia el area devolviendo el resultado de ese metodo

4. Refactorizar el programa completo para eliminar duplicaciones y mejorar la organización. Supón que el método es: 
public static int calcularAreaRectangulo(int base, int altura) { return base * altura; }


*/

public class Actividad1 {
    
    public static void main(String[] args) {
    
         // Cálculo 1: Salón
         System.out.println("--- Salon ---");
         System.out.println("El area es " + calcularAreaRectangulo(5,4) + " m²");
         
         // Cálculo 2: Cocina
         
         System.out.println("--- Cocina ---");
         System.out.println("El area es " + calcularAreaRectangulo(3,3) + " m²");
         
         // Cálculo 3: Jardín
         
         System.out.println("--- Jardin ---");
         System.out.println("El area es " + calcularAreaRectangulo(10,6) + " m²"); 
        
    }
    
    public static int calcularAreaRectangulo(int base, int altura) { 
        return base * altura; 
    }
    
}

