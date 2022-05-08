public class Livro implements Publicação{
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

  public void detalhes(){
        System.out.println("--------------------");
        System.out.println("####  DADOS DO LIVRO  ####");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de Páginas: " + this.getTotPag());
        System.out.println("Leitor: " + this.leitor);
    }

    //metodo construtor 
    public Livro(String titulo, String autor, int totPag, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    //metodos especiaiss
    public String getTitulo(){
        return titulo;
    } 
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    } 
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getTotPag(){
        return totPag;
    } 
    public void setTotPag(int totPag){
        this.totPag = totPag;
    }
    public int getPagAtual(){
        return pagAtual;
    } 
    public void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }
    public boolean getAberto(){
        return aberto;
    }
    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }
    public Pessoa getLeitor(){
        return leitor;
    }
    public void setAberto(Pessoa leitor){
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
        
    }

    @Override
    public void fechar() {
        this.aberto = false;
        
    }

    @Override
    public void folhear(int p) {
        this.pagAtual = p;
        
    }

    @Override
    public void avançarPag() {
        this.pagAtual++;
        
    }

    @Override
    public void voltarPag() {
       this.pagAtual--;
        
    }









}
