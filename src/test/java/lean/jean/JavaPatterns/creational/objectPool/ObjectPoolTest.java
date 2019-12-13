package lean.jean.JavaPatterns.creational.objectPool;

import lean.jean.JavaPatterns.creational.objectPool.interfaces.Pool;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

@Slf4j
public class ObjectPoolTest {

    @Test
    public void test() {
        Pool<Employer> employerPool = new EmployerPool();
        employerPool.release(new Employer("Jean", LocalDateTime.now(), LocalDateTime.now()));
        employerPool.release(new Employer("Java", LocalDateTime.now(), LocalDateTime.now()));
        Employer employer = employerPool.acquire();
        assertNotNull(employer);
        while (employer != null) {
            log.info(employer.getName());
            employer = employerPool.acquire();
        }
        assertNull(employer);
    }
}