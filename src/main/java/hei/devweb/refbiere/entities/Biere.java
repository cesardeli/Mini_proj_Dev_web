package hei.devweb.refbiere.entities;

public class Biere {
	private Integer idbiere;
	private String nombiere;
	private String descriptionbiere;
	
	public Biere(Integer idbiere, String nombiere, String descriptionbiere) {
		super();
		this.idbiere = idbiere;
		this.nombiere = nombiere;
		this.descriptionbiere = descriptionbiere;
	}
	
	public Integer getIdbiere() {
		return idbiere;
	}

	public void setIdbiere(Integer idbiere) {
		this.idbiere = idbiere;
	}

	public String getNombiere() {
		return nombiere;
	}

	public void setNombiere(String nombiere) {
		this.nombiere = nombiere;
	}
	
	public String getDescriptionbiere() {
		return descriptionbiere;
	}

	public void setPaysBrasserie(String descriptionbiere) {
		this.descriptionbiere = descriptionbiere;
	}

}


