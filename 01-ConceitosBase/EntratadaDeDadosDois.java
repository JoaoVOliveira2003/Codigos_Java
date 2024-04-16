import java.util.Scanner;

public class EntratadaDeDadosDois { 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        float altura;
        double doublatico;
        String nome;
        int idade;
        boolean ligado;

        System.out.println("Qual seu nome?");
        nome = sc.next();

        System.out.println("Qual sua idade?");
        idade = sc.nextInt();

        System.out.println("Escreva sua altura");
        altura = sc.nextFloat();

        System.out.println("Escreva um numero grande");
        doublatico = sc.nextDouble();

        System.out.println("A lampada do seu quarto esta ligada? [Escreva com True ou False]");
        ligado = sc.nextBoolean(); 

        if(ligado==true){
            System.out.println("Ola " + nome +" sua altura é " +altura+ " Sua idade é " + idade + "vc escrevu o numero " +doublatico +" e a sua lampada esta  ligada");
        }
        else{
            System.out.println("Ola " + nome +" sua altura é " +altura+ "Sua idade é " + idade + "vc escrevu o numero " +doublatico +" e a sua lampada esta  DesligadaJos");
        }
    }
}
