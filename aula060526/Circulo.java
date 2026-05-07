public class Circulo extends Forma2D {
    private double raio;

    public Circulo() {
        super(0.0, 0.0, "Círculo");
        this.raio = 0.0;
    }

    public Circulo(double raio) {
        super(raio, raio, "Círculo");
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}