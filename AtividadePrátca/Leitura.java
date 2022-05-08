public class Leitura {
    private String editora;
    private int edição;

    //metodo construtor
    public Leitura(int codigo, String titulo, String editora, int edicao) {
        super();
        this.editora = editora;
        this.edição = edicao;
    }
    public String getEditora(){
        return editora;
    }
    public void setEditora(String editora){
        this.editora = editora;
    }
    public int getEdiçao(){
        return edição;
    }
    public void setEdiçao(int edicao){
        this.edição = edicao;
    }
}
