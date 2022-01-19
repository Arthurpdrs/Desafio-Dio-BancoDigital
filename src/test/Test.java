package test;

import model.Banco;
import model.Cliente;
import model.Conta;

public class Test {
    public static void main(String[] args) {

        Banco banco = new Banco();

        Cliente cliente = new Cliente();
        cliente.setNome("Arthur Gabriel");
        cliente.setCpf("123.456.789-10");

        Conta conta = new Conta(cliente, banco);

        conta.depositar(5000);
        conta.imprimeExtrato();

        Cliente outroCliente = new Cliente();
        outroCliente.setNome("Raissa Mayara");
        outroCliente.setCpf("000.000.000-00");

        Conta novaConta = new Conta(outroCliente, banco);

        novaConta.depositar(1000);
        novaConta.sacar(200);
        novaConta.imprimeExtrato();

        conta.transferir(1000, novaConta);

        conta.imprimeExtrato();
        novaConta.imprimeExtrato();

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Magaly Pedrosa");
        cliente3.setCpf("999.999.999-00");

        Conta conta3 = new Conta(cliente3, banco);

        System.out.println("-------------------");

        banco.consultaContas();

    }



}
