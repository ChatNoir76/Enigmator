package fr.chatnoir.enigmator.service;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.osgi.framework.Version;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import fr.chatnoir.enigmator.Activator;

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
	
	/**
	 * R�cup�re la version de l'application
	 * @return La version du la feature / plugin
	 */
	public static Optional<Version> getVersion() {
		try {
			Version v = Platform.getProduct().getDefiningBundle().getVersion();
			return Optional.ofNullable(v);
		} catch(NullPointerException ex) {
			return Optional.ofNullable(null);
		}
	}
	
}
