import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada inicial
        System.out.print("Informe o nome do titular: ");
        String nome = sc.nextLine();

        System.out.print("Informe o número da conta: ");
        String numeroConta = sc.nextLine();

        System.out.print("Informe o saldo inicial: R$ ");
        double saldoInicial = sc.nextDouble();

        ContaBancaria conta = new ContaBancaria(nome, numeroConta, saldoInicial);

        // Menu de operações
        int opcao;
        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("[1] Depositar");
            System.out.println("[2] Sacar");
            System.out.println("[3] Consultar saldo");
            System.out.println("[0] Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Informe o valor do depósito: R$ ");
                    double valor = sc.nextDouble();
                    conta.depositar(valor);
                }
                case 2 -> {
                    System.out.print("Informe o valor do saque: R$ ");
                    double valor = sc.nextDouble();
                    conta.sacar(valor);
                }
                case 3 -> conta.exibirSaldo();
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
