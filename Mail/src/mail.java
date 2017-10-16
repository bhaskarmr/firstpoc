import com.sendgrid.*;

import java.io.File;
import java.io.IOException;

public class mail {
  public static void main(String[] args) throws IOException {

	  
	  ProcessBuilder pb = new ProcessBuilder("/usr/bin/java", "-jar", "mail6ph.jar");
      pb.directory(new File("/home/pi/"));
			try {
			Process p = pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
  }
}