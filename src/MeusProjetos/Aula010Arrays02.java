package MeusProjetos;

public class Aula010Arrays02 {
    public static void main(String[] args) {
        //byte , short, int, long, float e double o valor é = 0
        //char '\u0000' ' ' representa um espaço em branco
        //bolean  apresenta false porque não foi execultado ação aida
        //String é igual a null, ou sejá, vazio
        String[] nomes = new String[4];

        nomes[0]="Saitama";
        nomes[1]="Goku";
        nomes[2]="Luffy";
        nomes[3]="Zoro";
        /*System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);*/

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
