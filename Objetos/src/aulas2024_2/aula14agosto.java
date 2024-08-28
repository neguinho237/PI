package aulas2024_2;

import javax.swing.JOptionPane;

//Objeto Aluno

public class aula14agosto {
	String nome, ra;
	short idade;
	double nt1, nt2;
	
	//Métodos de grvação
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setRa(String ra) {
	    this.ra = ra;
	}
	
	public void setIdade (short idade) {
		this.idade = idade;
	}
	
	public void setNt1 (double nt1) {
		this.nt1 = nt1;
	}
	 
	public void setNt2 (double nt2) {
		this.nt2 = nt2;
	}
	
	
	 //Métodos de leitura

	 public String getRa() {
		 return ra;
	 }
	 
	 public String getNome() {
		 return nome;
	 }
	 
	 public int getIdade() {
		 return idade;
	 }
	 
	 public double getNt1() {
		 return nt1;
	 }
	 
	 public double getNt2() {
		 return nt2;
	 }
	 
	 
	 
	 public void imprimir () {
		 //JOptionPane.showMessageDialog(null, "RA" + getRa() + "\n-Nome" + getNome());
		 System.out.println("RA: " + getRa() + "\tNome:" + getNome() + getNt1() + getNt2() + calcularMedia());
	 }
	 private Double calcularMedia() {
		 double media = (getNt1()+ getNt2())/2 ;
		 return media;
	 }
	 }
	 
	 


