package model;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(){
        contas = new ArrayList<Conta>();
    }

    public void addConta(Conta conta){
        this.contas.add(conta);
    }

    public void consultaContas(){

        for (Conta conta : contas) {
            System.out.println(conta.toString());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
