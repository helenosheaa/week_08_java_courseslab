package models;

import javax.persistence.*;

@Entity
@Table(name = "lessons")

public class Lesson {
    private int id;
    private String title;
    private int classRoomNo;

    public Lesson(){}

    public Lesson(String title, int classRoomNo){
        this.title = title;
        this.classRoomNo = classRoomNo;
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
}
