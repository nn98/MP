package pj00;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Browser extends Progress{
	@Override
	public void con() {
		System.out.println("-----\n"+this.getClass().getSimpleName()+"\n-----\nSelect:\n1.Internet Explorer\n2.File Explorer");
	}
	@Override
	public void exe(String s) throws URISyntaxException {
		try { 
			Desktop.getDesktop().browse(new URI(s)); 
		} catch (IOException e) {
			e.printStackTrace(); 
		} 
	}
}