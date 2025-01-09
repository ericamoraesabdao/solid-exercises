package scr.exerciciobonus.conta;


import scr.exerciciobonus.cliente.Cliente;

public class Corrente extends ContaBancaria {
    public Corrente(Cliente cliente, int numeroConta, int digito, double saldo, TipoConta tipoConta) {
        super(cliente, numeroConta, digito, saldo, TipoConta.valueOf("CONTACORRENTE"));
    }

    @Override
    public double calcularTaxa() {
        return saldo * 0.01;
    }
}
