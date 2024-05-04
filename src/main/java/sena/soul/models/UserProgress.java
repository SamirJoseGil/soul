package sena.soul.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="user_progress")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserProgress {
    
    private Long UserId;
    private Long LessonId;
    private Date Date;


    @Override
    public String toString() {
        return "UserProgress{" +
                "UserId='" + UserId + '\'' +
                ", LessonId='" + LessonId + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }


}
