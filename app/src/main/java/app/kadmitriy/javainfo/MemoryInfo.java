package app.kadmitriy.javainfo;

import java.lang.Runtime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryInfo implements Info {

	@Override
	public List<StructureInfo> getDataSI() {
		long maxMemory = Runtime.getRuntime().maxMemory();
		return Arrays.asList(
				new StructureInfo("Free memory (Mbytes)", Long.toString(Runtime.getRuntime().freeMemory() / 1048576)),
				/* This will return Long.MAX_VALUE if there is no preset limit */
				new StructureInfo("MaxMemory", Long.toString(maxMemory)),
				/* Maximum amount of memory the JVM will attempt to use */
				new StructureInfo("Maximum memory (Mbytes)",
						(maxMemory == Long.MAX_VALUE ? "no limit" : Long.toString(maxMemory / 1048576))),
				/* Total memory currently available to the JVM */
				new StructureInfo("Total memory available to JVM (Mbytes)",
						Long.toString(Runtime.getRuntime().totalMemory() / 1048576))
		);
	}

}
