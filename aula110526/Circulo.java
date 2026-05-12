public class Circulo extends Forma2D{ // necessario implementar area
    public Circulo (double altura, String nome){
        super(altura, nome);
    }

    public double area(){
        double pi = 3.14;
        double raio = getAltura() / 2; // o raio é a metade do diâmetro (altura)
        return (raio*raio)*pi;

        public String toString(){
            return "Circulo [altura:" + getAltura()/2 + "diâmetro:" + getAltura() + ", nome:" + getNome() + "]";
            
        
    }

}