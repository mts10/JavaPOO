public class celular {
    //atributos
   private String modelo;
   public String cor;
   private String sistemOp;

   //mostrar Dados
   public celular(String modelo, String cor, String sistemaOp){
            this.modelo = modelo;
            this.cor = cor;
            this.sistemOp = sistemaOp;
   }

   public void status(){
    System.out.println("---------------------");
       System.out.println("SOBRE O CELULAR:");
       System.out.println("MODELO: " + this.modelo);
       System.out.println("COR: "+ this.cor);
       System.out.println("SISTEMA OPERACIONAL: " +this.sistemOp);
   }

   //metodos especiais
   public String getModelo(){
       return this.modelo;
   }
   public void setModelo(String m){
       this.modelo = m;
   }
   public String getCor(){
       return this.cor;
   }
   public void setCor(String c){
       this.cor = c;
   }
   public String getSistemaOp(){
       return this.sistemOp;
   }
   public void setSistemaOp(String sOp){
    this.sistemOp = sOp;
   }

}