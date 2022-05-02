package MeusProjetos;

public class Aula008EstruturasCondicionaisSwitch {
    public static void main(String[] args) {
        // Imprima dia da semana, considerando 1 como Domingo
    /*  byte dia = 6;
        char, int, byte, short, enum String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("[ERROR] Não exite opção selecionada!");
                break;
        }*/
        //Utilizando switch  e dados os valores 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        byte dia = 1;
        switch (dia){
            case 1:
            case 7:
                System.out.println("final de semana!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("[ERROR] Opção invalida!" );
                break;
        }
    }
}
