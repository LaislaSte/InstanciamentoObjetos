
package com.mycompany.aula02;


public class ExemploProfessor {
    public static void main(String[] args){
        Professor professor01 = new Professor("Marlene", "feminino", "Brasil", "Letras");
        professor01.MinistrarAulas();
        professor01.ExplicarMateria();
        
        
        Professor professor02 = new Professor("Julio", "masculino", "Brasil", "Biologia");
        professor02.Estudar();
        professor02.CorrigirProva();
    }
    
}
