public abstract class Forma2D {
    private double altura;
    private double largura;
    private String nome;

    public Forma2D() {
        this(0.0, 0.0, "Forma2D");
    }

    public Forma2D(double largura, double altura, String nome) {
        this.largura = largura;
        this.altura = altura;
        this.nome = nome;
    }

    public abstract double area();

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
