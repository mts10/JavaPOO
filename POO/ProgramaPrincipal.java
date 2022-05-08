public class ProgramaPrincipal {
    public static void main(String[] args){
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Matheus", 25, "Masculino");
        p[1] = new Pessoa("Lucas", 15, "Masculino");
       

        l[0] = new Livro("Mente Milionária","T Harver", 254, p[1]);
        l[1] = new Livro("Maturidade", "Luciano Subirá", 222, p[0]);
        l[2] = new Livro("Amor", "Sherek", 214, p[1]);

        l[1].avançarPag();

        l[0].detalhes();
        l[1].detalhes();
    }
}
