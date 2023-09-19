package application;

import entities.Triangle;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Medias do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Medias do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areax = x.area();
        double areay = y.area();

        System.out.printf("Area do x : %.2f\n" , areax);
        System.out.printf("Area do y : %.2f\n" , areay);
        if (areax > areay){
            System.out.printf("Area x é maior : %.2f\n" , areax);
        }else{
            System.out.printf("Area y é maior : %.2f\n" , areay);
        }
    }
}
