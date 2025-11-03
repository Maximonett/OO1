package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;

public class Fifo extends Strategy {
    @Override
    public JobDescription next(List<JobDescription> jobs) {
        return jobs.get(0);
    }
}
