package com.mycompany.aula02;

public class ExemploPessoa {

    
    public static void main(String args[]) {
        System.out.println("Primeira pessoa"); 
        Pessoa fulano01 = new Pessoa("Jorge", "nonbinery", "Brasil");
        fulano01.Andar();
        fulano01.Correr();
        fulano01.Brincar();

        System.out.println("Segunda pessoa");        
        Pessoa fulano02 = new Pessoa ("Leticia","Feminino","Italia");
        fulano02.Falar();
        fulano02.Estudar();
        
        
    }
}
