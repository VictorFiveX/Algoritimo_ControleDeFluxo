import java.util.Scanner;

public class Contador{

public static void main(String[] args) {
    System.out.println("Esse programa subtrai dois numeros e imprime em ordem crescente até o resultado");
try (Scanner terminal = new Scanner(System.in)) {
        System.out.println("Digite o primeiro numero");
        int parametroUm = terminal.nextInt(); // armazena o primeiro numero

        System.out.println("Digite o segundo numero");
        int parametroDois = terminal.nextInt(); // armazena o segundo numero

    try {
        contar(parametroUm, parametroDois);
    } 
    catch (ParametrosInvalidosException e) {

        System.out.println(e.getMessage());// impreme a mensagem de error 

    }
}
	}
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}



