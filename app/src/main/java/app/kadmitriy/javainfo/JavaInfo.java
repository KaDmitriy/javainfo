package app.kadmitriy.javainfo;

import java.util.HashMap;
import java.util.Map;

public class JavaInfo implements Info  {

	@Override
	public Map<String, String> getData() {
		Map<String, String> md = new HashMap<String, String>();
        /* Version JVM */
        md.put("Version JVM", Runtime.version().toString());
        md.put("java.version", System.getProperty("java.version"));
        md.put("java.vendor", System.getProperty("java.vendor"));
        md.put("java.vendor.url", System.getProperty("java.vendor.url"));
        md.put("java.home", System.getProperty("java.home"));
        md.put("java.vm.specification.version", System.getProperty("java.vm.specification.version"));
        md.put("java.vm.specification.vendor", System.getProperty("java.vm.specification.vendor"));
        md.put("java.vm.specification.name", System.getProperty("java.vm.specification.name"));
        md.put("java.vm.version", System.getProperty("java.vm.version"));
        md.put("java.vm.vendor", System.getProperty("java.vm.vendor"));
        md.put("java.vm.name", System.getProperty("java.vm.name"));
        md.put("java.specification.version", System.getProperty("java.specification.version"));
        md.put("java.specification.vendor", System.getProperty("java.specification.vendor"));
        md.put("java.specification.name", System.getProperty("java.specification.name"));
        md.put("java.class.version", System.getProperty("java.class.version"));
        md.put("java.class.path", System.getProperty("java.class.path"));
        md.put("java.library.path", System.getProperty("java.library.path"));
        md.put("java.io.tmpdir", System.getProperty("java.io.tmpdir"));
        md.put("java.compiler", System.getProperty("java.compiler"));
        md.put("java.ext.dirs", System.getProperty("java.ext.dirs"));
        return md;
	}

}
