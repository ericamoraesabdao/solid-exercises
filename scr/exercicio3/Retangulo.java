package scr.exercicio3;

public class Retangulo implements Forma {
    protected int largura;
    protected int altura;

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int getArea() {
        return this.altura * this.largura;
    }
}