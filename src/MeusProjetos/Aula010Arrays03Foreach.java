package MeusProjetos;

public class Aula010Arrays03Foreach {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2= {1,2,3,4,5};
        int[] numeros3 = new int[]{1,2,3,4,5};
       /* for (int i = 0; i <nuemros2.length; i++) {
            System.out.println(nuemros2[i]);*/


        for (int num : numeros3) {
            System.out.println(num);


            /* o exemplo abaixo reflete exatamente o que está acontecendo
         no exemplo acima no sistema for.

        int num = numeros3[0];
        System.out.println(num);
        int num = numeros3[1];
        System.out.println(num);
        int num = numeros3[2];
        System.out.println(num);

         */
            }

    }
}
