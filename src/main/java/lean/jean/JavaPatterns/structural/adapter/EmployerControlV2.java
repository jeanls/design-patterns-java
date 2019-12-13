package lean.jean.JavaPatterns.structural.adapter;

import lean.jean.JavaPatterns.creational.objectPool.Employer;

import java.time.LocalDateTime;

public class EmployerControlV2 {
    public void register(Employer employer, boolean entrance) {
        if (entrance) {
            employer.setEntrance(LocalDateTime.now());
        } else {
            employer.setExit(LocalDateTime.now());
        }
    }
}
