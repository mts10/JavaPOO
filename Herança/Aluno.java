public class Aluno extends Pessoa {
    private int matricula;
    protected String curso;

    //metodos
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
    }
    public int getMat(){
        return matricula;
    }
    public void setMat(int mat){
        this.matricula = mat;
    }
    public String getCurso(){
        return curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    @Override
    public String toString(){
         return "Dados{" + "nome= " + nome + ", idade= " + idade + ", sexo= " + sexo + ", matricula = " + matricula + ", curso = " + curso + "}";
    }
}
