package model;

public class Conta {

    private static final String agenciaPadrao = "0007";
    private static int sequencial = 1000;

    private int numeroConta;
    private String agencia;
    private Cliente cliente;
    private double saldo;
    private Banco banco;


    public Conta(Cliente cliente, Banco banco) {

        this.agencia = Conta.agenciaPadrao;
        this.numeroConta = sequencial++;
        this.cliente = cliente;
        this.banco = banco;
        banco.addConta(this);
    }

    public void sacar(double valor){

        double taxaSaque = 10.00;
        saldo -= (valor + taxaSaque);
    }

    public void depositar(double valor){

        saldo += valor;

    }

    public void transferir (double valor, Conta contaDestino){

        saldo -= valor;
        contaDestino.depositar(valor);

    }

    public void imprimeExtrato(){
        System.out.println("---- Extrato de Conta ----");
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("CPF: %s", this.cliente.getCpf()));
        System.out.println(String.format("Agencia: %s", this.agencia));
        System.out.println(String.format("Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: R$%.2f", this.saldo));
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "[" +
                "Conta: " + numeroConta +
                ", agencia: " + agencia + '\'' +
                ", cliente: " + cliente.getNome() + " CPF: "+ cliente.getCpf() +']';
    }
}
