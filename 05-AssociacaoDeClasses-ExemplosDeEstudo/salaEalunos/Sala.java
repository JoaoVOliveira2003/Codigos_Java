// Utiliza lista dos alunos que estão nessa sala  
import java.util.LinkedList;

public class Sala {
   public String nome;
   public String desc;
   public int qtde;

   private LinkedList<Aluno> listaAlunos;
   
   public Sala() {
      listaAlunos = new LinkedList<>();
   }

   public Sala(String nome) {
      listaAlunos = new LinkedList<>();
      this.nome = nome;
   }

   public Sala(String nome, String desc) {
      listaAlunos = new LinkedList<>();
      this.nome = nome;
      this.desc = desc;
   }      

   public Sala(String nome, String desc, int qtde) {
      listaAlunos = new LinkedList<>();
      this.nome = nome;
      this.desc = desc;
      this.qtde = qtde;
   }

   // Fazer Set
   public void setNome(String nome) {
      this.nome = nome;
   }

   public void setDesc(String desc) {
      this.desc = desc;
   }

   public void setQtde(int qtde) {
      this.qtde = qtde;
   }

   public void setLista(LinkedList<Aluno> listaAlunos) {
      this.listaAlunos = listaAlunos;
   }

   // Fazer Get
   public String getNome() {
      return this.nome;
   }

   public String getDesc() {
      return this.desc;
   }

   public int getQtde() {
      return this.qtde;
   }

   public LinkedList<Aluno> getListaAlunos() {
      return this.listaAlunos;
   }

   // Fazer algo para adicionar um aluno na lista
   public void addAluno(Aluno aluno) {
      listaAlunos.add(aluno);
   }

   public void aumentarQuantidadeAlunos(int quantidade) {
      this.qtde += quantidade;
   }

   // Coloca o @Override
   @Override
   public String toString() {
      // Esse StringBuilder é basicamente uma variável de concatenação
      StringBuilder todosAlunos = new StringBuilder();

      // For para pegar os valores e colocar em todosAlunos
      for (int i = 0; i < listaAlunos.size(); i++) {
         todosAlunos.append(listaAlunos.get(i).toString()).append("\n");
      }

      return "Nome: " + this.nome + "\n" +
             "Descrição: " + this.desc + "\n" +
             "Quantidade: " + this.qtde + "\n" +
             "Alunos: " + todosAlunos;
   }
}
