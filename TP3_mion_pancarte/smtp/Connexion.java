/*********************************************************
 * methTestTP3
 * smtp
 * Connexion.java	
 * (c)methTestTP3 on 18 nov. 2013 21:09:54
 * By ken
 * Update 18 nov. 2013 21:09:54
*********************************************************/


/**
 * @author ken
 *
 */
public interface Connexion {

	/**
	 * 
	 */
	void close();

	/**
	 * @return
	 */
	String read();

	/**
	 * @param s
	 */
	void write(String s);

}
