package application;

import entities.Students;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {

        Students stu = new Students();
        Scanner sc = new Scanner(System.in);


        System.out.println("Qual o nome do estudante?: ");
        stu.nome = sc.nextLine();

        System.out.println("Quais foram as 3 notas ? : ");
        stu.nota1 = sc.nextDouble();
        stu.nota2 = sc.nextDouble();
        stu.nota3 = sc.nextDouble();

        double media = stu.calcularMedia();

        if(media >= 60){
        System.out.printf("FINAL GRADE = %.2f\n", media);
        System.out.println("PASS");
        }else{
            System.out.printf("FINAL GRADE = %.2f\n", media);
            System.out.println("FAILED");
            double missing = 60 - media;
            System.out.printf("MISSING %.2f POINTS\n",missing);
        }


    }
}
