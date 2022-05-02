package MeusProjetos;

public class Aula009EstruturasCondicionaisDoWhileForEx002 {
    public static void main(String[] args) {
        int valorTotal =30000;
        for (int parcela = 1; parcela < valorTotal; parcela++) {
            double valorParcela =valorTotal/parcela;
            if (valorParcela>=1000){
                System.out.println("A "+parcela+"ª é de R$"+valorParcela);
            } else {
                break;
            }
        }
    }
}
