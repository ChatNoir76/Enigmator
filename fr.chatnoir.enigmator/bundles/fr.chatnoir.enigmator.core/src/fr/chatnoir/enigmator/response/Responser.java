package fr.chatnoir.enigmator.response;

import fr.chatnoir.enigmator.response.method.IResponseManager;
import fr.chatnoir.enigmator.response.method.ResponseConsoleManager;
import fr.chatnoir.enigmator.response.method.ResponseFileManager;
import fr.chatnoir.enigmator.response.method.ResponseLoggerManager;

/**
 * Classe qui permet de d�finir la m�thode de renvoie des informations trait�es
 * @author chatnoir
 *
 */
public class Responser {

	private static Responser me;
	private IResponseManager responseMethod;
	
	public static Responser eInstance() {
		if(me == null) {
			me = new Responser();
		}
		return me;
	}
	
	private Responser() {
		this.setAsConsole();
	}
	public void setAsConsole() {
		responseMethod = new ResponseConsoleManager();
	}
	public void setAsLogger() {
		responseMethod = new ResponseLoggerManager();
	}
	public void setAsFile(String filePath) {
		responseMethod = new ResponseFileManager(filePath);
	}
	/**
	 * Envoi la bonne m�thode au response manager
	 * @param response 
	 */
	public void injectResponseMethod(IResponse response) {
		response.setResponse(responseMethod);
	}
	
}
