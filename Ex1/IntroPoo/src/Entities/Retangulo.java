package Entities;

public class Retangulo {

    public double altura,base;

    public double area(){
        double area = altura * base;
        return area;
    }
    public double perimetro(){
        double perimetro  = 2*(base + altura);
        return perimetro;
    }
    public double diagonal() {
        double diagonal = Math.sqrt((altura * altura) + (base * base));
        return diagonal;
    }
}
