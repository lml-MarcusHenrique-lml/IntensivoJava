package MeusProjetos;

public class Aula003Operadores {
    public static void main(String[] args) {
        //  + - * / Aritimetico
        int numero1 = 20;
        int numero2 = 10;
        float tot = 20*10;

        System.out.println("A multiplicação de numero1 e numero2 é: "+ tot );
        int numero10 = 20;
        int numero20 = 10;
        float tot1 = 20*10;
        //  %     porcento
        int resto = 21%numero10;
        System.out.println("21 % "+numero10+" é "+resto);

        // > < <= >= == !=

        boolean dezMaiorQueVinte    = 10 > 20;
        boolean dezMenorQueVinte    = 10 < 20;
        boolean dezIgualVinte       = 10 == 20;
        boolean dezDiferneteVinte   = 10 != -20;
        boolean dezIgualDez         = 10 == 10;
        boolean vinteMiorQueDez     = 20 > 10;

        System.out.println("Dez é maior que Vinte? "+dezMaiorQueVinte);
        System.out.println("Dez é menor que Vinte? "+dezMenorQueVinte);
        System.out.println("Dez é igual que Vinte? "+dezIgualVinte);
        System.out.println("Dez é diferente que Vinte? "+dezDiferneteVinte);
        System.out.println("Dez é igual a Dez? "+dezIgualDez);
        System.out.println("Vinte é maior que Dez? "+vinteMiorQueDez);


    }
}
