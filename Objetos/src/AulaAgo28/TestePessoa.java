package AulaAgo28;

import javax.swing.JOptionPane;

public class TestePessoa {
	public static void main(String[] args) {
		Pessoa joao = new Pessoa();
		Pessoa julia = new Pessoa();
		
		joao.setSexo(Pessoa.masculino);
		joao.setTelefone(JOptionPane.showInputDialog("Digite o telefone :)", "11-966687101"));
		joao.setNome(JOptionPane.showInputDialog("Digite o Nome:", "Bruno"));
		joao.setRaca(JOptionPane.showInputDialog("Digite a Raça:", "Preto"));
		joao.setIdade(JOptionPane.showInputDialog("Digite a Idade:", "18"));
	}
}
