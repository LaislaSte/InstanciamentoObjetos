
package com.mycompany.aula02;

class Produto extends Object{
	public int codigo;
	public String nome;
	public int quant;
	public double preco;
	public Produto(int c, String n, int q, double p){
		codigo =  c;
		nome = n;
		quant = q;
		preco = p;
	}
}

public class TestaProduto {
    public static void main(String args[]) {
        String s = "";
	Produto produto;
	produto = new Produto(10, "Sabonete", 12, 1.20);
	System.out.println(produto.codigo + s + produto.nome);
	System.out.println(produto.quant + s + produto.preco);
	produto.quant = 100;
	System.out.println(produto.quant + s + produto.preco);
	produto.preco *= 1.10;		
	System.out.println(produto.quant + s + produto.preco);
    }
}
