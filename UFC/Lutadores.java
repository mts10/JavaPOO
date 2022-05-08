public class Lutadores {

private String nome;
private String nacionalidade;
private int idade;
private float altura;
private float peso;
private String categoria;
private int vitorias, derrotas, empates;

//Metodos especiais
public Lutadores(String no, String na, int id, float al, float pe, int vi, int de, int em){
nome = no;
nacionalidade = na;
idade = id;
altura = al;
this.setPeso(pe);
vitorias = vi;
derrotas = de;
empates = em;

}
//metodos públicos 
public void apresentar(){
    System.out.println("--------------------------------------------");
    System.out.println("CHEGOU A HORA!\nApresentamos o lutador: " + this.getNome() );
    System.out.println("Nacionalidade: " + this.getNac());
    System.out.println("Idade: " + this.getIdade() + " anos ");
    System.out.println("Altura: " + this.altura);
    System.out.println("Peso: " + this.peso + "kg");
    System.out.println("Vitórias: " + this.getVitorias());
    System.out.println("Derrotas: " + this.getDerrotas());
    System.out.println("Empates: " + this.getEmpates());

}   
public void status(){
System.out.println(this.getNome() + " é um peso " + this.getCategoria());
System.out.println("Ganhou " + this.getVitorias() + "vezes");
System.out.println("Perdeu " + this.getDerrotas() + "vezes");
System.out.println("Empatou " + this.getEmpates() + "vezes");
}
public void ganharLuta(){
setVitorias(this.getVitorias() + 1);
}
public void perderLuta(){
setDerrotas(this.getDerrotas() + 1);
}
public void empatarLuta(){
setEmpates(this.getEmpates() + 1);
}

public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
}
public String getNac(){
    return nacionalidade;
}
public void setNac(String nacionalidade){
    this.nacionalidade = nacionalidade;
}
public int getIdade(){
    return idade;
}
public void setIdade(int idade){
    this.idade = idade;
}
public float getAltura(){
    return altura;
}
public void setAltura(float altura){
    this.altura = altura;
}
public float getPeso(){
    return peso;
    
}
public void setPeso(float peso){
    this.peso = peso;
    this.setCategoria();
}
public String getCategoria(){
    return categoria;
}
private void setCategoria(){
    if(this.peso < 52.2){
        this.categoria = "Inválido";
    }else if(this.peso <= 70.3){
        this.categoria = "Leve";
    }else if(this.peso <= 83.9){
        this.categoria = "Médio";
    }else if (this.peso <= 120.2){
        this.categoria ="Pesado";
    }else {
        this.categoria = "Inválido";
    }
}
public int getVitorias(){
    return vitorias;
}
public void setVitorias(int vitorias){
    this.vitorias = vitorias;
}
public int getDerrotas(){
    return derrotas;
}
public void setDerrotas(int derrotas){
    this.derrotas = derrotas;
}
public int getEmpates(){
    return empates;
}
public void setEmpates(int empates){
    this.empates = empates;
}





}