package iset.project.village;

import lombok.Data;
import lombok.Generated;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@Data
public class village {
	 @Id
	    private int id ;
	    private String nomEtablisement ;
	    private String matricule ;
	    private String adresse ;
	    private int numTel ;
	    private String email ;
	    private String motDePasse ;
	    
	    
		public village() {}
		

		public village(int id, String nomEtablisement, String matricule, String adresse, int numTel, String email,String motDePasse) {
			this.id = id;
			this.nomEtablisement = nomEtablisement;
			this.matricule = matricule;
			this.adresse = adresse;
			this.numTel = numTel;
			this.email = email;
			this.motDePasse = motDePasse;
		}

		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getNomEtablisement() {
			return nomEtablisement;
		}
		
		public void setNomEtablisement(String nomEtablisement) {
			this.nomEtablisement = nomEtablisement;
		}
		
		public String getMatricule() {
			return matricule;
		}
		
		public void setMatricule(String matricule) {
			this.matricule = matricule;
		}
		
		public String getAdresse() {
			return adresse;
		}
		
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		
		public int getNumTel() {
			return numTel;
		}
		
		public void setNumTel(int numTel) {
			this.numTel = numTel;
		}
		
		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String getMotDePasse() {
			return motDePasse;
		}
		
		public void setMotDePasse(String motDePasse) {
			this.motDePasse = motDePasse;
		}
	    
	    
	    
	    

}
