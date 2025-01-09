package scr.exercicio5;

public class Computador {
    private final DispositivoEntrada dispositivoEntrada;

    public Computador(DispositivoEntrada dispositivoEntrada) {
        this.dispositivoEntrada = dispositivoEntrada;
    }

    public void usarDispositivo() {
        dispositivoEntrada.usar();
    }
}

