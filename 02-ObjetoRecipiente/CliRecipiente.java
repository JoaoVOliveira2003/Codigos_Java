public class CliRecipiente {
    public static void main(String[] arg){
        Recipiente rec1 = new Recipiente();
        
        rec1.setCap(1000);
        rec1.setQtde(500);

        System.out.println("A capacidade de Rec1 é" + rec1.getCap() + 
        ",estando com a capicade de" + rec1.getCap());

    }
}