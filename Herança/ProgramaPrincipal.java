public class ProgramaPrincipal {

     public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();

       //alunos
       Aluno a1 = new Aluno();
       a1.setNome("Saiminho");
       a1.setMat(21);
       a1.setCurso("Informática");
       a1.setIdade(18);
       a1.setSexo("M");
      System.out.println(a1.toString());

       //bolsista
       Bolsista b1 = new Bolsista();
       b1.setMat(20);
       b1.setIdade(21);
       b1.setNome("Sabrina");
       b1.setBolsa(50f);
       b1.setSexo("F");
       b1.setCurso("Direito");
       System.out.println(b1.toString());

       //professores
       Professor p1 = new Professor();
       p1.setNome("Guanabara");
       p1.setIdade(48);
       p1.setSexo("M");
       p1.setEsp("Programação");
       p1.setSalario(5412.00f);
       p1.ReceberAum(521.00f);
       System.out.println(p1.toString());
       
       //funcionario
       Funcionario f1 = new Funcionario();
       f1.setNome("Ceznha");
       f1.setIdade(41);
       f1.setSexo("M");
       f1.setSetor("Financeiro");
       f1.setTrab(true);
       System.out.println(f1.toString());
           
       
        

    }
    
}
