package pj00;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class S_naver extends Serch {
	@Override
	public URI add(String u) throws URISyntaxException {
		return new URI("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query="+u);
	}
}
