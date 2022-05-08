import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {

      try (Scanner t = new Scanner(System.in)) {
      System.out.print("\nEscolha uma operaçao\n\n 1-Soma\n\n 2-Divisão\n\n 3-Subtração\n\n 4-Multiplicação\n\n");
          int op = t.nextInt();
          switch(op) {
            case 1:
            System.out.print("Digite o primeio numero: ");
            int n1 = t.nextInt();
            System.out.print("Digite o segundo numero: ");
            int n2 = t.nextInt();
            int soma = n1 + n2;
            System.out.println("O resultado da soma é " + soma);
            break;

            case 2: 
            System.out.print("Digite o primeio numero: ");
            int n3 = t.nextInt();
            System.out.print("Digite o segundo numero: ");
            int n4 = t.nextInt();
            int r = n3/n4;
            System.out.println("O resultado da soma é " + r);
            break;

            case 3: 
            System.out.print("Digite o primeio numero: ");
            int n5 = t.nextInt();
            System.out.print("Digite o segundo numero: ");
            int n6 = t.nextInt();
            int res = n5-n6;
            System.out.println("O resultado da soma é " + res);
            break;
            
            case 4: 
            System.out.print("Digite o primeio numero: ");
            int n7 = t.nextInt();
            System.out.print("Digite o segundo numero: ");
            int n8 = t.nextInt();
            int resultado = n7*n8;
            System.out.println("O resultado da soma é " + resultado);
            break;
          }

      } 
      
    }
}