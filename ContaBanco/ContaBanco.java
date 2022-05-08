public class ContaBanco {
//atributos
public int numConta;
protected String tipo;
private String dono;
private float saldo;
private boolean status; 

public void estadoAtual(){
  System.out.println("-------------------------");
  System.out.println("Conta: " + this.getNumConta());
  System.out.println("Tipo: " + this.getTipo());
  System.out.println("Dono: " + this.getDono());
  System.out.println("Saldo: " + this.getSaldo());
  System.out.println("Status:" + this.getStatus());
}


//metodos Personalizados
public void abrirConta(String t) { 
    this.setTipo(t);
    this.setStatus(true);
    if(t == "CC"){
        this.setSaldo(50);
        } else 
        {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!!!");
}
public void fecharConta(){
if(this.getSaldo() > 0){
    System.out.println("Conta não pode ser fechada pois ainda tem saldo...");
}else if (this.getSaldo() < 0){
    System.out.println("Conta não pode ser fechada pois ainda tem débito.");
} else{
    System.out.println("Conta fechada com sucesso!!");
}
}
public void depositar(float v)
{
if(this.getStatus()){
    //this.saldo = this.saldo + v; //mechendo direto com os atributos
    this.setSaldo(this.getSaldo() + v);//mechendo com os metodos
    System.out.println("Depósito realizado na conta " + this.getDono());
}else {
    System.out.println("Impossivel depositar em uma conta fechada!");
}
}
public void sacar(float v){
if(this.getStatus()){
    if(this.getSaldo() >= v){
        this.setSaldo(this.getSaldo() - v);
        System.out.println("Saque realizado com sucesso!");
    }else {
        System.out.println("Saldo insuficiente para saque.");
    }
}else {
    System.out.println("Impossivel sacar de uma conta fechada!");
}

}
public void pagarMensal(){
int v = 0;
if(this.getTipo()== "CC"){
    v = 12;
}else {
    v = 20;
}
if(this.getStatus()){
    this.setSaldo(this.getSaldo() - v);
    System.out.println("Mensalidade paga com sucesso por" + this.getDono());
}else{
    System.out.println("Impossivel pagar uma conta fechada!");
}
}

//Metodos Especiais 
public void ContaBanco() {
    this.saldo = 0;
    this.status = false;
}
public void setNumConta(int numConta){
    this.numConta = numConta;
}
public int getNumConta()
{
    return this.numConta;
}
public void setTipo(String tipo){
    this.tipo = tipo;
}
public String getTipo(){
    return this.tipo;
}
public void setDono(String dono){
    this.dono = dono;
}
public String getDono(){
    return this.dono;
}
public void setSaldo(float saldo){
    this.saldo = saldo;
}
public float getSaldo(){
    return this.saldo;
}
public void setStatus(boolean status){
 this.status = status;
}
public boolean getStatus(){
    return this.status;
}


}