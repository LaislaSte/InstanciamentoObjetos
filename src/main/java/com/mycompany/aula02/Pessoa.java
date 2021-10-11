
package com.mycompany.aula02;


public final class Pessoa {
    //atributo
    private final String nome;
    private final String sexo;
    private final String pais;
    
    public Pessoa(String nomea,String sexoa, String paisa){
        nome = nomea;
        sexo = sexoa;
        pais = paisa;
        System.out.println(nome);
        System.out.println(sexo);
        System.out.println(pais);        
    }

    public void Andar(){
        System.out.println(this.nome + " andou");
    }
    public void Falar(){
        System.out.println(this.nome + " falou");
    }
    public void Correr(){
        System.out.println(this.nome + " correu");
    }
    public void Estudar(){
        System.out.println(this.nome + " está estudando");
    }
    public void Brincar(){
        System.out.println(this.nome + " está brincando");
    }

}
