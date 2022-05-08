
public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    //metodos 
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }
    public String getsetor(){
        return setor;
    }
    public void setSetor(String setor){
        this.setor = setor;
    }
    public boolean getTrab(){
        return trabalhando;
    }
    public void setTrab(boolean tra){
        this.trabalhando = tra;
    }
    public void cancelarMat() {
    }
    @Override
    public String toString(){
         return "Dados{" + "nome= " + nome + ", idade= " + idade + ", sexo= " + sexo + ", setor = " + setor + ", trabalhando = " + trabalhando + "}";
    }
}
