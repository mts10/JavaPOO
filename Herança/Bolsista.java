public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Removendo a bolsa de " + this.nome);
    }
    public float getBolsa(){
        return bolsa;
    }
    public void setBolsa(float bolsa){
        this.bolsa = bolsa;
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista! Pagamento facilitado.");
    }
    @Override
    public String toString(){
         return "Dados{" + "nome= " + nome + ", idade= " + idade + ", sexo= " + sexo + ", curso = " + curso + ", bolsa = " + bolsa + "}";
    }
   
    
}
