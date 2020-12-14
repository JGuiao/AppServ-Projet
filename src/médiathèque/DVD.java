package médiathèque;

import java.util.Calendar;
import java.util.Date;

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
		return adulte;
	}
	
	public boolean estDisponible() {
		return estDisponible;
	}

	public boolean peutPrendre(Abonne ab){
		Date date1 = ab.getDateDeNaissance();
		Calendar today = Calendar.getInstance();
		Date ajd = today.getTime();
		if (ajd.compareTo(date1) > 0 || ajd.compareTo(date1) == 0){
			return true;
		}else
			return false;
	}
	@Override
	public void reservationPour(Abonne ab) throws ReservationException {
		if(this.peutPrendre(ab))
			this.ab = ab;
		

	}

	@Override
	public void empruntPar(Abonne ab) throws EmpruntException {
		estDisponible = false;
		this.ab = ab;

	}

	@Override
	public void retour() {
		this.ab = null;
		estDisponible = true;

	}

}
