import java.util.Scanner;

public class somatorio {
	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

int n = entrada.nextInt();
int numero;
int soma = 0;
int i = 0;

while (i < n) {
    i = i + 1;
    numero = entrada.nextInt();
    soma = soma + numero;
}

System.out.println(soma);

    }
}


