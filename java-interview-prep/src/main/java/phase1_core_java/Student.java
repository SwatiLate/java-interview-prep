package phase1_core_java;

public class Student {
    private String studentId;
    private String studentName;
    private String course;
    private double fees;
    private boolean isPaid;

    public Student(String studentId, String studentName, String course, double fees, boolean isPaid) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.fees = fees;
        this.isPaid = isPaid;
    }

    public Student(String studentId, String studentName) {
        this(studentId,studentName,"Java", 50000,false);
    }

    public Student(Student stud) {
        this.studentId = stud.studentId;
        this.studentName = stud.studentName;
        this.course = stud.course;
        this.fees = stud.fees;
        this.isPaid = stud.isPaid;
    }

    public void payFees(){
        isPaid = true;
        System.out.println("Feels paid for : "+ studentName);
    }

    public void displayDetails(){
        System.out.println("---------- Student Details --------");
        System.out.println("Student Id : "+ studentId);
        System.out.println("Student Name : "+ studentName);
        System.out.println("Student Course : "+ course);
        System.out.println("Student Fees : "+ fees);
        System.out.println("Student Fees Paid : "+ isPaid);
    }

    public static void main(String[] args) {
        Student s1 = new Student("1", "Swati", "AI", 70000, true);
        Student s2 = new Student("2", "om");
        Student s3 = new Student(s1);

        s2.payFees();

        s1.displayDetails();

        s2.displayDetails();
        s3.displayDetails();

        System.out.println(s1);
        System.out.println(s3);
        System.out.println(s1==s3);

        s3.studentName = "Dhannoo";

        s1.displayDetails();
        s3.displayDetails();


    }
}
