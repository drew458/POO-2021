import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopyTest {
	public static void main(String[] args)
			throws IOException {
		Path source = Paths.get("src.txt");
		Path destination = Paths.get("copied.txt"); 
		Files.copy(source, destination);
	}
}

