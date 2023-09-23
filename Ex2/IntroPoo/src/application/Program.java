package application;
import entities.Funcionario;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario func = new Funcionario();


        System.out.println("Insira seu nome : ");
        func.nome = sc.nextLine();
        System.out.println("Qual o salário bruto? : ");
        func.salarioBruto = sc.nextDouble();
        System.out.println("Quanto de imposto? : ");
        func.imposto = sc.nextDouble();


        System.out.printf("Nome : %s\n", func.nome);
        System.out.printf("Salario bruto: R$%.2f\n", func.salarioBruto);
        System.out.printf("Imposto: R$%.2f\n", func.imposto);

        System.out.println("Qual a porcentagem de aumento? : ");
        double porcentagem = sc.nextDouble();
        func.salarioLiquido();
        func.aumentoSalario(porcentagem);
        System.out.println();
        System.out.println("Salario atualizado : " + func);

    }
}
