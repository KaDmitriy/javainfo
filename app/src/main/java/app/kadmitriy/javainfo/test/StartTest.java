package app.kadmitriy.javainfo.test;

import java.util.ArrayList;
import java.util.List;

import app.kadmitriy.javainfo.test.text.TextTest;

public class StartTest {

	private List <TestOfWork> listTest;
	
	public StartTest() {
		listTest = new ArrayList<>();
	}
	
	public void addTest(TestOfWork test) {
		listTest.add(test);
	}
	
	public void run() {
		listTest.forEach(test -> {
			switch (test) {
			case TEXT: {
				runTest(new TextTest());
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + test);
			}
		});
	}
	
	
	private void runTest(Test test) {
		test.run();
	}
	
}
