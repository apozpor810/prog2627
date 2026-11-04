package examen2;

/*
Alejandro Pozo Portillo

Ejercicio 2: El Generador de Frecuencias de Radio (Dificultad: Media)
(Vinculado a CE b, CE c, CE e, CE g)
Para sintonizar una emisora de emergencia, el sistema debe probar una serie de 
frecuencias de radio numéricas desde la frecuencia 100 hasta la 150 (de 1 en 1).
Se pide: Escribe un programa utilizando un bucle que analice las frecuencias en 
dicho rango bajo las siguientes reglas de negocio: Las frecuencias divisibles 
entre 5 se consideran "Frecuencias saturadas" y deben saltarse sin imprimirse 
(utiliza la sentencia adecuada para saltar a la siguiente iteración).
Si la frecuencia es exactamente 137, se ha encontrado la "Frecuencia de 
Socorro". El programa debe mostrar por pantalla "¡Frecuencia de socorro 
137 hallada! Deteniendo el escaneo." y interrumpir inmediatamente el bucle.
Para todas las demás frecuencias válidas, se debe imprimir: 
"Sintonizando frecuencia: [número]".

 */
public class Examen2_1 {

    public static void main(String[] args) {
        //Añadimos las variables, finFre es el final de la frecuencia
        int finFre = 150;
        //y inicioFre el inicio de la frecuencia
        int inicioFre = 100;
        //Si inicioFre es mayor que finFre acaba el bucle
        while (inicioFre < finFre) {
            //Para que añada 1 a inicioFre
            ++inicioFre;
            //Si es divisible entre 5 con resto 0 se salta
            if (inicioFre % 5 == 0) {
                continue;
            }
            //Si es el numero 137 se para el bucle mostrando tambien 
            //frecuencia de socorro
            if (inicioFre == 137) {
                System.out.println("Frecuencia de Socorro");
                break;
            }
            System.out.println(inicioFre);
        }
    }
}
