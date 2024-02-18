
package empresaclassefuncionario;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;


public class EmpresaClasseFuncionario {

   
    public static void main(String[] args) throws UnsupportedEncodingException {
        
        
         // Define UTF-8 na janela do Netbeans
        System.setOut(new PrintStream(System.out, true,"UTF8"));

        //CRIAR OBJETOS
        Funcionario f1= new Funcionario();  //construtor2, sem argumentos
        Funcionario f2= new Funcionario();  //construtor2, sem argumentos
        Funcionario f3= new Funcionario("Emilio", "gestao", 12, 31.5, 10.5, "Porto", 'A');
        Funcionario f4= new Funcionario("Carina", "direcao", 20, 15, 13, "Lisboa", 'B');
        
        //Aplicando método e atribuindo para um variavel para impressão
        double salariof3= f3.calculaSalarioMensal(10, 20, 5);
        double salariof4= f4.calculaSalarioMensal(13, 2, 40);
        
        //Aplicando método e atribuindo para um variavel para impressão
        String printf3= f3.toString();
        String printf4= f4.toString();        
                
        //Impressões
        System.out.println("- DADOS DE FUNCIONÁRIOS(AS): " + printf3);
        System.out.println("Salário Mensal= " + salariof3);
        System.out.println(".......................................... ");
        System.out.println("- DADOS DE FUNCIONÁRIOS(AS): " + printf4);
        System.out.println("Salário Mensal= " + salariof4);  
        
        
        //------------------TESTES TESTES TESTES TESTES TESTES TESTES---------------//
        
        //chamando função
        f3.mostraSuper();
        Funcionario f5= new Funcionario("Carlos");
        f5.mostraSuper();  //nesse caso o valor "Carlos" será atribuído tanto a classe local quanto a superClasse pois na classe Funcionário
                           //existe um construtor que "alimenta" ambos atributos, ou seja, o atributo com o mesmonome na Classe Mãe e filho, não estão DIRETAMENTE ligados.
        
        //--------------------------------------------------------------------------//
        
        //criando objetos
        Funcionario F6= new Funcionario("F6: SÓnOME");
        Funcionario f7= new Funcionario();
        Funcionario f8= new Funcionario("f8: ArgsCompletos", "casa",12.4, 3.5, 5.7, "Porto", 'd');
        
        System.out.println("...........................");
        System.out.println(F6.getNome());
        System.out.println(F6.calculaSalarioMensal(45, 34, 1));       
        System.out.println(F6.getDepartamento());
        
        System.out.println("...........................");
        System.out.println(f8.getNome());
        System.out.println(f8.getDepartamento());
        System.out.println(f8.toString());
        f8.mostraSuper();
        
        //-------------------------------------------------------------//
        Pessoa p1= new Pessoa();
        Pessoa p2= new Pessoa("Erika");
        Pessoa p3= new Pessoa("Guarda", 'A');
        

        System.out.println(p1.getFilial());
        System.out.println(p2.getFilial());
        System.out.println(p3.getFilial());
        
        p3.setLevel('l');
        System.out.println(p3.getLevel());
        
        p1.mostraDados();
        p2.mostraDados();       
        p3.mostraDados();
        
        
        
    }
    
}
