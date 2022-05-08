import java.util.Scanner;

public class idade {

    public static void main(String[] args) {
          
        try (Scanner t = new Scanner(System.in)) {
            System.out.println("Em que ano voce nasceu? ");
            int nasc = t.nextInt();
            int i = 2022-nasc;
            if(i>=18) {
                System.out.println("Voce é maior de Idade");
            }else {
                System.out.println("Voce é menor de Idade");
            }
        }

    }
}