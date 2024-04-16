public class EstruturasBasicasIfSwichCase {
    public static void main(String[] args) {
        int a = 2, b = 2, c = 4;

        // Estrutura If-Else
        if (b > a) {
            System.out.println("A maior do que B");
        } else if (b < a) {
            System.out.println("B menor do que A");
        } else {
            System.out.println("B igual a A");
        }

        // Estrutura Switch-Case
        switch (c) {
            case 4:
                System.out.println("C é 4");
                break;
            case 2:
                System.out.println("C é 2");
                break;
            default:
                System.out.println("Valor de C não corresponde a nenhum caso especificado");
        }
    }
}
