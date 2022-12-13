package in.mrsk;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;

public class TestApp {
     private static Logger log=Logger.getLogger(TestApp.class);
	public static void main(String[] args) throws IOException {
		//Layout layout=new HTMLLayout();
		//Layout layout=new SimpleLayout();
		//Layout layout=new PatternLayout("%d %C %M %m %n");
		//Appender app=new ConsoleAppender(layout);
		//Appender app=new FileAppender(layout,"C:\\Users\\SLB031\\OneDrive - Maersk Group\\Documents\\MyLogs\\one.log");
		//log.addAppender(app);
		
		log.debug("from debug");
		log.info("from info");
		log.fatal("from fatal");
		log.error("drom error");
		log.warn("from warn");

	}

}
