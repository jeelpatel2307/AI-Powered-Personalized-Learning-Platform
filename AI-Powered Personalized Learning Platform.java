import java.util.*;

// Define a class for the learning platform
public class PersonalizedLearningPlatform {
    
    // Define data structures to store user information, courses, etc.
    private Map<String, User> users;
    private Map<String, Course> courses;

    // Constructor
    public PersonalizedLearningPlatform() {
        this.users = new HashMap<>();
        this.courses = new HashMap<>();
    }

    // Method to register a new user
    public void registerUser(String username, String password) {
        if (!users.containsKey(username)) {
            User newUser = new User(username, password);
            users.put(username, newUser);
            System.out.println("User registered successfully!");
        } else {
            System.out.println("Username already exists. Please choose another one.");
        }
    }

    // Method to log in a user
    public boolean loginUser(String username, String password) {
        if (users.containsKey(username)) {
            User user = users.get(username);
            if (user.getPassword().equals(password)) {
                System.out.println("Login successful!");
                return true;
            } else {
                System.out.println("Incorrect password. Please try again.");
            }
        } else {
            System.out.println("User not found. Please register first.");
        }
        return false;
    }

    // Method to create a new course
    public void createCourse(String courseName, String instructor, String description) {
        Course newCourse = new Course(courseName, instructor, description);
        courses.put(courseName, newCourse);
        System.out.println("Course created successfully!");
    }

    // Method to enroll a user in a course
    public void enrollCourse(String username, String courseName) {
        if (users.containsKey(username) && courses.containsKey(courseName)) {
            User user = users.get(username);
            Course course = courses.get(courseName);
            user.enroll(course);
            System.out.println("Enrollment successful!");
        } else {
            System.out.println("User or course not found.");
        }
    }

    // Method to display all available courses
    public void displayCourses() {
        System.out.println("Available Courses:");
        for (Course course : courses.values()) {
            System.out.println(course);
        }
    }

    // Main method to test the platform
    public static void main(String[] args) {
        PersonalizedLearningPlatform platform = new PersonalizedLearningPlatform();

        // Register users
        platform.registerUser("user1", "password1");
        platform.registerUser("user2", "password2");

        // Login user
        platform.loginUser("user1", "password1");

        // Create courses
        platform.createCourse("Java Programming", "John Doe", "Learn Java programming from scratch");
        platform.createCourse("Web Development", "Jane Smith", "Master web development technologies");

        // Enroll user in courses
        platform.enrollCourse("user1", "Java Programming");
        platform.enrollCourse("user1", "Web Development");

        // Display available courses
        platform.displayCourses();
    }
}

// Define a class for users
class User {
    private String username;
    private String password;
    private List<Course> enrolledCourses;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getPassword() {
        return password;
    }

    public void enroll(Course course) {
        enrolledCourses.add(course);
    }
}

// Define a class for courses
class Course {
    private String courseName;
    private String instructor;
    private String description;

    public Course(String courseName, String instructor, String description) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.description = description;
    }

    @Override
    public String toString() {
        return courseName + " - " + instructor + ": " + description;
    }
}
