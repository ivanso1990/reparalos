package com.reparalos.reparalos;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class javaBrowser {
	public static void openBrowser() {
		// Create Desktop object
		Desktop d = Desktop.getDesktop();

		// Browse a URL, say google.com
		try {
			d.browse(new URI("http://reparalos.com"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
