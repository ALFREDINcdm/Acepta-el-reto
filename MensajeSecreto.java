/**
 * Mensaje secreto
 * Para enviarse mensajes secretos, Ana y Tomás (estudiantes de programación) escriben
 * notas en papel en las que cambian cada letra o símbolo por su valor numérico (decimal)
 * de acuerdo al código ASCII. Así, la letra A la escriben como 65, la B como 66, y así sucesivamente.
 * Ana ha recibido el siguiente mensaje de Tomás:
 *
 * 771013210311711511697115321099711532113117101321081111153211211711011610111411111546
 * Y necesita ayuda para descifrarlo. ¿Puedes echarle una mano?
 *
 * Entrada de ejemplo
 * 65666665
 * 651009766121114111110321091111089746
 * 77101321031171151169732112114111103114971099711432101110326746
 *
 * Salida de ejemplo
 * ABBA
 * AdaByron mola.
 * Me gusta programar en C.
 */
package acepta.el.reto;

/**
 * https://www.aceptaelreto.com/problem/statement.php?id=551&potw=1
 *
 * @author Alfred Garcia
 */
public class MensajeSecreto {

    public static void main(String[] args) {
        System.out.println(Converter("771013210311711511697115321099711532113117101321081111153211211711011610111411111546"));
        System.out.println(Converter("65666665"));
        System.out.println(Converter("651009766121114111110321091111089746"));
        System.out.println(Converter("77101321031171151169732112114111103114971099711432101110326746"));
           }

    public static String Converter(String ascci) {
        String result = "";
        int i = 0;
        int j;
        char aux;

        while (i < ascci.length()) {
            j = i + 2;
            aux = (char) Integer.parseInt(ascci.substring(i, j));
            if (!Character.isLetter(aux) && aux != ' ' && aux != '.') {
                j = i + 3;
                aux = (char) Integer.parseInt(ascci.substring(i, j));
            }
            result += aux;
            i = j;
        }

        return result;
    }
    
   
}
