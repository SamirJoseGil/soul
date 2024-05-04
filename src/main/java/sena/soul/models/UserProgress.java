package sena.soul.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name ="user_progress")
public class UserProgress {
    
    private long user_id;
    private long lesson_id;
    private Date Date;


// .toString

    @Override
    public String toString() {
        return "user_progress{" +
                "user_id='" + user_id + '\'' +
                ", lesson_id='" + lesson_id + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }


//Getters and Setters

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getLesson_id() {
        return lesson_id;
    }

    public void setLesson_id(long lesson_id) {
        this.lesson_id = lesson_id;
    }

    public java.sql.Date getDate() {
        return Date;
    }

    public void setDate(java.sql.Date date) {
        Date = date;
    }
}