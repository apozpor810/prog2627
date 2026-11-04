package examen2;

import java.util.Scanner;

/*
Alejandro Pozo Portillo

Ejercicio 1: El Escáner de Seguridad (Dificultad: Baja)
(Vinculado a CE a, CE e, CE g)
En una estación espacial, el terminal de control clasifica a las naves 
según su código de autorización numérico (un número entero del 1 al 4):
    • 1: Nave Aliada Imprime: "Acceso concedido: Sector Central".
    • 2: Nave Comercial Imprime: "Acceso concedido: Hangar de Carga".
    • 3: Nave Desconocida Imprime: "Acceso restringido: Enviar escolta".
    • 4: Nave Hostil Imprime: "¡ALERTA! Iniciar protocolos de defensa".
    • Cualquier otro número Imprime: "Código no válido".
Se pide:
    1. Escribe un programa en Java que solicite al usuario el código numérico y 
procese la respuesta utilizando la estructura switch.
    2. Si la nave es Comercial (código 2), añade una condición adicional 
(if / else) que pida el tonelaje de carga (número entero). Si supera los 
500 toneladas, debe mostrar el mensaje adicional: "Requiere inspección 
aduanera".
    3. Comenta brevemente la función de cada bloque principal.

 */
public class Examen2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Le pedimos que seleccione una opcion
        System.out.println("Elige una opcion");
        System.out.println("1: Nave Aliada");
        System.out.println("2: Nave Comercial");
        System.out.println("3: Nave Desconocida");
        System.out.println("4: Nave Hostil");
        int opcion = sc.nextInt();

        //Creamos el swtich para que la seleccion escoja una opcion
        switch (opcion) {

            //Pinta en caso de que ponga 1
            case 1 ->
                System.out.println("Acceso concedido: Sector Central");
            //Pinta en caso de que ponga 2
            case 2 -> {
                //Pedimos el peso entero en toneladas
                System.out.println("¿Cuantas toneladas pesa la carga? (En numero entero)");
                int peso = sc.nextInt();
                //Si el peso es menor a 500 pone el mensaje predeterminado
                if (peso < 500) {
                    System.out.println("Acceso concedido: Hangar de Carga");
                } //Si el peso supera a 500 el mensaje predeterminado mas el extra
                else {
                    System.out.println("Acceso concedido: Hangar de Carga, pero requiere inspeccion aduanera");
                }
            }
            //Pinta en caso de que ponga 3
            case 3 ->
                System.out.println("Acceso restringido: Enviar escolta");
            //Pinta en caso de que ponga 4
            case 4 ->
                System.out.println("¡ALERTA! Iniciar protocolos de defensa");
            //Pinta en caso de que ponga una opcion incorrecta
            default ->
                System.out.println("Codigo no valido");

        }
    }
}
