package hei.devweb.refbiere.entities;

public class Brasserie {

	private Integer idbrasserie;
	private String nombrasserie;
	private Integer paysbrasserie;
	
	public Brasserie(Integer idbrasserie, String nombrasserie, Integer paysbrasserie) {
		super();
		this.idbrasserie = idbrasserie;
		this.nombrasserie = nombrasserie;
		this.paysbrasserie = paysbrasserie;
	}
	
	public Integer getIdbrasserie() {
		return idbrasserie;
	}

	public void setId(Integer idbrasserie) {
		this.idbrasserie = idbrasserie;
	}

	public String getNombrasserie() {
		return nombrasserie;
	}

	public void setNombrasserie(String nombrasserie) {
		this.nombrasserie = nombrasserie;
	}
	
	public Integer getPaysBrasserie() {
		return paysbrasserie;
	}

	public void setPaysBrasserie(Integer paysbrasserie) {
		this.paysbrasserie = paysbrasserie;
	}

}
