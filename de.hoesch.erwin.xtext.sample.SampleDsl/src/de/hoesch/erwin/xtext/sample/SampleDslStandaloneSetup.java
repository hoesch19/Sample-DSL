
package de.hoesch.erwin.xtext.sample;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SampleDslStandaloneSetup extends SampleDslStandaloneSetupGenerated{

	public static void doSetup() {
		new SampleDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

