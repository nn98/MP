package pj00;

import java.net.URI;
import java.net.URISyntaxException;

public class S_daum extends Serch{
	@Override
	public URI add(String u) throws URISyntaxException  {
		return new URI("https://search.daum.net/search?nil_suggest=btn&nil_ch=&rtupcoll=&w=tot&m=&f=&lpp=&DA=SBC&sug=&sq=&o=&sugo=&q="+u);
	}
}
