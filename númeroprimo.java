import java.util.Scanner;

public class númeroprimo {
	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

int teste = entrada.nextInt();
int numero = 0;
int contador = 0;

for(int i = 0;i<teste;i++) {
    numero = entrada.nextInt();
    for(int j = 2;j<numero;j++) {
        if(numero%j==0) {
            contador++;
        }
    }
    if(contador==0) {
        System.out.println(numero + " é primo");
        contador = 0;
    } else {
        System.out.println(numero + " não é primo");
        contador = 0;
             }
        }
    }
}

