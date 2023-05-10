package Main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	public static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		
		es_1 ex1 = new es_1("*");
		es_1 ex2 = new es_1("#");
		
			ex1.start();
			ex2.start();
		
		
	}

}
//interupted