import java.util.Random;

public class Luta {
    private Lutadores desafiado;
    private Lutadores desafiante;
    private int rounds;
    private boolean aprovada;

    //metodos públicos
    public void marcarLuta(Lutadores l1, Lutadores l2){
        if(l1.getCategoria() != l2.getCategoria()){
    this.aprovada = true;
    this.desafiado = l1;
     this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
             this.desafiante = null;
        }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatortio = new Random();
            int vencedor = aleatortio.nextInt(3);
            System.out.println("========= RESULTADO DA LUTA =========");
            switch(vencedor){
                case 0: //empato
                System.out.println("Empatou!");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;
                case 1://desafiado vence
                System.out.println("Vitória do " + this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;
                case 2://desafiante vence 
                System.out.println("Vitória do " + this.desafiante.getNome());
                this.desafiado.perderLuta();
                this.desafiante.ganharLuta();
                break;
            }
            System.out.println("=================");

        }else {
            System.out.println("A luta nao pode acontecer...");
        }
    }
public Lutadores getDesafiado(){
    return desafiado;
}
public void setDesafiado(Lutadores desafiado){
    this.desafiado = desafiado;
}
public Lutadores getDesafiante(){
    return desafiante;
}
public void setDesafiante(Lutadores desafiante){
    this.desafiante = desafiante;
}
public int getRounds(){
    return rounds;
}
public void setRounds(int rounds){
    this.rounds = rounds;
}
public boolean getAprovada(){
    return aprovada;
}
public void setAprovada(boolean aprovada){
    this.aprovada = aprovada;
}




}
