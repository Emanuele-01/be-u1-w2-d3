package Main2;

public class es_2 extends Thread {
	private int inizio;
	private int fine;
	private int partialSum;
	
	public es_2(int inizio, int fine) {
		this.inizio = inizio;
		this.fine = fine;
		this.partialSum = 0;
	};
	
	public int partialSum() {
		return partialSum;
	};
	
	public void run() {
		for(int j = inizio; j < fine ; j++) {
			
			partialSum += Main2.arrNum[j];
		};
	};
}
