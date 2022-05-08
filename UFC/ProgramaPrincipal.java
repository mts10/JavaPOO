public class ProgramaPrincipal {
    public static void main(String[] args) {

        Lutadores l[] = new Lutadores[6];

        l[0] = new Lutadores("Saiminho", "Brasil", 21, 1.85f, 68.9f,
                             21, 0, 0);
        l[1] = new Lutadores("Luquinhas", "França", 19, 1.98f, 85.4f, 15, 3, 1);

        l[2] = new Lutadores("Cezinha", "Suiça", 25, 1.75f, 102f, 21, 5, 0);

        l[3] = new Lutadores("Julio", "Brasil", 29, 1.87f, 90f, 5, 0, 0);

        l[4] = new Lutadores("Gordovaldo", "Argentina", 20, 1.82f, 82f, 1, 1, 0);

        l[5] = new Lutadores("Ratz", "Chile", 22, 1.82f, 68f, 10, 1, 0);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[5], l[2]);
        UEC01.lutar();
        l[5].status();

    }
}