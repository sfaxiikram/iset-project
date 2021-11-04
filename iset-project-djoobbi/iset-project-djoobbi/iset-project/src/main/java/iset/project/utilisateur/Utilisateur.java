package iset.project.utilisateur;

import lombok.Data;
import lombok.Generated;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@Data
public class Utilisateur {
    @Id
    private int id ;
    private String prenom ;
    private String nom ;
    private int cin ;
    private int numTel ;
    private String adresse ;
    private String email ;
    private String motDePasse ;

    public Utilisateur() {}

    public Utilisateur(int id, String prenom, String nom, int cin, int numTel, String adresse, String email, String motDePasse) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.cin = cin;
        this.numTel = numTel;
        this.adresse = adresse;
        this.email = email;
        this.motDePasse = motDePasse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
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
