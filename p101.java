import java.util.Scanner;
public class p101{
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);

        int n, cm, cm2;
        int[][] m;
        int[] test;
        boolean diabolico, esoterico;

        while(true){
            n = sc.nextInt();
            // si n es igual a cero, acabara el bucle
            if(n == 0) break;

            m = new int[n][n];
            test   = new int[n*n];
            diabolico = true;
            esoterico = true;

            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    int num  = sc.nextInt();
                    m[i][j] = num;
                    if( num > (n*n) || test[num - 1] == 1){
                        esoterico = false;
                    }
                    else if(num <= (n*n)){
                        test[num-1] = 1;
                    } 
                }
            } 

            cm  = CM( m );
            cm2 = (cm * 4) / n;
        }
    }

    public static int SumaEsquina(int [][] x){
        int Suma = 0;
        Suma += x[0][0];
        Suma += x[0][x.length -1];
        Suma += x[x.length-1][0];
        Suma += x[x.length-1][x.length-1];
        return Suma;
    }

    public static int CM(int [][] x){
        int cm = 0;
        for(int i = 0; i < x.length; i++){
            cm += x[0][i];
        }
        return cm;
    }

    public static int SumaFila(int [][] x, int n){
        int suma = 0;

        for(int i = 0; i < x.length; i++){
            suma +=x[n][i];
        }
        return suma;
    }

    public static boolean SumaDiagonal(int [][] x, int cm){
        int diagonal1 = 0;
        int diagonal2 = 0;

        for(int i = x.length-1, j=0; i >= 0; i--, j++){
            diagonal1 += x[j][j];
            diagonal2 += x[i][j];
        }
        return (diagonal2 == cm && diagonal1 == cm);
    }

    public static int SumarColumna(int [][] x, int n){
        int suma = 0;
        for(int i = 0; i < x.length; i++){
            suma += x[i][n];
        }
        return suma;
    }

    public static int SumarCasillassuma(int [][] x){
        int suma = 0;
        int size = x.length;
        if(size % 2 != 0){
            suma += x[0][size /2]; /**fila de arriba*/
            suma += x[size / 2][0]; /**columna izuierda*/
            suma += x[size - 1][size /2]; /**fila de abajo*/
            suma += x[size /2 ][size -1 ];/**columna derecha*/
        }else{   
            suma += x[0][size /2];
            suma += x[0][(size/2)-1];

            suma += x[size/2][0]; 
            suma += x[(size/2)-1][0];

            suma += x[size][size/2]; 
            suma += x[size -1 ][(size/2)-1];

            suma += x[size / 2][size-1]; 
            suma += x[(size / 2)-1][size-1];
        }
        return suma;
    }

}