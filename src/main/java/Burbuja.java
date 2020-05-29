import java.util.Scanner;

public class Burbuja {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Introdusca el tamaño del vector");
        n=Integer.parseInt(leer.nextLine());
        int[] vector=new int[n];
        leerVector(n, vector);
        burbuja_descendente(n, vector);
        imprimirVector(n, vector);
    }

    public static void leerVector(int a,int[] v){
        Scanner leer = new Scanner(System.in);
        System.out.println("Empezando llenado del vector");
        for (int i=0; i<a;i++) {
            System.out.println("Introdusca el numero en la posicion:" + i+1);
            v[i]=Integer.parseInt(leer.nextLine());
        }
        System.out.println("Fin del llenado");
    }
    private static void imprimirVector(int n, int[] vector) {
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(vector[i]+" ");
        }
    }
    private static void burbuja(int n, int[] vector) {
        int aux;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(vector[i]<vector[j]) {
                    aux=vector[i];
                    vector[i] = vector[j];
                    vector[j]=aux;
                }
            }
        }
    }
    private static void burbuja_descendente(int n, int[] vector) {
        int aux;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(vector[i]>vector[j]) {
                    aux=vector[i];
                    vector[i] = vector[j];
                    vector[j]=aux;
                }
            }
        }
    }
}
//Esta es una prueba
