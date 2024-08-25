import java.util.LinkedList;

public class Sala {
    private String nome;
    private String desc;
    private int qtde;
    
    // O atributo listAlunos é do tipo LinkedList que armazena objetos da classe Aluno
    private LinkedList<Aluno> listAlunos;

    // Construtores com sobrecarga
    public Sala() {
        listAlunos = new LinkedList<>();
    }

    public Sala(String nome) {
        listAlunos = new LinkedList<>();
        this.nome = nome;
    }

    public Sala(String nome, String desc) {
        listAlunos = new LinkedList<>();
        this.nome = nome;
        this.desc = desc;
    }

    public Sala(String nome, String desc, int qtde) {
        listAlunos = new LinkedList<>();
        this.nome = nome;
        this.desc = desc;
        this.qtde = qtde;
    }

    // Getters e Setters
    public LinkedList<Aluno> getListAlunos() {
        return this.listAlunos;
    }

    public void setListAlunos(LinkedList<Aluno> listAlunos) {
        this.listAlunos = listAlunos;
    }

    public void addAluno(Aluno aluno) {
        listAlunos.add(aluno);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQtde() {
        return this.qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    // Método toString para exibir informações da sala e dos alunos
    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (Aluno aluno : listAlunos) {
            temp.append(aluno).append("\n");
        }
        return "Nome da sala: " + this.nome + 
               " Descrição: " + this.desc + 
               " Quantidade de alunos: " + this.qtde + 
               "\nAlunos:\n" + temp;
    }
}
