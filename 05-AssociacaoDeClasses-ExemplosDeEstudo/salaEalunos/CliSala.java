//Colocando tudo de java.util de uma vez
import java.util.*;

public class CliSala {
   public static void main(String[] args) {
      /*
       aqui vai ser utilizar 1 atributo int,string uma LinkedList e um scanner 
      */
      String strTemp;
      int intTemp = 0;
      LinkedList<Aluno> lAlunos = new LinkedList<>();
      Scanner sc = new Scanner(System.in);

      //Criando a sala que iremos utilizar
      Sala sala1 = new Sala();

      //Somente inserindo os dois valores de sala 
      System.out.println("Insira o nome da sala:");
      strTemp = sc.nextLine();
      sala1.setNome(strTemp);

      System.out.println("Insira a descrição da sala:");
      strTemp = sc.nextLine();
      sala1.setDesc(strTemp);

      System.out.println("Insira quantidade de alunos:");
      intTemp = sc.nextInt();
      sala1.setQtde(intTemp);

      sc.nextLine(); 

      //vai criando e preechendo os alunos dentro da lista
      do {
         System.out.println("Insira o nome do aluno: ");
         strTemp = sc.nextLine();
         System.out.println("Insira o RG do aluno: ");
         intTemp = sc.nextInt();

         sc.nextLine(); 

         lAlunos.add(new Aluno(strTemp, intTemp, sala1));

         System.out.println("Insira c/C para continuar ou s/S para sair: ");
         strTemp = sc.next();
         sc.nextLine(); 

      } while (strTemp.charAt(0) != 's' && strTemp.charAt(0) != 'S');

      //coloca os alunos na sala01
      sala1.setLista(lAlunos);

      //mostra na tela os alunos
      System.out.println(sala1);

      //fecha o scanner e FIM
      sc.close();
   } 
}
