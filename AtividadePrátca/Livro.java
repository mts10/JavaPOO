public class Livro extends Leitura {
    private String autor;
    private int anoPub;
    private int numPáginas;
    private String isbn;

    //metodos
    public Livro(int codigo
    , String titulo
    , String editora
    , String edicao
    , String autor
    , int anoPublicacao
    , int numPaginas
    , String isbn) {
        
        super(numPaginas, isbn, isbn, numPaginas);
        this.autor = autor;
        this.anoPub = anoPublicacao;
        this.numPáginas = numPaginas;
        this.isbn = isbn;

    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getAnoPub(){
        return anoPub;
    }
    public void setAnoPub(int anoPub){
        this.anoPub = anoPub;
    }
    public int getNumPaginas(){
        return numPáginas;
    }
    public void setNumPagnas(int numPáginas){
        this.numPáginas = numPáginas;
    }
    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }


}
