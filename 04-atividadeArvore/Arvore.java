public class Arvore {
    private String nome;
    private Float altura;
    private Boolean temFolhas;

    public Arvore() {}

    public Arvore(String nome) {
        this.nome = nome;
    }

    public Arvore(String nome, Float altura, Boolean temFolhas) {
        this.nome = nome;
        this.altura = altura;
        this.temFolhas = temFolhas;
    }

    public String getNome() {
        return this.nome;
    }

    public Float getAltura() {
        return this.altura;
    }

    public Boolean getTemFolhas() {
        return this.temFolhas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public void setTemFolhas(Boolean temFolhas) {
        this.temFolhas = temFolhas;
    }

    public void cortarArvore() {
        this.altura = 0f;
        this.temFolhas = false;
    }

    // Aqui é basicamente para falar que a árvore perdeu ou ganhou folhas
    public void mudancaDeEstacao( ) {
        this.temFolhas = !this.temFolhas;
        System.out.println("mudou estação");

    }

    public boolean crescimentoArvore(float altura) {
        if (altura > 0) {
            this.altura += altura;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Nome da árvore: " + this.nome + ", altura atual: " + this.altura + ", está com folhas: " + this.temFolhas;
    }
}
