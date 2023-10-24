package application;
import entities.ContaBancaria;
import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta;



    System.out.println("Insira o número da conta : "  );
    int numeroConta = sc.nextInt();
    sc.nextLine();
    System.out.println("Insira o seu nome : "  );
    String nome = sc.nextLine();
    System.out.println("é o seu primeiro depósito (S/N)?: " );
    char responde = sc.next().charAt(0);

    if(responde == 'S'){
        System.out.println("Coloque o valor do deposito inicial : ");
        double depositoInicial = sc.nextDouble();
        conta = new ContaBancaria(nome, numeroConta, depositoInicial);
    }else{
        conta = new ContaBancaria(nome, numeroConta);
    }
    System.out.println();
        System.out.println("Infomações da conta : ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Coloque um valor para deposito : ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Conta Bancaria atualizada : ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Coloque um valor para saque : ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Conta Bancaria atualizada : ");
        System.out.println(conta);
    }
}
