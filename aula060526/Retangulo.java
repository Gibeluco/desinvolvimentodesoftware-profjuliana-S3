public class Retangulo extends Forma2D {
    private double largura;
    private double altura;

    public Retangulo() {
        this.largura = 0;
        this.altura = 0;
    }

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double area() {
        return largura * altura;
    }
}