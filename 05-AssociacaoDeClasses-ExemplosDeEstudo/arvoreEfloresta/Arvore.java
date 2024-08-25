public class Arvore {
    private String nome;
    private int altura;
    
    // Construtores
    public Arvore() {}

    public Arvore(String nome, int altura) {
        this.nome = nome;
        this.altura = altura;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Árvore: " + nome + ", Altura: " + altura + " metros";
    }
}
