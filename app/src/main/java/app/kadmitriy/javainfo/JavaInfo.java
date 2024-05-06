package app.kadmitriy.javainfo;

import java.util.Arrays;
import java.util.List;

public class JavaInfo implements Info  {

	@Override
	public List<StructureInfo> getDataSI() {
		return Arrays.asList(
				new StructureInfo("Version JVM", Runtime.version().toString()),
				new StructureInfo("java.version", System.getProperty("java.version")),
				new StructureInfo("java.vendor", System.getProperty("java.vendor")),
				new StructureInfo("java.vendor.url", System.getProperty("java.vendor.url")),
				new StructureInfo("java.home", System.getProperty("java.home")),
				new StructureInfo("java.vm.specification.version", System.getProperty("java.vm.specification.version")),
				new StructureInfo("java.vm.specification.vendor", System.getProperty("java.vm.specification.vendor")),
				new StructureInfo("java.vm.specification.name", System.getProperty("java.vm.specification.name")),
				new StructureInfo("java.vm.version", System.getProperty("java.vm.version")),
				new StructureInfo("java.vm.vendor", System.getProperty("java.vm.vendor")),
				new StructureInfo("java.vm.name", System.getProperty("java.vm.name")),
				new StructureInfo("java.specification.version", System.getProperty("java.specification.version")),
				new StructureInfo("java.specification.vendor", System.getProperty("java.specification.vendor")),
				new StructureInfo("java.specification.name", System.getProperty("java.specification.name")),
				new StructureInfo("java.class.version", System.getProperty("java.class.version")),
				new StructureInfo("java.class.path", System.getProperty("java.class.path")),
				new StructureInfo("java.library.path", System.getProperty("java.library.path")),
				new StructureInfo("java.io.tmpdir", System.getProperty("java.io.tmpdir")),
				new StructureInfo("java.compiler", System.getProperty("java.compiler")),
				new StructureInfo("java.ext.dirs", System.getProperty("java.ext.dirs"))
		
		);
	}

}
