/**
 * Bildungszentrum Zürichsee BZZ
 * Fachgruppe IT
 * 
 * M151: Datenbank in Web-Applikation einbinden
 * Buchregal mit DB Version 0
 */
package controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import model.DataTable;

/**
 * @author Markus Meier, Marcel Suter
 * @date 2017-07-24
 * @version 2.0
 */

@ManagedBean(name = "editBean")
@ViewScoped

public class EditBean {
	@ManagedProperty("#{regalBean}")
	private TableBean regalBean;
	private DataTable aktuell;

	/**
	 * Konstruktor
	 */
	public EditBean() {
		setRegalBean( new TableBean() );
	}
	/**
	   * Buch-Objekt aus ArrayList laden
	   */
	  @PostConstruct
	  public void init() {
	    setAktuell(getRegalBean().getRegal().getBuchById(getBuchId()));
	  }
	  
	  /**
	   * Änderungen am Buch speichern
	   * @return String
	   */
	  public String changeBuch() {
	    return "list";
	  }
	  
	  /**
	   * Parameter buchId aus der URL lesen
	   */
	  public int getBuchId() {
	    FacesContext facesContext = FacesContext.getCurrentInstance();
	    String id = facesContext.getExternalContext().getRequestParameterMap().get("buchId");
	    if (id == null) {
	      id = "0";
	    } 
	    return Integer.parseInt(id);
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