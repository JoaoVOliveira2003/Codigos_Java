//Precisa colocar essa Biblioteca
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        String nome;
        System.out.println("Escreva seu nome");
        nome = sc.nextLine();

        System.out.println("Seu nome é - " + nome);

    }
}
