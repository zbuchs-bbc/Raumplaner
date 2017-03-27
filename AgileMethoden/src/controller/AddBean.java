/**
 * Bildungszentrum Zürichsee BZZ
 * Fachgruppe IT
 * 
 * M151: Datenbank in Web-Applikation einbinden
 * Buchregal mit DB Version 0
 */
package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import model.DataTable;

/**
 * @author Markus Meier, Marcel Suter
 * @date 2017-07-24
 * @version 2.0
 */

@ViewScoped
@ManagedBean(name = "addBean")
public class AddBean {
	@ManagedProperty("#{regalBean}")
	private TableBean regalBean;
	private DataTable aktuell;

	/**
	 * Konstruktor
	 */
	public AddBean() {
		setRegalBean( new TableBean() );
		setAktuell(new Buch());
	}

	/**
	   * Speichert das aktuelle Buch im Regal
	   */
	  public String addBuch() {
	    regalBean.getRegal().add(aktuell);
	    return "list";
	  }

	/**
	 * @return the regalBean
	 */
	public TableBean getRegalBean() {
		return regalBean;
	}

	/**
	 * @param regalBean
	 *            the regalBean to set
	 */
	public void setRegalBean(TableBean regalBean) {
		this.regalBean = regalBean;
	}

	/**
	 * @return the aktuell
	 */
	public DataTable getAktuell() {
		return aktuell;
	}

	/**
	 * @param aktuell
	 *            the aktuell to set
	 */
	public void setAktuell(DataTable aktuell) {
		this.aktuell = aktuell;
	}

}
