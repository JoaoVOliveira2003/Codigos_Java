import java.util.*;

public class cliSala {
    public static void main(String[] Args){
        String strTemp;
        int  intTemp;
        char charTemp;
        Scanner sc = new Scanner(System.in);
        //aqui é criando a lista para ter os alunos
        LinkedList<Aluno> lAlunos = new LinkedList<Aluno>();

        Sala sala1 = new Sala();

        System.out.println("Insira o nome da sala - ");
        strTemp = sc.nextLine();
        sala1.SetNome(strTemp);

        System.out.println("Insira descrição da sala - ");
        strTemp = sc.nextLine();
        sala1.setDesc(strTemp);

        System.out.println("Insira a quantidade de alunos -");
        intTemp = sc.nextInt();
        sala1.setQtde(intTemp);

        do{
              //sc.nextLine();
              System.out.println("Insira o nome do aluno - ");
              strTemp = sc.nextLine();
              System.out.println("Insira o rg do aluno - ");
              intTemp = sc.nextInt();

              lAlunos.add(new Aluno(strTemp,intTemp,sala1))
              //sala1.SetNome(strTemp);

              System.out.println("Insira c/C para continuar e s/S para sair");
              strTemp = sc.next();
        }while(strTemp.charAt(0) != 's' && strTemp.charAt(0) != 'S' );

        sala1.setAlunos(lAlunos);
        System.out.println("Listando alunos");
        System.out.println(sala1);


    }
}