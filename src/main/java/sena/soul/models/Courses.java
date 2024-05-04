package sena.soul.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="courses")
public class Courses {
    
    @Id
    private Long Id;
    private String Name;
    private String Description;
    private String Duration;
    private String Level;


}
