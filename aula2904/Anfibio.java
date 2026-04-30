    public class Anfibio extends Animal{
    public Anfibio(){} 
    public Anfibio(String nome, int patas, double velocidade, int localizacao) {
        super(nome, patas, velocidade, localizacao);
    
    }

    public void mover(){
        System.out.println("Anfibio: "+ getNome() + " movendo-se ~ v ~ -->");
        int localAtual = getLocalizacao();
        localAtual ++ ;
        super.setLocalizacao(localAtual);
    }

    @Override
    public String toString() {
        return "Anfibio [Nome: " + getNome() + "\n"+
                ", Patas: " + getPatas() + "\n" +
                ", Velocidade: "+ getVelocidade() + "\n"+
                ", Localizacao: " + getLocalizacao() + "]";
    }
}