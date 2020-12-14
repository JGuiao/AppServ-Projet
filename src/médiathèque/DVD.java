package médiathèque;

public class DVD implements Document {
	Abonne ab;
	
	int numero;
	String titre;
	boolean adulte;
	boolean estDisponible;
	
	
	public DVD(int numero, String titre, boolean adulte, boolean estDisponible) {
		this.numero = numero;
		this.titre = titre;
		this.adulte = adulte;
		this.estDisponible = true;
	}
	
	@Override
	public int numero() {
		// TODO Auto-generated method stub
		return this.numero;
	}
	
	public boolean estPourAdulte() {
		return true;
	}
	
	public boolean estDisponible() {
		return true;
	}

	@Override
	public void reservationPour(Abonne ab) throws ReservationException {
		// TODO Auto-generated method stub

	}

	@Override
	public void empruntPar(Abonne ab) throws EmpruntException {
		// TODO Auto-generated method stub

	}

	@Override
	public void retour() {
		// TODO Auto-generated method stub

	}

}
