import java.util.Scanner;
import java.util.Random;

public class advinhacao {

public static void main(String[] args)
{
 try (Scanner t = new Scanner(System.in)){
    int num;
    int tentativas = 1;
    num = sorteado();
    System.out.println("\n######  BEM VINDO AO JOGO DE ADIVINHAÇÃO ######:\n### DIGITE UM NUMERO DE 1 A 100 E BOA SORTE!###\n\n");
    do{
      System.out.println("INISIRA O NUMERO:");
      int numInserido = t.nextInt();

      if(numInserido < 0 || numInserido > 100) {
        System.out.print("O NÚMERO DIGITADO PRECISA SER ENTRE 0 E 100. DIGITE DE NOVO!\n");
      }

      else if(tentativas > 10) {
        System.out.print("INFELIZMENTE AS SUAS CHANCES ACABARAM, REINICIE O JOGO!\n");
         tentativas = 11;
      }
      else if(numInserido > num){
        System.out.print("UUAUU!!QUASE VOCE ACERTOU, MAS AINDA É UM NUMERO MENOR!\n");
        tentativas++;
      }
      else if(numInserido < num){
        System.out.print("UUAUU!!QUASE VOCE ACERTOU, MAS AINDA É UM NUMERO MAIOR!\n");
        tentativas++;
      }
      else {
        System.out.println("PARABÉNS!!!!!\nVOCE ADIVINHOU O NUMERO!!!");
        tentativas = 11;
      }
      
    }while(tentativas <= 10);

 }

}
public static int sorteado(){
  int num; 
  Random gerador = new Random();
  num = 1 + gerador.nextInt(100);
  return num;
}



}



