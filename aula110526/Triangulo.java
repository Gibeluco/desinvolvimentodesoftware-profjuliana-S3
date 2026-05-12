public class Triangulo extends Forma2D {
private String style;

//construtor padrao
 Triangulo () {
    super();
    style = "nada";
    }

// construtor para triangulos.
 Triangulo (String s, double w, double h) {
    super(w, h, "Triangulo");
    style = s;
    }
 //construtor para todos os lados iguais
     public Triangulo (double x, String s, String style){
     super(x, s);
     this.style = style;
    }
 // get e set
     public String getStyle() {
        return style;
    }
     public void setStyle(String style) {
        this.style = style;
    }
// Implementar metodo abstratos
        public double area() {
            return getLargura() * getAltura() / 2;
        }
    @Override
     public String toString() {
        return "Triangulo [style:" + style
                           + ", altura:" + getAltura() 
                           + ", largura:" + getLargura()
                           + ", nome:" + getNome() + "]";

    }


}