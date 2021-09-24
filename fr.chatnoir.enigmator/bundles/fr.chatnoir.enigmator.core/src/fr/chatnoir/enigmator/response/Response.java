package fr.chatnoir.enigmator.response;

import fr.chatnoir.enigmator.response.method.IResponseManager;

public class Response implements IResponse {

	private IResponseManager method;
	
	public static IResponse eInstance() {
		return new Response();
	}
	
	private Response() {
		Responser.eInstance().injectResponseMethod(this);
	}
	
	@Override
	public void sendResponse(String info) {
		method.sendResponse(info);
	}

	@Override
	public void setResponse(IResponseManager method) {
		this.method = method;
	}
	
	
}
