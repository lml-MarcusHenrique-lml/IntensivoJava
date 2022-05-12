package MeusProjetos;

public class Aula009EstruturasCondicionaisDoWhileForEx003 {
    //dado o valor de um carro, descubra em quantas ele pode pagar
    //condiação as parcelas não podem ser menor que 1000

    public static void main(String[] args) {
        int tot = 32000;
        for (int parc = 1; parc < tot; parc++) {
            double tparc = tot/parc;
            if (tparc >=1000 && parc <= 6) {
                System.out.println(parc + "º parcela de " + tparc);
                continue;


            } if (parc>6) {
                double juros = (1.5 * tparc) / 100;


                System.out.println(parc + "º com parcela acrecida de jurtos de R$" + (tparc  + juros));
                juros++;
                continue;
            }




        }
    }

}
