import java.sql.Date;

public class Revista extends Leitura {
    private Date data;
    private String editorial;
    private String reportagemCapa;
    private Date data2;

    public Revista(int codigo
    , String titulo
    , String editora
    , String edicao
    , java.util.Date date
    , String editorial
    , String reportagemCapa) {
        super(codigo, reportagemCapa, reportagemCapa, codigo);
        data2 = data;
        this.data = data2;
        this.editorial = editorial;
        this.reportagemCapa = reportagemCapa;
    }

    public Date getData() {
        return data;
    }
    public String getEditorial() {
        return editorial;
    }

    public String getReportagemCapa() {
        return reportagemCapa;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setReportagemCapa(String reportagemCapa) {
        this.reportagemCapa = reportagemCapa;
    }

}
