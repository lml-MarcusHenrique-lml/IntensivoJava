package MeusProjetos;
// idade < 15 categoria infantil
// idade >= 15 && < 18 categoria Juvenil
// idade >= 18 categoria adulto
public class Aula005EtruturasCondicionais {
    public static void main(String[] args) {
        int id1 = 17;
        boolean isPodeComprarBebida = id1 >= 18;

        if (isPodeComprarBebida!= false) {
            System.out.println("O Consumidor tem "+id1+" , então é pode comprar bebida alcolica" +
                    "" +
                    "");
        } else if (isPodeComprarBebida != true) {
            System.out.println("O Consumidor tem apenas "+id1+", logo não está autorizado a comprar bebida!!!");
        }

    }
}
