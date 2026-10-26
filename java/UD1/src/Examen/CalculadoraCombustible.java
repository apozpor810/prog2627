package Examen;

/**
 * ================================================================================
 *
 * EVALUACIÓN PRÁCTICA INDIVIDUAL - UD1
 *
 * SISTEMA DE CÁLCULO DE COMBUSTIBLE "MISIÓN ARTEMIS-X"
 *
 * ================================================================================
 *
 * Tiempo disponible: 35 minutos
 *
 * Entorno: IDE (NetBeans)
 *
 * Entregable: Archivo 'CalculadoraCombustible.java'
 *
 *
 *
 * CONTEXTO:
 *
 * Eres el/la responsable del software de vuelo de la agencia espacial. Debes
 * programar
 *
 * un módulo en Java que calcule el combustible exacto necesario para el
 * lanzamiento  *
 * del cohete Artemis-X, aplique los márgenes de seguridad y convierta los
 * importes
 *
 * finales a presupuestos enteros para el departamento de contabilidad.
 *
 *
 *
 * REQUISITOS DEL PROGRAMA:
 *
 * 1. Crea una clase pública llamada 'CalculadoraCombustible' con su método
 * 'main'.
 *
 * 2. Declara dos CONSTANTES:
 *
 * - CONSUMO_POR_KM (double): Valor fijo de 14.75 litros por kilómetro.
 *
 * - RESERVA_SEGURIDAD (int): Valor fijo de 500 litros extra.
 *
 * 3. Declara dos VARIABLES e inicialízalas con valores de tu elección:
 *
 * - distanciaKm (int): Distancia a la estación espacial (ej. 4800 km).
 *
 * - precioLitro (double): Precio del combustible estelar (ej. 2.35 €/litro).
 *
 * 4. Realiza los CÁLCULOS:
 *
 * - Litros totales exactos = (distanciaKm * CONSUMO_POR_KM) + RESERVA_SEGURIDAD
 *
 * - Coste total exacto = Litros totales exactos * precioLitro
 *
 * 5. Aplica CASTING EXPLÍCITO:
 *
 * - Trunca los decimales de los litros totales exactos a un 'int' para obtener
 *
 * los 'litrosOficialesComprar'.
 *
 * - Trunca el coste total exacto a un 'int' para obtener el
 * 'costePresupuestado'.
 *
 * 6. Muestra por CONSOLA un informe limpio con todos los datos calculados.
 *
 * 7. DOCUMENTA el código: usa comentarios de una línea (//) para explicar los
 * pasos  *
 * y comentarios de bloque/Javadoc en el encabezado
 */
public class CalculadoraCombustible {

    public static void main(String[] args) {

        //Declaramos una constante que es el conusmo por km
        final double CONSUMO_POR_KM = 14.75;
        //Declaramos una constante en la reserva de seguridad
        final int RESERVA_SEGURIDAD = 500;
        //Declaramos una variable para la distancia a recorrer hasta la base
        int distanciaKm = 4800;
        //Declaramos una variable para el precio del sombustible
        double precioLitro = 2.35;

        //Calculamos el total de litros de combustible que necesitamos para llegar a base y como distanciaKm es un entero lo pase explicitamente a decimal
        double litrosTotalesExactos = (double) (distanciaKm * CONSUMO_POR_KM) + RESERVA_SEGURIDAD;
        //El precio total que pagaremos para el combustible necesario para llegar a base 
        double costeTotalExacto = litrosTotalesExactos * precioLitro;

        //Pasamos explicitamente de double a int
        int litrosOficialesComprar = (int) litrosTotalesExactos;
        //Pasamos explicitamente de double a int
        int costePresupuestado = (int) costeTotalExacto;

        System.out.println("TICKET DE COMPRA");
        System.out.println("------------------------------------------");
        System.out.println("El consumo es " + CONSUMO_POR_KM + " por kilometro");
        System.out.println("La reserva de seguridad es " + RESERVA_SEGURIDAD);
        System.out.println("La distancia hasta la base es de " + distanciaKm + "Km");
        System.out.println("El precio por litro es " + precioLitro + "€");
        System.out.println("------------------------------------------");
        System.out.println("Los litros oficiales a comprar son " + litrosOficialesComprar + " Litros");
        System.out.println("Los costes presupuestados son " + costePresupuestado + "€");
    }

}
