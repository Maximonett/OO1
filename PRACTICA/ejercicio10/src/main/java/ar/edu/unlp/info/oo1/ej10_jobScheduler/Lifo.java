package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class Lifo extends Strategy {
	
	public JobDescription next() {
		JobDescription nextJob =jobs.get(0);
		return nextJob; 
	}
}
