package braulioqh.vis4bridge.design;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;

import org.eclipse.emf.ecore.EObject;



/**
 * The services class used by VSM.
 */
public class Services {
	public static String propertiesPatch = ".vis4bridge/config.properties";
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }

    private static int idCounter = 0;
  
    /**
     * return the id counter
     * @param self
     * @return
     */
    public String idCounterSA(EObject self) {

    	System.out.println("service");
    	idCounter=idCounter+1;
    	String id = ""+idCounter;
    	
    	return id; 
    }
    /**
     * 
     * @param self
     */
    public void openBrowser(EObject self, String arg) {

    	System.out.println("enter");
    	if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
    	    try {
    	    	System.out.println("enter");
				Desktop.getDesktop().browse(new URI(arg));
				System.out.println("Ejecute");
			} catch (IOException | URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
    /**
     * Load a properties file.
     * @return
     */
    public int loadProperties(EObject self) {
    	try {
    		File file = new File(propertiesPatch);
    		if (file.exists()) {
    			InputStream input = new FileInputStream(propertiesPatch);
        		Properties prop = new Properties();
        		// load a properties file
                prop.load(input);
                idCounter = Integer.parseInt(prop.getProperty("idCounter"));
    		}else {
    			OutputStream output = new FileOutputStream(propertiesPatch);
    			Properties prop = new Properties();
    			 prop.setProperty("idcounter", "0");
    			 prop.store(output, null);
    		}
    	}catch(IOException ex) {
    		ex.printStackTrace();
    		return -1;
    	}
    	System.out.println("Load Ready!");
		return 0;
    }
    /**
     * Save the properties on properties file.
     * @return
     */
    public int saveProperties() {
    	try {
    		OutputStream output = new FileOutputStream(propertiesPatch);
			Properties prop = new Properties();
			prop.setProperty("idcounter",""+idCounter);
			 prop.store(output, null);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
    	System.out.println("Save Ready!");
    	return 0;
    }
}
