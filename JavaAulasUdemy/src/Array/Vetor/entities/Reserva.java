package Array.Vetor.entities;

public class Reserva {
	private String nameCliente;
	private String emailCliente;
	
	public Reserva(String nameCliente, String emailCliente, int roomHotel) {
		this.nameCliente = nameCliente;
		this.emailCliente = emailCliente;
	}

	public String getNameCliente() {
		return nameCliente;
	}

	public void setNameCliente(String nameCliente) {
		this.nameCliente = nameCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	@Override
	public String toString() {
		return nameCliente+", "+emailCliente;
	}
	
	
	
	
	
}
