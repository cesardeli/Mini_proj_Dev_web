package hei.devweb.refbiere.manager;

import java.util.List;

import hei.devweb.refbiere.dao.PaysDao;
import hei.devweb.refbiere.dao.impl.PaysDaoImpl;
import hei.devweb.refbiere.entities.Pays;


public class PaysManager {

	private static PaysManager instance;

	private PaysDao paysDao = new PaysDaoImpl();

	public static PaysManager getInstance() {
		if (instance == null) {
			instance = new PaysManager();
		}
		return instance;
	}

	private PaysManager() {
	}

	public List<Pays> listerPays() {
		System.out.println("Dans Méthode : listerPays");
		System.out.println(paysDao.listerPays());
		return paysDao.listerPays();
	
	}
}
