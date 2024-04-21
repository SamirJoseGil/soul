package sena.soul.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="comments")
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private long UserID;
    private long CoursedId;
    private String Content;



    // Getters and Setters
    public long getId() {
        return Id;
    }
    public void setId(long id) {
        Id = id;
    }
    public long getUserID() {
        return UserID;
    }
    public void setUserID(long userID) {
        UserID = userID;
    }
    public long getCoursedId() {
        return CoursedId;
    }
    public void setCoursedId(long coursedId) {
        CoursedId = coursedId;
    }
    public String getContent() {
        return Content;
    }
    public void setContent(String content) {
        Content = content;
    }
}
