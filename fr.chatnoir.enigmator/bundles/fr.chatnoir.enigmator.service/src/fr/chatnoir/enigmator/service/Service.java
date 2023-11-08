package fr.chatnoir.enigmator.service;

import java.util.Optional;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Version;

public class Service {
	
	public final static String PLUGIN_ID = "fr.chatnoir.enigmator.core";
	
	/**
	 * Récupère la version de l'application
	 * @return La version du la feature / plugin
	 */
	public static Version getEnigmatorVersion() {
		Optional<Version> version = Optional.ofNullable(Platform.getProduct().getDefiningBundle().getVersion());
		if(version.isPresent()) {
			return version.get();
		} else {
			return Platform.getBundle(PLUGIN_ID).getVersion();
		}
	}
	/**
	 * Récupère la version de l'application
	 * @return La version du la feature / plugin
	 */
	@Deprecated(forRemoval = true)
	public static Optional<Version> getVersion() {
		try {
			Version v = Platform.getProduct().getDefiningBundle().getVersion();
			return Optional.ofNullable(v);
		} catch(NullPointerException ex) {
			return Optional.ofNullable(null);
		}
	}
	
}
