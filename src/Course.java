public class Course {
    public String course;
    public double sort_grade;
    public String credit;
    public static final double CREDIT_MAJOR = 3.0;
    public static final double CREDIT_GENERAL = 2.0;

    public Course(String course, double sort_grade, String credit){
        this.course = course;
        this.sort_grade = sort_grade;
        this.credit = credit;
    }
}
