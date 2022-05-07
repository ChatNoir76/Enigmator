package fr.chatnoir.enigmator;

import java.io.IOException;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import ch.qos.logback.core.joran.spi.JoranException;
import fr.chatnoir.enigmator.service.Service;


public class Activator implements BundleActivator {

	private static BundleContext bundleContext;
	public final static String PLUGIN_ID = "fr.chatnoir.enigmator.core";

	static BundleContext getContext() {
		return bundleContext;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.bundleContext = bundleContext;
		Thread.currentThread().setName("Enigmator");
		try {
			Service.configureLogbackInBundle();
		} catch (JoranException | IOException ex) {
			System.err.println("logger error : " + ex.getMessage());
		}
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.bundleContext = null;
	}
	
}
