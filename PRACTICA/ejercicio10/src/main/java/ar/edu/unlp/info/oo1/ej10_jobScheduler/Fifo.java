package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class Fifo extends Strategy {

	public Fifo() {
		super();
	}
	
	public JobDescription next() {
		JobDescription nextJob =jobs.get(0);
		return nextJob; 
	}
	
}
