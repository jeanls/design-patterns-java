package lean.jean.JavaPatterns.structural.adapter;

import lean.jean.JavaPatterns.creational.objectPool.Employer;

public class EmployerControlAdapter extends EmployerControlV1{
    private EmployerControlV2 employerControlV2;

    public EmployerControlAdapter(){
        employerControlV2 = new EmployerControlV2();
    }

    @Override
    public void registerEntrance(Employer employer){
        this.employerControlV2.register(employer, true);
    }

    @Override
    public void registerExit(Employer employer){
        employerControlV2.register(employer, false);
    }
}
