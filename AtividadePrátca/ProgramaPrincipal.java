import java.util.Date;

public class ProgramaPrincipal {
 
    public static void main(String[] args){
        Livro l = new Livro(
          1
        , "Livro teste"
        , "Editora teste"
        , "3a ed."
        , "Autor teste"
        , 2022
        , 457
        , "2003900044");
System.out.println(l);
        
        
        Revista r = new Revista(2
        , "Revista teste"
        , "Editora revista teste"
        , "2a ed."
        , new Date(2022, 4, 13)
        , "Editorial revista teste"
        , "Reportagem teste");

        
        System.out.println(r);
}
}
