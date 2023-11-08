package fr.chatnoir.enigmator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;


public class Activator implements BundleActivator {

	private static BundleContext bundleContext;
	public final static String PLUGIN_ID = "fr.chatnoir.enigmator.core";

	static BundleContext getContext() {
		return bundleContext;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.bundleContext = bundleContext;
		Thread.currentThread().setName("Enigmator");
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.bundleContext = null;
	}
	
}
