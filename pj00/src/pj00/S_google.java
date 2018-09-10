package pj00;

import java.net.URI;
import java.net.URISyntaxException;

public class S_google extends Serch {
	@Override
	public URI add(String u) throws URISyntaxException {
		return new URI("www.google.co.kr/search?q="+u);
	}
}
