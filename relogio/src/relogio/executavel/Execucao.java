package relogio.executavel;

import java.util.Scanner;

import relogio.classes.AnguloRelogio;

public class Execucao {

	static int horaInput;
	static int minutoInput;
	static boolean errorInput = false;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		CaputurarHora();
		CaputurarMinuto();

		if (!errorInput) {
			AnguloRelogio calcularAngular = new AnguloRelogio();
			int angulo = calcularAngular.retornaAnguloRelogio(horaInput, minutoInput);
			System.out.println("Hora Informada: " + horaInput + ":" + minutoInput);
			System.out.println("O angulo formado pelo ponteiro na hora " + horaInput + " e pelo ponteiro no minuto "
					+ minutoInput + " e " + angulo + "°");
		}

	}

	public static void CaputurarHora() {

		try {
			System.out.println("Por favor informe um valor referente a hora entre 0 e 23: ");
			horaInput = input.nextInt();
		} catch (Exception e) {
			errorInput = true;
			System.out.println("ATENCAO! Você digitou um caracter incompátivel com horas!");
			System.out.println("Reinicie para tentar novamente");
		}

		if (horaInput > 23 || horaInput < 0) {
			System.out.println("ATENCAO DIGITE APENAS DIGITE NUMEROS ENTRE 0 e 23!");
			CaputurarHora();
		}

	}

	public static void CaputurarMinuto() {

		try {
			System.out.println("Por favor informe um valor referente aos minutos entre 0 e 59: ");
			minutoInput = input.nextInt();
		} catch (Exception e) {
			errorInput = true;
			System.out.println("ATENCAO! Você digitou um caracter incompátivel com minutos!");
			System.out.println("Reinicie para tentar novamente");
		}

		if (minutoInput > 59 || minutoInput < 0) {
			System.out.println("ATENCAO DIGITE APENAS DIGITE NUMEROS ENTRE 0 e 59!");
			CaputurarMinuto();
		}

	}
}
