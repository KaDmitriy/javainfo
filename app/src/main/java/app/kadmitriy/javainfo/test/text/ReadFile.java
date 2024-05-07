package app.kadmitriy.javainfo.test.text;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

public class ReadFile {
	
    public Stream<String> read(String filename) throws Exception {
    	InputStream inputStream = getClass().getResourceAsStream(String.format("/%s", filename));
    	InputStreamReader isr = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
    	BufferedReader bufferedReader = new BufferedReader(isr);
		return bufferedReader.lines();
    }
}
