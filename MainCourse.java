public class MainCourse {
    public static void main(String[] args) {
        Course course = new Course("Software Engineering");

        // I'm printing the initial heading and adding the first instructor and textbook
        System.out.println("Initial:");
        course.addInstructor(new Instructor("Nima", "Davarpnah", "3-2636"));
        course.addTextbook(new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall"));

        course.printCourseInfo();


        System.out.println("--------------------------------------------");

        // Adding other two instructors and textbooks
        course.addInstructor(new Instructor("Shreyas", "Chaudhary", "2-1510"));
        course.addTextbook(new Textbook("Willy Wonka", "Voldemort", "Joe Biden"));
        course.addInstructor(new Instructor("Enzo", "Ferrari", "5-1917"));
        course.addTextbook(new Textbook("How to build a car", "Adrian Newey", "RedBull"));

        // Then printing the updated course information
        course.printCourseInfo();
    }
}
