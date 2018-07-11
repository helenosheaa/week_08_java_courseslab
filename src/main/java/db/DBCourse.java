package db;

import models.Course;
import models.Student;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBCourse {

    private static Session session;

    public static List<Student> getStudentsOnCourse(Course course) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Student> students = null;
        try {
            Criteria cr = session.createCriteria(Student.class);
            cr.add(Restrictions.eq("course", course));
            students = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return students;
    }

}
