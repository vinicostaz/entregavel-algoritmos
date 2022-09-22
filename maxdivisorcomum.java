import java.util.Scanner;

public class maxdivisorcomum {
    public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

int A = entrada.nextInt();
int B = entrada.nextInt();
int resto;

do {
resto = A%B;
A=B;
B=resto;
} while(resto!=0);

System.out.println(A);

    }
}
