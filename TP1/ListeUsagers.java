package test;

import java.beans.*;
import java.io.Serializable;
import java.util.Hashtable;
public class ListeUsagers implements Serializable {
	 
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Hashtable<String, Usager> liste = new Hashtable<String, Usager>();
	 private PropertyChangeSupport propertySupport;
	 public ListeUsagers() {
	 propertySupport = new PropertyChangeSupport(this);
	 }

	 public void ajouterUsager(String id, String nom_usager, String mot_de_passe, String adresse, Object photo){
	 Usager user = new Usager();
	 user.setId(id);
	 user.setNom_usager(nom_usager);
	 user.setMot_de_passe(mot_de_passe);
	 user.setAdresse(adresse);
	 user.setPhoto(photo);
	 liste.put(id, user);
	 }
	 
	 public Usager findPersonne(String nom){
	 return (Usager) liste.get(nom);
	 }
	 
	 public void addPropertyChangeListener(PropertyChangeListener listener) {
	 propertySupport.addPropertyChangeListener(listener);
	 }
	 
	 public void removePropertyChangeListener(PropertyChangeListener listener) {
	 propertySupport.removePropertyChangeListener(listener);
	 }
	

}
