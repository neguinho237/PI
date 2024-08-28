package AulaAgo28;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;

public class Nascimento {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		LocalDate dataAtual = LocalDate.now();		
		System.out.println("Data atual: " + dataAtual);		
		int anoNasc = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite o ano do nascimento:", 1965));
		int mesNasc = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite o mês do nascimento:", 7));
		int diaNasc = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite o dia do nascimento:", 17));		
		LocalDate dataNascimento = LocalDate.now().of(
				anoNasc, mesNasc, diaNasc);		
		int diasVividos = (int) ChronoUnit.DAYS.between(
				dataNascimento, dataAtual);
		
		System.out.println("Dias vividos: " + diasVividos);			
		
		LocalDate voltaTempo = LocalDate.now().minusDays(diasVividos);
		String nascPadraoBras =	
			voltaTempo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.println("Nascimento (EUA): " + voltaTempo);
		System.out.println("Nascimento (BR): " + nascPadraoBras);
	}
}