package scr.exercicio3;

public class Quadrado implements Forma {
    protected int lado;

    public void setLado(int lado) {
        this.lado = lado;
    }


    @Override
    public int getArea() {
        return lado * lado;
    }
}
