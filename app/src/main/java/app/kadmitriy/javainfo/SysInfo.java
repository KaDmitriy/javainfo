package app.kadmitriy.javainfo;

import java.util.HashMap;
import java.util.Map;

public class SysInfo implements Info{

	@Override
	public Map<String, String> getData() {
		
		Map<String, String> md = new HashMap<String, String>();
		
		md.put("os.name", System.getProperty("os.name"));
		md.put("os.version", System.getProperty("os.version"));
		md.put("os.arch", System.getProperty("os.arch"));
		md.put("file.separator", System.getProperty("file.separator"));
		md.put("path.separator", System.getProperty("path.separator"));
		md.put("line.separator", System.getProperty("line.separator").replace("\n", "\\n").replace("\r", "\\r"));
		md.put("user.name", System.getProperty("user.name"));
		md.put("user.home", System.getProperty("user.home"));
		md.put("user.dir", System.getProperty("user.dir"));
        
        /* Total number of processors or cores available to the JVM */
		md.put("Count proc (cores)", Integer.toString(Runtime.getRuntime().availableProcessors()));
        
        return md;
	}

}
