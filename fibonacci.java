import java.util.Scanner;

public class fibonacci {
     public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

int N = entrada.nextInt();
int A = 0;
int B = 1;
int X = 2;
int C;

if(N==1) {
    System.out.print(A);
} else {
    System.out.print(A + ", " + B);
}

while(X<N) {
    X++;
    C = A+B;
    System.out.print(", " + C);
    A=B;
    B=C;
        }
    }
}
