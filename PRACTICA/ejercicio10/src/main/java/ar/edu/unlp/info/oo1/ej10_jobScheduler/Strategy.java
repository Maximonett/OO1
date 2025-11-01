package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;

public abstract class Strategy {
	protected List<JobDescription> jobs;
	
	
	public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }
	
	public  JobDescription next() {
		JobDescription nextJob;
		this.next();
		this.unschedule(nextJob);
        return nextJob;
	}
	
	
}
