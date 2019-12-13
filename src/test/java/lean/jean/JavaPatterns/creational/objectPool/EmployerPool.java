package lean.jean.JavaPatterns.creational.objectPool;

import lean.jean.JavaPatterns.creational.objectPool.interfaces.Pool;

import java.util.ArrayList;
import java.util.List;

public class EmployerPool implements Pool<Employer> {
    private List<Employer> employers;

    public EmployerPool(){
        employers = new ArrayList<>();
    }

    @Override
    public Employer acquire() {
        if (this.employers.size() > 0) {
            return this.employers.remove(0);
        }
        return null;
    }

    @Override
    public void release(Employer employer) {
        this.employers.add(employer);
    }
}
