package app.kadmitriy.javainfo;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FSInfo implements Info {

	@Override
	public List<StructureInfo> getDataSI() {
		var lsi = new ArrayList<StructureInfo>();
		File[] roots = File.listRoots();
		for (File root : roots) {
			lsi.add(new StructureInfo("File system root", root.getAbsolutePath()));
			lsi.add(new StructureInfo("Total space (bytes)", Long.toString(root.getTotalSpace())));
			lsi.add(new StructureInfo("Free space (bytes)", Long.toString(root.getFreeSpace())));
			lsi.add(new StructureInfo("Usable space (bytes)", Long.toString(root.getUsableSpace())));
			
	    }
		return lsi;
	}

}
