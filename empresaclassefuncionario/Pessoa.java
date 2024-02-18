
package empresaclassefuncionario;


public class Pessoa {
    
    //atributos da classe
    public String nome;
    private String filial;
    private char level;
        
    //-----------------------------------------------------------//
    //construtor padrão
    public Pessoa(){       
        
    }
    
    //construtor 2
    public Pessoa(String filial, char level){
        this.filial= filial;
        this.level= level;        
    }
        
    //construtor 2
    public Pessoa(String nome){
        this.nome= nome;
    }
    
    
    //-----------------------------------------------------------//
    //get e set
    public String getNome(){return nome;}
    public void setNome(String nome){this.nome=nome;}    
    
     //get e set
    public String getFilial(){return filial;}    
    public void setFilial( String filial){this.filial= filial;}
    
     //get e set
    public char getLevel(){return level;}    
    public void setLevel(char level){this.level=level;}      
    
    
    //-----------------------------------------------------------//
    //método
    public void mostraDados(){
        System.out.println("----------------------------------------");
        System.out.println("ObjP - Filial: " + filial + ", Level: " + level + ".");
        System.out.println("----------------------------------------");
    }
    
}
