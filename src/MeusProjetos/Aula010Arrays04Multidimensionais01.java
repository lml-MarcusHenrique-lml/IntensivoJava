package MeusProjetos;

public class Aula010Arrays04Multidimensionais01 {
  public static void main(String[] args) {
    /*criar arrays que se comnique com outras arrays ligando
    os meses a quatidade de dias que tem cada um deles
    ex;
    1,2,3,4,5 meses
    31,28.31,30
     */

      int dias[][]= new int[3][3];
      dias[0][0]=30;
      dias[0][1]=31;
      dias[0][2]=29;

      dias[1][0]=30;
      dias[1][1]=25;
      dias[1][2]=27;

      dias[2][0]=26;
      dias[2][1]=22;
      dias[2][2]=21;


      for(int i = 0; i < dias.length; i++) {
        for (int j = 0; j < dias[0].length; j++) {
        System.out.println(dias[i][j]);
        //
      }
      }
  }
}
