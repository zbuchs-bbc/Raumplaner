
/**
 * Bildungszentrum Zürichsee BZZ
 * Fachgruppe IT
 * 
 * M151: Datenbank in Web-Applikation einbinden
 * Buchregal mit DB Version 0
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.util.ArrayList;

/**
 * @author Markus Meier, Marcel Suter
 * @date 2017-07-24
 * @version 2.0
 */
public class Regal {
	/* TODO Attribute für Datenbankzugriffe deklarieren */

	private ArrayList<DataTable> dataTable;

	/**
	 * Konstruktor
	 */
	public Regal() {

		setDataTable(new ArrayList<DataTable>());
		
        /* TODO Verbindung zur Datenkbank öffnen */
		
		

	}


	/**
	 * Fügt ein Buch ins Regal ein
	 * 
	 * @param buch
	 */
	public void add(DataTable aktuell) {
		dataTable.add(aktuell);
	}

	/**
	 * Buch aus der ArrayList löschen
	 */
	public void delete(DataTable aktuell) {
		dataTable.remove(aktuell);
	}

	/**
	 * Liest ein Buch aus der ArrayList aufgrund der Id
	 * 
	 * @return Buch
	 */
	public DataTable getBuchById(int id) {
		DataTable gesucht;
		gesucht = dataTable.get(id);
		return gesucht;
	}

	/**
	 * @return the buecher
	 */
	public ArrayList<DataTable> getDataTable() {
		return dataTable;
	}

	/**
	 * @param buecher
	 *            the buecher to set
	 */
	public void setDataTable(ArrayList<DataTable> dataTable) {
		this.dataTable = dataTable;
	}

}
