package Exercises.Task4;

public class Monday extends Day{
    public Monday(String subject1) {
        super(subject1);
    }

    public Monday(String subject1, String subject2) {
        super(subject1, subject2);
    }

    public Monday(String subject1, String subject2, String subject3) {
        super(subject1, subject2, subject3);
    }

    public Monday(String subject1, String subject2, String subject3, String subject4) {
        super(subject1, subject2, subject3, subject4);
    }

    public Monday() {
        System.out.println("No class on Mondayy :))) Rest buddy");
    }

    @Override
    public void getDay() {
        super.getDay();
    }

    @Override
    public void addSubject(String subject) {
        super.addSubject(subject);
    }

    @Override
    public void removeSubject(String subject) {
        super.removeSubject(subject);
    }
}
