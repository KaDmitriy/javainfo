package app.kadmitriy.javainfo;

public class MainJavaInfo {

	public static void main(String[] args) {
		Print.out("System", new SysInfo());
		Print.out("Memory", new MemoryInfo());
		Print.out("FileSystem", new FSInfo());
		Print.out("JavaInfo", new JavaInfo());
		
		
	}

}
