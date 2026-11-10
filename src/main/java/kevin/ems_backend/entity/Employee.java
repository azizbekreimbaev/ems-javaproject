package kevin.ems_backend.entity;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity

public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
