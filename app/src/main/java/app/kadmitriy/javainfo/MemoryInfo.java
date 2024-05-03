package app.kadmitriy.javainfo;

import java.lang.Runtime;
import java.util.HashMap;
import java.util.Map;

public class MemoryInfo implements Info {

	@Override
	public Map<String, String> getData() {
		
		Map<String, String> md = new HashMap<String, String>();
		
        /* Total amount of free memory available to the JVM */
		md.put("Free memory (Mbytes)", Long.toString(Runtime.getRuntime().freeMemory()/1048576));
        
		/* This will return Long.MAX_VALUE if there is no preset limit */
        long maxMemory = Runtime.getRuntime().maxMemory();
        md.put("MaxMemory", Long.toString(maxMemory));

        /* Maximum amount of memory the JVM will attempt to use */
        md.put("Maximum memory (Mbytes)", (maxMemory == Long.MAX_VALUE ? "no limit" : Long.toString(maxMemory/1048576)));
        
        /* Total memory currently available to the JVM */
        md.put("Total memory available to JVM (Mbytes)", Long.toString(Runtime.getRuntime().totalMemory()/1048576));

		return md;
	}

}
