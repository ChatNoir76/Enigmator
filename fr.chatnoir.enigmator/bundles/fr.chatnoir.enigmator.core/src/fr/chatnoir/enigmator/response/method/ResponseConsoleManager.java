package fr.chatnoir.enigmator.response.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.lang.SystemUtils;

public class ResponseConsoleManager implements IResponseManager {
	
	@Override
	public void sendResponse(String information) {
		System.out.println(information);
		if(SystemUtils.IS_OS_WINDOWS) {
			System.out.print("press a key to terminate\n");
			try {
				new BufferedReader(new InputStreamReader (System.in)).readLine();
			} catch (IOException e) {}
		}
		
	}

}
