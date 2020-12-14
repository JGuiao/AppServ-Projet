package m�diath�que;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Abonne {
	int numeroAbonn� ;
	String nom;
	Date dateDeNaissance;
	

	
	public Abonne(int numeroAbonn�, String nom, String dateDeNaissance) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.dateDeNaissance = sdf.parse(dateDeNaissance);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	     
		this.numeroAbonn� = numeroAbonn�;
		this.nom = nom;
	}



	public int getNumeroAbonn�() {
		return numeroAbonn�;
	}



	public void setNumeroAbonn�(int numeroAbonn�) {
		this.numeroAbonn� = numeroAbonn�;
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
