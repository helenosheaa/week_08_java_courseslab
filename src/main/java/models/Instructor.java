package models;

import javax.persistence.*;

@Entity
@Table(name = "instructors")

public class Instructor {
    private int id;

    public Instructor(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
