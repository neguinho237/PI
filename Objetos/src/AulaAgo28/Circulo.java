package AulaAgo28;

import javax.swing.JOptionPane;
public class Circulo {
	private double raio;
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		if(raio>0)
			this.raio = raio;
		else
			JOptionPane.showMessageDialog(
				null, "O Raio deve ser maior que ZERO");
	}
	public double calcularArea(double raio) {
		return Math.PI*raio*raio;
	}
	public double calcularPerimetro(double raio) {
		return 2*Math.PI*raio;
	}
}