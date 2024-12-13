import java.util.Scanner;

/*
Preencha um vetor com 10 números.
a) Exiba o maior valor.
b) Some os elementos do vetor.
c) Exiba a média dos elementos inseridos.
d) Exiba o índice do primeiro positivo inserido.
e) Exiba o índice do último negativo.
* */

public class ExercicioVetor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Digite 10 valores:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = leitor.nextDouble();
        }

        double maiorNumero = 0, soma = 0, media = 0;
        int indicePrimeiroPositivo = numeros.length, indiceUltimoNegativo = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero)
                maiorNumero = numeros[i];

            soma += numeros[i];

            if(i == 7) {
                media = soma/numeros.length;
            }

            if(numeros[i] > 0 && i < indicePrimeiroPositivo) {
                indicePrimeiroPositivo = i;
            }

            if(numeros[i] < 0) {
                indiceUltimoNegativo = i;
            }
        }

        System.out.println("O maior valor é: " + maiorNumero);
        System.out.println("A soma dos elementos é: " + soma);
        System.out.println("A média dos elementos é: " + media);
        System.out.println("O índice do primeiro positivo é: " + indicePrimeiroPositivo);
        System.out.println("O índice do último negativo é: " + indiceUltimoNegativo);
    }
}
