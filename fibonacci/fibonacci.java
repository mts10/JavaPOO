import java.util.Scanner;



public class fibonacci {

public static void main(String[]args) {

try (Scanner teclado = new Scanner(System.in))

{

int fibonacci;

while(true){

System.out.println("Digite um numero inteiro(Se for digitado um numero negativo o programa nao ira rodar ate que seja inserido um numero positivo):\n");


fibonacci = teclado.nextInt();

if(fibonacci > 0) {
break;
}

}

int numAnterior =0;

int numAtual=0;

int numProximo=0;

for(int i =0; i < fibonacci; i++) {

if(numAtual==0) {

System.out.print(numAtual);

numAtual++;

System.out.print(numAtual);

}else {

numProximo = numAtual + numAnterior;

System.out.print(numProximo);

numAnterior = numAtual;

numAtual=numProximo;

}

}

}

}

}