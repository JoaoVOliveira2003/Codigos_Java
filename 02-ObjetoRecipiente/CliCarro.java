public class CliCarro {
    public static void main(String[] args){
        Carro carro01 = new Carro();

        carro01.setCor("Rosa");
        carro01.setVel(72);
        carro01.setNome("Monza");
        System.out.println("O Carro 01 de " + carro01.getNome() + " "+carro01.getCor() +" "+ carro01.getVel()) ;
    }
}
