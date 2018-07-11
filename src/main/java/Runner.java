import db.DBHelper;
import models.*;

public class Runner {

    public static void main(String[] args){
        Course course1 = new Course("Software Development", "PDA");
        DBHelper.save(course1);

        Student student1 = new Student("James", 28, 567, course1);
        DBHelper.save(student1);

        Mentor mentor1 = new Mentor("Bryan");
        DBHelper.save(mentor1);

        Lesson lesson1 = new Lesson("Hibernate", 22);
        DBHelper.save(lesson1);

        Instructor instructor1 = new Instructor();
        DBHelper.save(instructor1);

    }

}
