/**
 * @author Alfred
 *
 *  Acepta el reto problema 100
 */

import java.util.Scanner;
import java.util.Arrays;

public class p100{
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        int casos = Integer.parseInt(sc.nextLine()); 

        for(int i = 1 ; i<= casos ; i++){
            int contador = 0;
            String numeroStr = sc.nextLine();
            numeroStr = Comprobar(numeroStr);
            int numero = Integer.parseInt(numeroStr);
            while(numero != 6174){
                numero = OrdenMayor(numeroStr) - Sort(numeroStr);
                if(numero == 0){
                    contador = 8;
                    break;
                }
                else{
                    numeroStr = String.valueOf(numero);
                    numeroStr = Comprobar(numeroStr);
                    contador ++;
                }
            }
            System.out.println(contador);
        }
    }

    public static int OrdenMayor(String num){
        char [] aux = num.toCharArray();
        Arrays.sort(aux);
        char [] temp  = new char[4];
        int c = 0;
        for (int i = aux.length-1; i>=0 ; i--){
            temp[c] = aux [i];
            c++;
        }
        return Integer.parseInt(new String(temp));
    }

    public static int Sort(String num){
        char[] aux = num.toCharArray();
        Arrays.sort(aux);
        return Integer.parseInt(new String(aux));
    }

    public static String Comprobar(String num){
        if(num.length() == 4  ) return num;
        while(num.length() < 4){
            num = "0" + num;
        }
        return num;
    }
}