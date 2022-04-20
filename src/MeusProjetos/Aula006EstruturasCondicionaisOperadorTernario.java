package MeusProjetos;

public class Aula006EstruturasCondicionaisOperadorTernario {
    public static void main(String[] args) {
        // Doar se salario for maior que 5000
        double salario = 5000;
        String msgDoar= "Eu vou doar 100 Reais para o Deve Dojo";
        String msgNdoar= "Eu ainda não tenho condição de doar, mas pretendo ter!!!";
        //(condição) ? verdadeiro : falso;
        /* Operador ternario simplifica quando colocamos a condição que queremos, seguido de interrogação
        * com a menssagem verdadeira e falsa separada por dois pontos e finalizando com ponto e virgula.*/
        String res = salario >= 5000 ? msgDoar : msgNdoar;
        /*if (salario >= 5000) {
            res = msgDoar;
        } else {
            res = msgNdoar;
        }*/




        System.out.println(res);
    }
}
