package Main2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Main2 {
	private static int Partizione = 1000;

	public static int[] arrNum = new int[3000];


	
	
	public static void main(String[] args) {
		
		Logger logger = LoggerFactory.getLogger(Main2.class);
		
		for(int j = 0; j <= arrNum.length; j++) {		
			int randomNum = (int) Math.floor(Math.random() * 100);		
			arrNum[j] = randomNum;
		};
		
		es_2[] thread1 = new es_2[3];
		
		for(int j = 0; j < thread1.length; j++) {
			int inizio = j * Partizione;
			int fine = inizio + Partizione;
			thread1[j] = new es_2(inizio, fine);
			thread1[j].start();
		};
			
		
		for (int j = 0; j < thread1.length; j++) {
            try {
				thread1[j].join();
			} catch (InterruptedException e) {
				
			System.out.println("errore" + e);
			}
        }
			
		
		 int totalSum = 0;
	        for (int j= 0; j < thread1.length; j++) {
	            totalSum += thread1[j].getPartialSum();
	        }
	        
	        System.out.println("la somma è: " + totalSum);

	}

}
