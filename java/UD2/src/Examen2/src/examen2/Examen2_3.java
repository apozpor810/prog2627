package examen2;

import java.util.Scanner;

/*
Alejandro Pozo Portillo

Ejercicio 3: Control de Recarga e Inspección de Código (Dificultad: Alta)
(Vinculado a CE a, CE b, CE c, CE e, CE f, CE g)
Parte A: Programación (3 puntos)
Diseña un programa en Java que simule el proceso de recarga de batería de un 
robot explorador.
El robot empieza con una batería inicial del 10%.
En cada ciclo (bucle), el robot realiza una carga interactiva donde se le 
pregunta al usuario cuántos puntos de energía desea inyectar 
(un entero entre 1 y 30).
Si el usuario introduce un valor fuera de rango (menor que 1 o mayor que 30),
el sistema debe mostrar "Entrada inválida" y pedir el valor de nuevo sin 
sumar nada a la batería.
La recarga finaliza cuando la batería alcanza o supera el 100%.
Al finalizar el bucle, debe mostrar el número total de ciclos de 
recarga que han sido necesarios.

 */
public class Examen2_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaramos Variables
        int cargaAct = 10;
        int cargaNue = 0;
        int contador = 1;
        int cargaMax = 100;

        //hacemos el bucle
        while (cargaAct < cargaMax) {
            //Preguntamos cuanta carga queremos meterle
            System.out.println("Ingrese cuanta carga le añadiras (entre 1 a 30)");
            cargaNue = sc.nextInt();
            //Si es menor que 1 o mayor que 30 le dice que no es valida y 
            //no hace nada, empieza de nuevo el bucle
            if (cargaNue < 1 || cargaNue > 30) {
                System.out.println("Entrada no valida");
            } 
            //Si es un valor correcto suma 1 al contador y suma la nueva 
            //carga al robot y enseña el % de carga
            else {
                ++contador;
                cargaAct = cargaAct + cargaNue;
                System.out.println("Bateria al " + cargaAct + "%");
            }

        }
        //al estar al 100% o mas se acaba
        System.out.println("Se ha cargado " + contador + " veces");
    }
}
