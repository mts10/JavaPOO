public class Professor extends Pessoa {
    private String espec;
    private float salario;

    //metodos 
    public void ReceberAum(float aum){
        this.salario += aum;
    }
    public String getEsp(){
        return espec;
    }
    public void setEsp(String espec){
        this.espec = espec;
    }
    public float getSalario(){
        return salario;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }
    @Override
    public String toString(){
         return "Dados{" + "nome= " + nome + ", idade= " + idade + ", sexo= " + sexo + ", espec = " + espec + ", salario = " + salario + "}";
    }
}
