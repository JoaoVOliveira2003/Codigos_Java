import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        String nome;

        System.out.print("Digite seu nome: ");
        Scanner sc = new Scanner(System.in);
        nome = sc.nextLine();
        sc.close();
        
        System.out.println("Olá, " + nome + "!");
    }
}
