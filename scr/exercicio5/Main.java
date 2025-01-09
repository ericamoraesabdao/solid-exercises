package scr.exercicio5;

public class Main {
    public static void main(String[] args) {
        DispositivoEntrada teclado = new Teclado();

        DispositivoEntrada mouse = new Mouse();

        Computador computadorComTeclado = new Computador(teclado);
        computadorComTeclado.usarDispositivo();

        Computador computadorComMouse = new Computador(mouse);
        computadorComMouse.usarDispositivo();
    }
}
