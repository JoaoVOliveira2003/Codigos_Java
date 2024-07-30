// CliRecipiente.java
public class CliRecipiente {
    public static void main(String[] args) {
        Recipiente rec1 = new Recipiente();
        
        rec1.setCap(1000);
        rec1.setQtde(500);

        System.out.println("A capacidade de Rec1 é " + rec1.getCap() + 
                           ", estando com a quantidade de " + rec1.getQtde());


        Recipiente rec2 = new Recipiente(500);
        System.out.println("A capacidade de Rec2 é " + rec2.getCap() + 
                           ", estando com a quantidade de " + rec2.getQtde());

        Recipiente rec3 = new Recipiente(500,300,"Joao");
        System.out.println("A capacidade de Rec3 é " + rec3.getCap() + 
                            ", estando com a quantidade de " + rec3.getQtde() + " O dono disso é " + rec3.getNome());
    }
}
