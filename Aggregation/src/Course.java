import java.util.ArrayList;
import java.util.List;

class Course {
    private String name;
    private List<Instructor> instructors;
    private List<Textbook> textbooks;

    public Course(String name) {
        this.name = name;
        this.instructors = new ArrayList<>();
        this.textbooks = new ArrayList<>();
    }

    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    public void addTextbook(Textbook textbook) {
        textbooks.add(textbook);
    }

    public void printCourseInfo() {
        System.out.println("Course Name: " + name);
        for (Instructor instructor : instructors) {
            System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName() +
                    ", Office Number: " + instructor.getOfficeNumber());
        }
        for (Textbook textbook : textbooks) {
            System.out.println("Textbook: " + textbook.getTitle() + " by " + textbook.getAuthor());
        }
    }
}
