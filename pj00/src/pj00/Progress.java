package pj00;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Progress {
	int n;
	public void setI(int n) {
		this.n=n;
	}
	public void con(){
		System.out.println(".\n"+this.getClass().getSimpleName());
	}
	public void exe(String s) throws URISyntaxException {
	}
	public void ex() {

	}
}