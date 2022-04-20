package MeusProjetos;

public class Aula004OperadoresLogicos {
    // && (AND) || (or) ;
    public static void main(String[] args) {


        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3380;

        System.out.println("Está dentro da lei, maior que trinta? "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("Está dentro da lei, menor que trinta? "+isDentroDaLeiMenorQueTrinta);

        // Automatização de compra;
        double valorContaCorrente = 1500.00d;
        double valorContaPoupança = 1000d;
        float valorPs5 = 5450.99f;
        boolean isPs5Compravel = valorContaCorrente > valorPs5 || valorContaPoupança > valorPs5;
        if (isPs5Compravel == true) {
            System.out.println("" +
                    "" +
                    "");
            System.out.println("=================================================================");
            System.out.println( "Extrato Cc R$ 3750,00");
            System.out.println("" +
                    "Extrato Cp R$ 16.574,25 ");
            System.out.println("" +
                    "Valor De Laçamento Console Ps5 R$ 5.450,99");
            System.out.println("" +
                    "A compra será efetuada de forma altomatica após o lançamento! " +
                    "whait...");
            System.out.println("" +
                    "Pré compra efentuada com suacesso! " +
                    "Status da compra: " +isPs5Compravel);
        } else if (isPs5Compravel== false){

            System.out.println("=================================================================");
            System.out.println( "Extrato Cc R$ 3750,00");
            System.out.println("" +
                    "Extrato Cp R$ 1.000,00 ");
            System.out.println("" +
                    "Valor De Laçamento Console Ps5 R$ 5.450,99");
            System.out.println("" +
                    "A compra será efetuada de forma altomatica após o lançamento! " +
                    "whait...");

            System.out.println("ERROR!!!, Não á saldo suficiente para efetuar a compra. " +
                    "" +
                    "Favor, verificar dados e tentar novamente. " +
                    "Status da compra: "+isPs5Compravel);
        }
    }
}
