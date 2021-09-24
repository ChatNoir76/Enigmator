package fr.chatnoir.enigmator.response;

import fr.chatnoir.enigmator.response.method.IResponseManager;

/**
 * Interface de communication entre l'utilisateur et l'application
 * @author chatnoir
 *
 */
public interface IResponse {
	/**
	 * Methode d'envoie de réponse après traitement
	 * @param info
	 */
	public void sendResponse(String info);
	/**
	 * Setter sur la méthode à utiliser
	 * @param method
	 */
	public void setResponse(IResponseManager method);
	
}
