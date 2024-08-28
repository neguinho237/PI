package AulaAgo28;

import javax.swing.JOptionPane;

public class TesteCirculo {
	public static void main(String[] args) {
		Circulo c = new Circulo();
		do {
			c.setRaio(Double.parseDouble(
			JOptionPane.showInputDialog("Digite o valor do raio")));
		}while(c.getRaio()<=0);
		JOptionPane.showMessageDialog(null, "Área do Círculo de raio "
			+ c.getRaio() + " = " + c.calcularArea(c.getRaio()));	
		JOptionPane.showMessageDialog(null, "Perímetro do Círculo de raio "
				+ c.getRaio() + " = " + c.calcularPerimetro(c.getRaio()));	
	}
}