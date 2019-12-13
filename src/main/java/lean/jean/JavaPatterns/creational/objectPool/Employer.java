package lean.jean.JavaPatterns.creational.objectPool;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employer {
    private String name;
    private LocalDateTime entrance;
    private LocalDateTime exit;

    public Employer(String name){
        this.name = name;
    }
}
