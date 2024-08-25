public class Aluno {
    // Cria os atributos
    private String nome;
    private int rg;
    private Sala sala;
 
    // Cria os métodos construtores
    public Aluno() {}
 
    public Aluno(String nome) {
       this.nome = nome;
    }
 
    public Aluno(String nome, int rg) {
       this.nome = nome;
       this.rg = rg;
    }
 
    public Aluno(String nome, int rg, Sala sala) {
       this.nome = nome;
       this.rg = rg;
       this.sala = sala;
    }
 
    // Gets e Sets
    public String getNome() {
       return this.nome;
    }
 
    public void setNome(String nome) {
       this.nome = nome;
    }
 
    public int getRg() {
       return this.rg;
    }
 
    public void setRg(int rg) {
       this.rg = rg;
    }
 
    public Sala getSala() {
       return this.sala;
    }
 
    public void setSala(Sala sala) {
       this.sala = sala;
    }
 
    // toString
    public String toString() {
       return "\nNome: " + this.nome +
              "\nRG: " + this.rg;
    }
 }
 