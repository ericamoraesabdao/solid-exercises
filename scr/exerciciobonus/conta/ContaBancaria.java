package scr.exerciciobonus.conta;

import scr.exerciciobonus.cliente.Cliente;
import scr.exerciciobonus.notificacao.NotificacaoService;

public abstract class ContaBancaria implements Conta{
    private Cliente cliente;
    private int numeroConta;
    private int digito;
    protected double saldo;
    private TipoConta tipoConta;

    public ContaBancaria(Cliente cliente, int numeroConta, int digito, double saldo, TipoConta tipoConta) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.digito = digito;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }


    @Override
    public void depositar(double valor) {
        saldo += valor;
        NotificacaoService.enviarNotificacao("Depósito de R$" + valor + " realizado com sucesso.");
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            NotificacaoService.enviarNotificacao("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            NotificacaoService.enviarNotificacao("Saldo insuficiente para saque.");
        }
    }

    @Override
    public abstract double calcularTaxa();
}
