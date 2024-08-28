package aulas2024_2;

import javax.swing.JOptionPane;

public class cadastraAluno {
public static void main(String[] args) {
	int resp =0;
	do {
	
	String ra = JOptionPane.showInputDialog("Digite o RA:");
	String nome = JOptionPane.showInputDialog("Digite o Nome:");
	double nt1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1"));
	double nt2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
	
	aula14agosto aluno = new aula14agosto();
	aluno.setNome(nome);
	aluno.setRa(ra);
	aluno.setNt1(nt1);
	aluno.setNt2(nt2);
	
	aluno.imprimir();
	resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
	
	}while (resp==0);
} 
}
