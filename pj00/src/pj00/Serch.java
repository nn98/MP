package pj00;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Serch extends Progress{
	Serch t[]=new Serch[5];
	@Override
	public void ex() {
		if (n==1) t[n]=new S_google();
		else if (n==2) t[n]=new S_naver();
		else if (n==3) t[n]=new S_daum();
	}
	
	public URI add(String u) throws URISyntaxException {
		return new URI("www.naver.com");
	}
	@Override
	public void exe(String s) throws URISyntaxException {
		try { 
			Desktop.getDesktop().browse(t[n].add(s)); 
		} catch (IOException e) {
			e.printStackTrace(); 
		} catch (URISyntaxException e) { 
			e.printStackTrace(); 
		} 
	}
	@Override
	public void con() {
		System.out.println("-----\n"+this.getClass().getSimpleName()+"\n-----\nSelect serch engine:\n1.Google\n2.Naver\n3.Daum");
	}
}
