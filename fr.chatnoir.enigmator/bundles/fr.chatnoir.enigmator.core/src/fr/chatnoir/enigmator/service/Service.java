package fr.chatnoir.enigmator.service;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import fr.chatnoir.enigmator.core.Activator;
import fr.chatnoir.enigmator.model.Enigmator;
import fr.chatnoir.enigmator.model.ModelFactory;
import fr.chatnoir.enigmator.model.operation;

public class Service {
	
	/**
	 * 
	 * @throws JoranException
	 * @throws IOException
	 */
	public static void configureLogbackInBundle() throws JoranException, IOException {
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
        JoranConfigurator jc = new JoranConfigurator();
        jc.setContext(context);
        context.reset();

        // this assumes that the logback.xml file is in the root of the bundle.
        Path logFile = new Path("resources/logback.xml");
        URL logbackConfigFileUrl = FileLocator.find(bundle, logFile, null);
        jc.doConfigure(logbackConfigFileUrl.openStream());
    }
	
	private static String execute(String input, operation o){
		Enigmator e = ModelFactory.eINSTANCE.createEnigmator();
		e.setSource(input);
		e.setTypeOperation(o);
		Optional<String> opt =  e.run();
		return opt.isPresent() ? opt.get() : "n/a";
	}
	
	public static String encrypt(String input) {
		return execute(input, operation.CRYPT);
	}
	
	public static String uncrypt(String input) {
		return execute(input, operation.UNCRYPT);
	}
	
}
