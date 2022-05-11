public class ProgramaPrincipal {
    public static void main(String[]args){
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Aves a = new Aves();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara ar = new Arara();

        //Canguru
        c.locomover();
        c.alimentar();
        c.emitirSom();
        System.out.println("-----------------------------");
        //Cachorro
        k.locomover();
        k.alimentar();
        k.emitirSom();
        System.out.println("-----------------------------");
        //Cobra
        co.locomover();
        co.alimentar();
        co.emitirSom();
        System.out.println("-----------------------------");
        //Peixe
        p.locomover();
        p.alimentar();
        p.emitirSom();
    }
}
