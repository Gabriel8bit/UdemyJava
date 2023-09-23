package application;
import java.util.Scanner;
import Entities.Retangulo;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retangulo rect = new Retangulo();


        System.out.println("Insira a base e a altura do Retangulo respectivamente : ");
        rect.base = sc.nextDouble();
        rect.altura = sc.nextDouble();

        System.out.printf("AREA: %.2f\n", rect.area());
        System.out.printf("PERIMETRO: %.2f\n", rect.perimetro());
        System.out.printf("DIAGONAL: %.2f\n ", rect.diagonal());
            }
}
