
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

	private ArrayList<DataTable> dataTableList;
	
	
	
	
	private void addData(){
		DataTable row1 = new DataTable("Schmids Zimmer", "es isch grusig", 10, 1, 20);
		
		dataTableList.add(row1);
	}

	/**
	 * Konstruktor
	 */
	public Regal() {

        /* TODO Verbindung zur Datenkbank öffnen */
		addData();
		

	}


	/**
	 * Fügt ein Buch ins Regal ein
	 * 
	 * @param buch
	 */
	public void add(DataTable aktuell) {
		dataTableList.add(aktuell);
	}

	/**
	 * Buch aus der ArrayList löschen
	 */
	public void delete(DataTable aktuell) {
		dataTableList.remove(aktuell);
	}

	/**
	 * Liest ein Buch aus der ArrayList aufgrund der Id
	 * 
	 * @return Buch
	 */
	public DataTable getBuchById(int id) {
		DataTable gesucht;
		gesucht = dataTableList.get(id);
		return gesucht;
	}

	public ArrayList<DataTable> getDataTableList() {
		return dataTableList;
	}

	public void setDataTableList(ArrayList<DataTable> dataTableList) {
		this.dataTableList = dataTableList;
	}


}
