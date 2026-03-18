import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int opcao = 0;
        float saldo = 0;
        float [] extrato = new float [200];
        int contador = 0;

        while (opcao != 5){
            System.out.println("===================================");
            System.out.println("Assistente Financeiro do Java");
            System.out.println("===================================");
            System.out.println("Menu de Opções: ");
            System.out.println("1 - Adicionar Receita");
            System.out.println("2 - Adicionar Despesa");
            System.out.println("3 - Ver Extrato");
            System.out.println("4 - Ver Saldo");
            System.out.println("5 - Sair");
            System.out.println("===================================");
            System.out.println("Selecione uma das opções acima: ");
            opcao = sc.nextInt();

            if (opcao >= 6) {
                System.out.println("Opção Inválida! Tente novamente...");
            }
            if (opcao == 1){
                float valorR;
                System.out.println("Digite o valor que você quer inserir: ");
                valorR = sc.nextFloat();
                saldo = saldo + valorR;
                System.out.printf("O valor de %.2f foi adicionado no saldo\n", valorR);
                extrato[contador] = valorR;
                contador++;
            }
            else if (opcao == 2){
                float valorD;
                System.out.println("Digite o valor que você quer inserir: ");
                valorD = sc.nextFloat();

                if (valorD < 0) {
                    System.out.println("Opção Inválida! Adicione o valor sem menos");
                } else {
                    saldo = saldo - valorD;
                    extrato[contador] = -valorD;
                    contador++;
                    System.out.printf("O valor de %.2f foi descontado do saldo\n", valorD);
                }
            }
            else if (opcao == 3){
                for (int i = 0; i < contador; i++){
                    System.out.println(extrato[i]);
                }
            }
            else if (opcao == 4){
                System.out.println("O saldo atual é de: " + saldo);
            }
        }
    }

}
