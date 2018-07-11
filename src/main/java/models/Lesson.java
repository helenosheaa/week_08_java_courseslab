package models;

import javax.persistence.*;

@Entity
@Table(name = "lessons")

public class Lesson {
    private int id;
    private String title;
    private int classRoomNo;
    private Course course;

    public Lesson(){}

    public Lesson(String title, int classRoomNo, Course course){
        this.title = title;
        this.classRoomNo = classRoomNo;
        this.course = course;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "class_room_no")
    public int getClassRoomNo() {
        return classRoomNo;
    }

    public void setClassRoomNo(int classRoomNo) {
        this.classRoomNo = classRoomNo;
    }

   @ManyToOne
   @JoinColumn(name = "course_id", nullable = false)
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
