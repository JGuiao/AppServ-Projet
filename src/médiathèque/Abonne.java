package médiathèque;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Abonne {
	int numeroAbonné ;
	String nom;
	Date dateDeNaissance;
	

	
	public Abonne(int numeroAbonné, String nom, String dateDeNaissance) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.dateDeNaissance = sdf.parse(dateDeNaissance);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	     
		this.numeroAbonné = numeroAbonné;
		this.nom = nom;
	}



	public int getNumeroAbonné() {
		return numeroAbonné;
	}



	public void setNumeroAbonné(int numeroAbonné) {
		this.numeroAbonné = numeroAbonné;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}



	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	
}
