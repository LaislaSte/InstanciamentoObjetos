
package com.mycompany.aula02;

public class Professor {
    String nome;
    String sexo;
    String pais;
    String formacao;

    public Professor(String nomea, String sexoa,String paisa,String formacaoa){
        nome = nomea;
        sexo = sexoa;
        pais = paisa;
        formacao = formacaoa;
        System.out.println("O nome é " + nome);
        System.out.println("Genero é :" + sexo);
        System.out.println("Mora em "+pais);
        System.out.println("Formada(o) em "+formacao);
    }

    public void MinistrarAulas(){
        System.out.println(this.nome + " está dando aulas");
    }      
    public void Estudar(){
        System.out.println(this.nome + " está estudando");        
    }      
    public void ExplicarMateria(){
        System.out.println(this.nome + " está explicando a matéria");        
    }      
    public void CorrigirProva(){
        System.out.println(this.nome + " está corriugindo a prova");
    }
}
