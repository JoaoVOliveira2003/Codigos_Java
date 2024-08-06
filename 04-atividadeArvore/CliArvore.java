public class CliArvore {
    public static void main(String[] args) {
        Arvore arvore01 = new Arvore("Cerejeira", 1.4f, true);
        Arvore arvore02 = new Arvore("Ipe", 2.0f, false);
        Arvore arvore03 = new Arvore("Cedro", 4.0f, true);

        System.out.println(arvore01);
        System.out.println(arvore02);
        System.out.println(arvore03);

        arvore01.mudancaDeEstacao();
        System.out.println(arvore01);

        System.out.println("Cortou o ipe");
        arvore02.cortarArvore();
        System.out.println(arvore02);

        arvore03.crescimentoArvore(2.3f);
        System.out.println(arvore03);


    }
}
