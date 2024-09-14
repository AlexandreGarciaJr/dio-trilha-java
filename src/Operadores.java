public class Operadores {

    public static void main(String[] args) {
        String nomeUm = "Ale";
        String nomeDois = new String("Ale");

        System.out.println(nomeUm.equals(nomeDois));
        
        int numero1 = 5;
        int numero2 = 6;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2) {
            System.out.println("a nossa condição é verdadeira");
            
        }

        System.out.println("numero um é igual ao numero dois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero um é diferente que o numero dois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numero um é maior que o numero dois? " + simNao);
    }

}
