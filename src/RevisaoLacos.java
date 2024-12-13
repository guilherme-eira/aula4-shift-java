import java.util.Scanner;

// Realizou-se uma pesquisa entre os habitantes de uma cidade. Dentre as informações coletadas estavam idade, sexo e
// salário. Faça um programa que informe:
// (a) A média do salário do grupo.
// (b) Maior e menor idade do grupo.
// (c) Quantidade de mulheres com salário acima de R$10.000,00.

public class RevisaoLacos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite quantas pessoas participaram da pesquisa:");
        int qtdPessoas = leitor.nextInt();

        int contador = 0, menorIdade = 0, maiorIdade = 0, qtdMulheresSalario = 0;
        double somaSalarios = 0;

        while (contador < qtdPessoas) {
            System.out.println("Qual a idade da pessoa " + (contador + 1) + "?");
            int idade = leitor.nextInt();

            if (contador == 0) {
                maiorIdade = idade;
                menorIdade = idade;
            } else {
                if (idade > maiorIdade) {
                    maiorIdade = idade;
                } if (idade < menorIdade) {
                    menorIdade = idade;
                }
            }

            System.out.println("Qual o sexo dessa pessoa? (M/F)");
            String sexo = leitor.next();

            System.out.println("Qual o salário dessa pessoa?");
            double salario = leitor.nextDouble();
            somaSalarios += salario;

            if (sexo.equalsIgnoreCase("f") && salario > 10000) {
                qtdMulheresSalario++;
            }

            contador++;
        }

        System.out.printf("\nA média de salário do grupo foi: %.2f", somaSalarios / qtdPessoas);
        System.out.println("\nA pessoa com maior idade tem " + maiorIdade + " anos e a pessoa com menor idade tem " + menorIdade + " anos");
        System.out.println("A quantidade de mulheres com salário acima de R$10.000,00 é: " + qtdMulheresSalario);

        leitor.close();
    }
}
