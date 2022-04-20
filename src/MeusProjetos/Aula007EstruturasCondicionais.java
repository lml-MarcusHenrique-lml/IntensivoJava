package MeusProjetos;

public class Aula007EstruturasCondicionais {
    public static void main(String[] args) {
        double sal = 34711;
        double por = sal <= 34712 ? por = 9.70 : sal >= 34713 && sal <= 68507 ? por = 37.35 : 49.50;
        double imp = sal <= 34712 ? imp = por*sal/100: sal >= 34713 && sal <= 68507 ? imp = por*sal/100 :  por*sal/100;
        System.out.println("O salario é de R$"+sal+" então o imposto anual sera de "+por+"% que aquivale á R$"+imp+" de reais por ano!");

    }
}
