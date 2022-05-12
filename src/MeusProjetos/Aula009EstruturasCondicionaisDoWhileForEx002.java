package MeusProjetos;

public class Aula009EstruturasCondicionaisDoWhileForEx002 {
    /*public static void main(String[] args) {
       int valorTotal =30000;
       for (int parcela = 1; parcela < valorTotal; parcela++) {
           double valorParcela =valorTotal/parcela;
           if (valorParcela>=1000){
               System.out.println("A "+parcela+"ª parcela é de R$"+valorParcela+"0 Reais");
           } else {
               break;
           }
       }
   }*/
    public static void main(String[] args) {
        int vT= 30000;
        for (int p = 1; p < vT; p++) {
            double tP = vT/p;
            if (tP>=1000){
                System.out.println("A "+p+"ª parcela é de R$"+ tP);
            } else{
                break;
            }
        }
    }
}