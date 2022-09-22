import java.util.Scanner;

public class contagem {
     public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

int N = entrada.nextInt();
int contador = 0;
int contador2 = 0;

for(int i = 0;i<N;i++) {
    int X = entrada.nextInt();
    if(X%1===0) {
        contador++;
    } if(X>=1) {
        contador++;
    } if(X<=N) {
        contador++;
    }
    if(contador==3) {
        contador2++;
        contador = 0;
    }
}

System.out.println("Foram digitados " + contador2 + " inteiros");

    }
}
