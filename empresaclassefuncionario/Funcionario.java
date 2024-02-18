
package empresaclassefuncionario;

public class Funcionario extends Pessoa {
    
    //atributos da Classe:
    private String nome;
    private String departamento;
    private double horasNormaisTrabalhadasNoMes;
    private double horasExtrasTrabalhadasNoMes;
    private double salarioPorHora;
    
    
    //----------------------------------CONSTRUTORES-------------------------------------//
    
     //construtor padrao: sem parâmentros/argumentos de entrada.
    public Funcionario(){
        
    }     
    
    //construtor personalizado
    public Funcionario(String nome, String depart, double hNormais,double hExtras, double salarioHr, String filial, char level){
        super(filial, level); //herança da Classe mãe
        this.nome= nome;
        departamento= depart;
        horasNormaisTrabalhadasNoMes= hNormais;
        horasExtrasTrabalhadasNoMes= hExtras;
        salarioPorHora= salarioHr;          
    }
    
     public Funcionario(String nome){
        super(nome);
        this.nome= nome;
    }   
     
        
    //----------------------------------GETS/SETS-----------------------------------------//
    
    //GET/SET   
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome= nome;}
    
    //GET/SET   
    public String getDepartamento() {return departamento;}
    public void setDepartamento(String departamento) {this.departamento= departamento;}
        
    //GET/SET   
    public double getHorasNormaisTrabalhadasNoMes(){return horasNormaisTrabalhadasNoMes;}
    public void setHorasNormaisTrabalhadasNoMes(double horasNormaisTrabalhadasNoMes) {this.horasNormaisTrabalhadasNoMes= horasNormaisTrabalhadasNoMes;}
        
    //GET/SET
    public double getHorasExtrasTrabalhadasNoMes(){return horasExtrasTrabalhadasNoMes;}
    public void setHorasExtrasTrabalhadasNoMes(double horasExtrasTrabalhadasNoMes){this.horasExtrasTrabalhadasNoMes= horasExtrasTrabalhadasNoMes;}
        
    //GET/SET  
    public double getSalarioPorHora(){return salarioPorHora;}
    public void setSalarioPorHora(double salarioPorHora){ this.salarioPorHora=salarioPorHora;}
        
    
    
     //-------------------------------MÉTODOS (FUNÇÕES)-------------------------------------//   
    
    public double calculaSalarioMensal(double hNormais,double hExtras, double salarioHr){
        double calculoHNmensal= hNormais * salarioHr;
        double calculoHEmensal= hExtras * salarioHr;
        double salarioPorMes= calculoHNmensal + calculoHEmensal;    

        if ("direcao".equals(departamento)) {  // Comparação correta de strings
              salarioPorMes *= 1.10;  // Aplica o bônus de 10%
        }    
        
        return salarioPorMes;                   
    }
    
    
    //VERSAO MODULAR 
    /*public double calculaSalarioMensalBonus(double salarioPorMes){
         double salarioComBonus = salarioPorMes;  // Inicializa com o salário padrão

        if ("direcao".equals(departamento)) {  // Comparação correta de strings
            salarioComBonus *= 1.10;  // Aplica o bônus de 10%
        }
        return 0;
        
    }*/
        
    
    //mostraDados();    
     @Override // serve pra reescrever a classe com os atributos e definições da minha Classe
    public String toString() {
        return  "\nFuncionario: " + nome + 
                "\nDepartamento: " + departamento + 
                "\nHorasEXTRASTrabalhadas/Mes= " + horasExtrasTrabalhadasNoMes +
                "\nHorasNormaisTrabalhadas/Mes= " + horasNormaisTrabalhadasNoMes +
                "\nSalário/Hora= " + salarioPorHora;   
    }      
        
    
    public void mostraSuper(){
        super.mostraDados();
        System.out.println("ObjF ");
        System.out.println("Nome: "+ nome);
        System.out.println("FROM: Super.Nome: "+ super.nome);        
    }
    
}
