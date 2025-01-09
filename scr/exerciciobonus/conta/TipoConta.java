package scr.exerciciobonus.conta;

public enum TipoConta {
    CONTACORRENTE("Conta corrente"),
    POUPANCA("Poupança");

    private final String descricao;

    TipoConta(String description) {
        this.descricao = description;
    }

    public String getDescricao() {
        return descricao;
    }
}
