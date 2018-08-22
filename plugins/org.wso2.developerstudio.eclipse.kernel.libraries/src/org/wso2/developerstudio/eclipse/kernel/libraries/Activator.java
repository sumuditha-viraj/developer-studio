package org.wso2.developerstudio.eclipse.kernel.libraries;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;


public class Activator extends AbstractUIPlugin {

	public static final String PLUGIN_ID = "org.wso2.developerstudio.eclipse.kernel.libraries";

	
	private static Activator plugin;
	
	public Activator() {
	
	}

	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
	}


	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
