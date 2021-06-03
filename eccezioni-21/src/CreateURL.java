import java.net.MalformedURLException;
import java.net.URL;

public class CreateURL {
	public static final URL createURL(String url) {
		try {
			return new URL(url);
		} catch (MalformedURLException e) {
			throw new RuntimeException(e, "Cannot create URL from: " + url);
		}
	}
}
