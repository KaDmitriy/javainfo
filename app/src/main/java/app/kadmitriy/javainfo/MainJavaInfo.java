package app.kadmitriy.javainfo;

import app.kadmitriy.javainfo.test.StartTest;
import app.kadmitriy.javainfo.test.TestOfWork;

public class MainJavaInfo {

	public static void main(String[] args) {
		Print.out("System", new SysInfo());
		Print.out("Memory", new MemoryInfo());
		Print.out("FileSystem", new FSInfo());
		Print.out("JavaInfo", new JavaInfo());
		
		StartTest st = new StartTest();
		st.addTest(TestOfWork.TEXT);
		st.run();
	}

}
