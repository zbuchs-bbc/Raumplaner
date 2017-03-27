/**
 * Bildungszentrum Zürichsee BZZ
 * Fachgruppe IT
 * 
 * M151: Datenbank in Web-Applikation einbinden
 * Buchregal mit DB Version 0
 */
package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.Regal;

/**
 * @author	Markus Meier, Marcel Suter
 * @date 2017-07-24
 * @version 2.0
 */

@SessionScoped
@ManagedBean(name="tableBean")
public class TableBean {
	private Regal regal;
	
	/**
	 * Konstruktor
	 * Erstellt einige Bücher zum Testen
	 */
	public TableBean() {
		setRegal(new Regal());
	}
	
	/**
	 * @return the regal
	 */
	public Regal getRegal() {
		return regal;
	}
	/**
	 * @param regal the regal to set
	 */
	public void setRegal(Regal regal) {
		this.regal = regal;
	}

}
