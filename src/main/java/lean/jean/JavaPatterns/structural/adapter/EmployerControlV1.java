package lean.jean.JavaPatterns.structural.adapter;

import lean.jean.JavaPatterns.creational.objectPool.Employer;

import java.time.LocalDateTime;

public class EmployerControlV1 {
    public void registerEntrance(Employer employer){
        employer.setEntrance(LocalDateTime.now());
    }

    public void registerExit(Employer employer){
        employer.setExit(LocalDateTime.now());
    }
}
