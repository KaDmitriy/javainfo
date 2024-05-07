package app.kadmitriy.javainfo.test.text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import app.kadmitriy.javainfo.test.Test;

public class TextTest implements Test {

	private String pathFile = "test/text/text.txt";

	private long timeElapsed = 0;

	public void run() {
		long startTime = System.currentTimeMillis();
		parsertext();
		long endTime = System.currentTimeMillis();
		timeElapsed = endTime - startTime;
	}

	private void parsertext() {
		String[] pathsFiles;
		try {
			pathsFiles = new String[] { pathFile };
			Arrays
				.stream(pathsFiles)
				.flatMap(TextTest::fileLines)
				.flatMap(line -> Arrays.stream(line.split("\\b")))
				.map(word -> word.replaceAll("[^a-zA-Z]", ""))
				.filter(word -> word.length() > 0)
				.map(word -> word.toLowerCase())
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.sorted((a, b) -> -a.getValue().compareTo(b.getValue())).limit(10)
				.forEach(e -> System.out.format("%s = %d%n", e.getKey(), e.getValue()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Stream<String> fileLines(String filename) {
		try {
			return new ReadFile().read(filename);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public long getTimeElapsed() {
		return timeElapsed;
	}

	public void setTimeElapsed(long timeElapsed) {
		this.timeElapsed = timeElapsed;
	}

	public URI getResource(String filename) throws Exception {
		return getClass().getResource(String.format("/%s", filename)).toURI();
	}

	public Stream<String> readTextResource(String filename) throws Exception {
		InputStream inputStream = getClass().getResourceAsStream(String.format("/%s", filename));

		InputStreamReader isr = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
		BufferedReader bufferedReader = new BufferedReader(isr);
		return bufferedReader.lines();

		/*
		 * String line = null; Scanner scanner = new Scanner(inputStream,
		 * StandardCharsets.UTF_8); try { while (scanner.hasNextLine()) { line =
		 * scanner.nextLine(); } } finally { scanner.close(); } return line;
		 */
	}

}
