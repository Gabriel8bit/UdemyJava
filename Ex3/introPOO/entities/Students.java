package entities;

public class Students {

    public String nome;
    public double nota1, nota2, nota3,media;

    public double calcularMedia(){

        media = nota1 + nota2 + nota3;
        return media;
    }
}
