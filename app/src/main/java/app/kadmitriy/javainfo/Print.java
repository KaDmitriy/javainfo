package app.kadmitriy.javainfo;

public class Print {
	
	private Print() {}
	
	public static void out(Info info) {
		out("", info);
	}
	
	public static void out(String name, Info info) {
		println("[" + name + "]");
		info.getDataSI().forEach(si -> println("  " + si.getKey() + ":\t" + si.getVal()));
		println("");
	}
	
	public static void println(String str) {
		System.out.println(str);
	}
}
