package hei.devweb.refbiere.entities;

public class Couleur {

	private Integer idcouleur;
	private String nomcouleur;
	
	public Couleur(Integer idcouleur, String nomcouleur) {
		super();
		this.idcouleur = idcouleur;
		this.nomcouleur = nomcouleur;
	}
	
	public Integer getIdcouleur() {
		return idcouleur;
	}

	public void setId(Integer idcouleur) {
		this.idcouleur = idcouleur;
	}

	public String getNomcouleur() {
		return nomcouleur;
	}

	public void setNomcouleur(String nomcouleur) {
		this.nomcouleur = nomcouleur;
	}
}
