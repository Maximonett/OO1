package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    protected List<JobDescription> jobs;
    protected Strategy strategy;

    public JobScheduler() {
        this.jobs = new ArrayList<>();
        this.strategy = new Fifo(); // Estrategia por defecto
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public List<JobDescription> getJobs() {
        return jobs;
    }

    public void setStrategy(Strategy aStrategy) {
        this.strategy = aStrategy;
    }

    public JobDescription next() {
        if (this.jobs.isEmpty()) return null;
        JobDescription nextJob = this.strategy.next(this.jobs);
        this.unschedule(nextJob);
        return nextJob;
    }
}
