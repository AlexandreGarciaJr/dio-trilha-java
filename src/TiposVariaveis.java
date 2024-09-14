import java.sql.Date;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        String meuNome = "Alexandre Junior";
        double salarioMinimo = 2500.33;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        final double VALOR_DE_PI = 3.14;
        char sexo = 'M';


        boolean resultado = true;
        double matem = (10 * 54) / (5 * 3);
        System.out.println(matem);
    }
}
