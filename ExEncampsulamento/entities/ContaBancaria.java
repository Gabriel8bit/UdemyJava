package entities;

public class ContaBancaria {
    private String nome;
    private int numeroConta;
    private double saldoConta;

    public ContaBancaria(String nome, int numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
    }

    public ContaBancaria(String nome, int numeroConta, double depositoInicial) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        deposito(depositoInicial);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }


    public double getSaldoConta() {
        return saldoConta;
    }

    public void deposito(double valor){
        saldoConta += valor;
    }
    public void saque(double valor){
        saldoConta -=valor + 5;
    }

    public String toString(){
        return "Conta "
                + numeroConta
                + " Usuário : "
                + nome
                + " saldo da conta : R$ "
                + String.format(" %.2f", saldoConta);
    }
}