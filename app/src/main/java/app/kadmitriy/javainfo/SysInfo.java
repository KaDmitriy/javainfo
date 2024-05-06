package app.kadmitriy.javainfo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SysInfo implements Info {

	@Override
	public List<StructureInfo> getDataSI() {
		return Arrays.asList(new StructureInfo("os.name", System.getProperty("os.name")),
				new StructureInfo("os.version", System.getProperty("os.version")),
				new StructureInfo("os.arch", System.getProperty("os.arch")),
				/* Total number of processors or cores available to the JVM */
				new StructureInfo("Count proc (cores)", Integer.toString(Runtime.getRuntime().availableProcessors())),
				
				new StructureInfo("file.separator", System.getProperty("file.separator")),
				new StructureInfo("path.separator", System.getProperty("path.separator")),
				new StructureInfo("line.separator",
						System.getProperty("line.separator").replace("\n", "\\n").replace("\r", "\\r")),
				new StructureInfo("user.name", System.getProperty("user.name")),
				new StructureInfo("user.home", System.getProperty("user.home")),
				new StructureInfo("user.dir", System.getProperty("user.dir"))
		);
	}

}
