package Main;



public class es_1  extends Thread{
	
	private String word;
	
	public es_1(String word) {
		this.word = word;
	};
	
	
	public void run() {
		for(int j = 0; j <= 10; j++) {
			Main.logger.info(word + " " + j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Main.logger.error("errore: " + e);
			}
		};
	};
}
