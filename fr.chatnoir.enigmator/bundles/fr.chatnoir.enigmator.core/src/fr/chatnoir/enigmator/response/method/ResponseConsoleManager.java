package fr.chatnoir.enigmator.response.method;

public class ResponseConsoleManager implements IResponseManager {

	@Override
	public void sendResponse(String information) {
		System.out.println(information);
	}

}
