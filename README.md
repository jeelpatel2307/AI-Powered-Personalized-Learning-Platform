# AI-Powered Personalized Learning Platform

## Overview

This is an AI-powered personalized learning platform implemented in Java. The platform allows users to register, log in, enroll in courses, and access personalized learning materials.

## Features

- **User Registration:** Users can create an account by providing a username and password.
- **User Authentication:** Registered users can log in securely using their credentials.
- **Course Management:** Instructors can create new courses with descriptions.
- **Course Enrollment:** Users can enroll in available courses.
- **Course Display:** All available courses are displayed for users to choose from.
- **User Progress Tracking:** Track user progress within enrolled courses.
- **AI-Powered Recommendations:** Utilize AI algorithms to recommend courses based on user interests and progress.

## Getting Started

1. **Clone the Repository:**
    
    ```bash
    git clone <https://github.com/yourusername/learning-platform.git>
    
    ```
    
2. **Compile and Run:**
    
    ```bash
    cd learning-platform
    javac PersonalizedLearningPlatform.java
    java PersonalizedLearningPlatform
    
    ```
    

## Usage

1. **Register a User:**
    
    ```java
    platform.registerUser("username", "password");
    
    ```
    
2. **Login a User:**
    
    ```java
    platform.loginUser("username", "password");
    
    ```
    
3. **Create a Course:**
    
    ```java
    platform.createCourse("Java Programming", "John Doe", "Learn Java programming from scratch");
    
    ```
    
4. **Enroll in a Course:**
    
    ```java
    platform.enrollCourse("username", "Java Programming");
    
    ```
    
5. **Display Available Courses:**
    
    ```java
    platform.displayCourses();
    
    ```
    

## Contributors

- Jeel patel
