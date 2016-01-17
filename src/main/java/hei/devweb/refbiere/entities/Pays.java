package hei.devweb.refbiere.entities;

public class Pays {

	private Integer idpays;
	private String nompays;
	
	public Pays(Integer idpays, String nompays) {
		super();
		this.idpays = idpays;
		this.nompays = nompays;
	}
	
	public Integer getIdpays() {
		return idpays;
	}

	public void setId(Integer idpays) {
		this.idpays = idpays;
	}

	public String getNomPays() {
		return nompays;
	}

	public void setNomPays(String nompays) {
		this.nompays = nompays;
	}
}
