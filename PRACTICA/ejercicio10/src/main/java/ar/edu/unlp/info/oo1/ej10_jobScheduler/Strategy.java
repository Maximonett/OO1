package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;

public abstract class Strategy {

    public abstract JobDescription next(List<JobDescription> jobs);

}
