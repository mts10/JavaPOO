import java.util.Scanner;

public class parImpar {
    // Atributos
    public static Scanner teclado;

    // Funcoes e procedimentos
    public static String verificarParImpar(int n) {
        // Falta o codigo
        if (n % 2 == 0) {
            return "Par";
        } else {
            return "Impar";
        }        
    }

    public static int lerNumero() {
        // Criar um Scanner
        // Mostrar na tela digite numero
        // Retornar o numero lido
        int num;        
        System.out.println("Digite um numero inteiro:");
        num = teclado.nextInt();
        return num;
    }

    // Rotina principal
    public static void main(String[] args) {
        // Ler numeros ateh que
        // um numero negativo seja2
        
        // digitado
        int num;
        teclado = new Scanner(System.in);
        do {
            // ler um numero
            num = lerNumero();
            if (num > 0) {
                System.out.println(verificarParImpar(num));
            }
        } while (num >= 0);
        teclado.close();
    }
}