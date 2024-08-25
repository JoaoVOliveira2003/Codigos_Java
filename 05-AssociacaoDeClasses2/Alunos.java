public class Alunos {
    private String nome;
    private int rg;
    private Sala sala;

    // Métodos construtores
    public Alunos() {}

    public Alunos(String nome) {
        this.nome = nome;
    }

    public Alunos(String nome, int rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public Alunos(String nome, int rg, Sala sala) {
        this.nome = nome;
        this.rg = rg;
        this.sala = sala;
    }

    // Métodos acessores
    public String getNome() {
        return this.nome;
    }

    public int getRg() {  // Corrigido de 'Int' para 'int'
        return this.rg;
    }

    public Sala getSala() {
        return this.sala;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    // Método toString serve para ler os dados digitados
    @Override
    public String toString() {
        return "Nome aluno: " + this.nome + " RG: " + this.rg + " Sala: " + this.sala;
    }
}
