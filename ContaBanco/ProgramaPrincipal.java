
public class ProgramaPrincipal {


public static void main(String[] args){
    ContaBanco p1 = new ContaBanco();
    p1.setNumConta(012405);
    p1.setDono("Saimon");
    p1.abrirConta("CC");
    p1.depositar(100);
    p1.sacar(150);
    p1.fecharConta();

    ContaBanco p2 = new ContaBanco();
    p2.setNumConta(222222);
    p2.setDono("Sabrina");
    p2.abrirConta("CP");
    p2.depositar(400);
    p2.sacar(210);



    p1.estadoAtual();
    p2.estadoAtual();
}

}



