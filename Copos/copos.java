
public class copos {
    //atributos 
    public String modelo;
    public String cor;
    private String tamanho;
    private String marca;
    private boolean estado;

    //mostrar dados
    public void status() {
        System.out.println("-------------------");
        System.out.println("SOBRE O COPO:");
        System.out.println("Modelo de "+ this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tamanho: "+ this.tamanho);
        System.out.println("Marca: "+ this.marca);
        System.out.println("Estado: "+ this.estado);
    }

    //metodo construtor
    public copos(String modelo, String cor, String tamanho, String marca){
        this.modelo = modelo;
        this.cor = cor;
        this.tamanho = tamanho;
        this.marca = marca;
        this.cheio();
    }

    //metodos especiais
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    public String getTamanho(){
        return this.tamanho;
    }
    public void setTamanho(String t){
        this.tamanho = t;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String m){
        this.marca = m;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
   public void cheio(){
       this.estado = true;
   }
   public void vazio(){
    this.estado = false;
}

  

    }