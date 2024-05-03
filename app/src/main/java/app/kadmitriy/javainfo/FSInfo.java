package app.kadmitriy.javainfo;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FSInfo implements Info {

	@Override
	public Map<String, String> getData() {
		Map<String, String> md = new HashMap<String, String>();
		 /* Get a list of all filesystem roots on this system */
        File[] roots = File.listRoots();

        /* For each filesystem root, print some info */
        for (File root : roots) {
          md.put("File system root", root.getAbsolutePath());
          md.put("Total space (bytes)", Long.toString(root.getTotalSpace()));
          md.put("Free space (bytes)", Long.toString(root.getFreeSpace()));
          md.put("Usable space (bytes)", Long.toString(root.getUsableSpace()));
        }
        
        return md;
	}

}
