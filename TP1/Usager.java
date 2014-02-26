package test;

import java.beans.*;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Usager implements Serializable{
	
	private String id = "";
	private String nom_usager = "";
	private String mot_de_passe = "";
	private String adresse=""; 
	private Object photo = null ;
	
	private PropertyChangeSupport propertySupport;
	
	public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return this.id;
    }
    public String getNom_usager() {
		return nom_usager;
	}
	public void setNom_usager(String nom_usager) {
		this.nom_usager = nom_usager;
	}
	public String getMot_de_passe() {
		return mot_de_passe;
	}
	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Object getPhoto() {
		return photo;
	}
	public void setPhoto(Object photo) {
		this.photo = photo;
	}
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertySupport.addPropertyChangeListener(listener);
	}
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		propertySupport.removePropertyChangeListener(listener);
	}
}
