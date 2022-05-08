import java.util.Scanner;


public class Aluno {
    //atributos
    private int RGM;
    private String nome;
    private int anoIngresso;

public Aluno(int RGM, String nome, int anoIngresso) {
    this.RGM = RGM;
    this.nome = nome;
    this.anoIngresso = anoIngresso;
}
public int getRGM(){
    return this.RGM;
}
public String getNome() {
    return this.nome;
}

public int getAnoIngresso() {
    return this.anoIngresso;
}
public void setRGM(int RGM) {
    this.RGM = RGM;
}

public void setNome(String nome) {
    this.nome = nome;
}

public void setAnoIngresso(int anoIngresso) {
    this.anoIngresso = anoIngresso;
}

 public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Aluno alunos[] = new Aluno[5];
    for(int i = 0; i < 5; i++) {
        System.out.printf("--------- Aluno %d ----------\n", i + 1 );

    System.out.println("RGM:");
    int RGM = teclado.nextInt();
    System.out.println("Nome:");
    String nome = teclado.next();

    System.out.println("Ano Ingresso:");
    int anoIngresso = teclado.nextInt();

    alunos[i] = new Aluno(RGM, nome, anoIngresso);
    }

    System.out.println("----- Lista de Alunos -----\n");
        for (int i = 0; i < 5; i++) {
            System.out.printf("RGM: %d\nNome:%s\nAno Ingresso: %d", 
                alunos[i].getRGM(), 
                alunos[i].getNome(), 
                alunos[i].getAnoIngresso()
            );
        }
        teclado.close();
  }
}
