package entities;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        ConversorMoeda con = new ConversorMoeda();

        System.out.println("Quantos dolares vão ser comprados? : ");
        con.dolaresComprados = sc.nextDouble();


    }
}
