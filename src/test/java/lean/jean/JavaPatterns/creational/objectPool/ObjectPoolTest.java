package lean.jean.JavaPatterns.creational.objectPool;

import lean.jean.JavaPatterns.creational.objectPool.interfaces.Pool;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class ObjectPoolTest {

    @Test
    public void test() {
        Pool<Employer> employerPool = new EmployerPool();
        employerPool.release(new Employer("Jean"));
        employerPool.release(new Employer("Java"));
        Employer employer = employerPool.acquire();
        assertNotNull(employer);
        while (employer != null) {
            log.info(employer.getName());
            employer = employerPool.acquire();
        }
        assertNull(employer);
    }
}