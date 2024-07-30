public class Recipiente02 {
    // Declara atributos
    private int cap;   
    private int qtde;  

    // Criação de um método construtor que não recebe parâmetros
    public Recipiente02() {
        // Permite criar um objeto vazio e depois alterar seus valores como desejar.
    }

    // Criação de métodos construtores sobrecarregados

    public Recipiente02(int cap) {
        this.cap = cap;
    }

    public Recipiente02(int cap, int qtde) {
        this.cap = cap;
        this.qtde = qtde;
    }

    // Métodos acessores para acessar os valores dos atributos

    public int getCap() {
        return this.cap;
    }

    public int getQtde() {
        return this.qtde;
    }

    // O método setCap só altera o valor se cap for maior que 0
    public boolean setCap(int cap) {
        if (cap > 0) {
            this.cap = cap;
            return true;
        } else {
            return false;
        }
    }

    // O método setQtde só altera o valor se qtde for maior ou igual a 0
    public boolean setQtde(int qtde) {
        if (qtde >= 0) {
            this.qtde = qtde;
            return true;
        } else {
            return false;
        }
    }

    // Zera a quantidade
    public void esvaziar() {
        this.qtde = 0;
    }

    // Define a quantidade como a capacidade máxima
    public void encher() {
        this.qtde = this.cap;
    }

    // Adiciona uma quantidade se não exceder a capacidade
    public boolean adicionar(int qtde) {
        if ((this.qtde + qtde) <= this.cap) {
            this.qtde = this.qtde + qtde;
            return true;
        } else {
            return false;
        }
    }

    // Remove uma quantidade se não tornar a quantidade negativa
    public boolean remover(int qtde) {
        if ((this.qtde - qtde) >= 0) {
            this.qtde = this.qtde - qtde;
            return true;
        } else {
            return false;
        }
    }
}
