public class Material{

public int código;
public String titulo;

public Material(int codigo, String titulo) {
    this.código = codigo;
    this.titulo = titulo;
}

public int getCódigo(){
    return código;
}
public void setCódigo(int código){
    this.código = código;
}
public String getTitulo(){
    return titulo;
}
public void setTitulo(String titulo){
    this.titulo = titulo;
}

}