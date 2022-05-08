public class Caneta {
    //atributos 
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;


    public Caneta(String m, String c, float p) { //metodo construtor
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void tampar() {
        this.tampada = true;
    }
    public void destampar()  {
        this.tampada = false;
    }

    public void status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo:"+ this.modelo);
        System.out.println("Cor:" + this.cor);
        System.out.println("Ponta:"+ this.ponta);
        System.out.println("Estado:"+ this.tampada);
    }


public static void main(String[] args) {
    Caneta c1 = new Caneta("NIC","Amarelo", 0.4f);
    c1.status();
    Caneta c2 = new Caneta("BIG ","Laranja", 1.5f);
    c2.status();
    Caneta c3 = new Caneta("FABER CASTEL","Vermelha", 2.1f);
    c3.status();
}




}
