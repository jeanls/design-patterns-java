package lean.jean.JavaPatterns.structural.adapter;

import lean.jean.JavaPatterns.creational.objectPool.Employer;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdapterTest {

    @Test
    public void test() {
        EmployerControlV1 employerControlV1 = new EmployerControlAdapter();
        Employer employer = new Employer("Jean");
        employerControlV1.registerEntrance(employer);
        employerControlV1.registerExit(employer);
        assertNotNull(employer.getEntrance());
        assertNotNull(employer.getExit());
    }
}