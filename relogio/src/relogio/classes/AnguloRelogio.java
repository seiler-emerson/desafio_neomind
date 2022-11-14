package relogio.classes;

import java.util.Objects;

public class AnguloRelogio {

	private int hora;
	private int minutos;
	
	public AnguloRelogio() {
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hora, minutos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnguloRelogio other = (AnguloRelogio) obj;
		return hora == other.hora && minutos == other.minutos;
	}

	@Override
	public String toString() {
		return "AnguloRelogio [hora=" + hora + ", minutos=" + minutos + "]";
	}

	public int retornaAnguloRelogio(int hora, int minuto) {
		
		if(hora>12) {
			hora -=12;
		}
		
		int anguloHora = (360/12) * hora;
		int anguloMinuto = (360/60 * minuto);
		
		System.out.println("Angulo ponteiro hora: "+anguloHora );
		System.out.println("Angulo ponteiro minuto: "+anguloMinuto );

		if((anguloHora > anguloMinuto)) {
			return anguloHora - anguloMinuto;
		} else {
			return anguloMinuto - anguloHora;
		}
	}
}
