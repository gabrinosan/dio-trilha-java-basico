package ContaBanco;

import java.util.Scanner;

class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); //Adição para consumir a quebra de linha

        System.out.println("Digite a agência da conta:");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do titular da conta:");
        String nome = scanner.nextLine();

        System.out.println("Digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                            ", conta " + numero +  " e seu saldo R$" + saldo + " já está disponível para saque");
    }
}