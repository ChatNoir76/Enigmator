package fr.chatnoir.enigmator.core.picocli;

import org.osgi.framework.Version;

import fr.chatnoir.enigmator.service.Service;
import picocli.CommandLine.IVersionProvider;

public class EnigmatorVersionProvider implements IVersionProvider {

	@Override
	public String[] getVersion() throws Exception {
		Version v = Service.getEnigmatorVersion();
		return v.toString().split(" ");
	}

}
