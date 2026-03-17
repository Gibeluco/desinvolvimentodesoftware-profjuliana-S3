import java.util.Scanner;

public class Aula {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("digite seu nome");
    String nome = sc.next();

    System.out.println("voce digitou um texto com "+ nome.length() + " caracteres");

    System.out.println("voce digitou outro nome");
    String nome2 = sc.next();
    if(nome.equalsIgnoreCase(nome2)){ // desconsidera a caixa
        System.out.println("São iguais");

    }else{
        System.out.println("são diferentes");
    }
   String TextoQuebrado[] = nome.split("");
   System.out.println("Texto quebrado" + TextoQuebrado[0]);
   System.out.println("tamanho da array" + TextoQuebrado[0]);

    sc.close(); // sempre no fim do codigo 
    }
}