package com.example.srms;

import com.example.srms.dao.ResultDao;
import com.example.srms.dao.StudentDao;
import com.example.srms.dao.impl.ResultDaoImpl;
import com.example.srms.dao.impl.StudentDaoImpl;
import com.example.srms.model.Result;
import com.example.srms.model.Student;

import java.util.List;
import java.util.Scanner;

public class MainApp {
    private static final StudentDao studentDao = new StudentDaoImpl();
    private static final ResultDao resultDao = new ResultDaoImpl();

    public static void main(String[] args) {
        System.out.println("Student Result Management System");
        Scanner sc = new Scanner(System.in);
        while (true) {
            printMenu();
            String opt = sc.nextLine().trim();
            switch (opt) {
                case "1" -> addStudent(sc);
                case "2" -> listStudents();
                case "3" -> updateStudent(sc);
                case "4" -> deleteStudent(sc);
                case "5" -> addOrUpdateResult(sc);
                case "6" -> listResults();
                case "7" -> deleteResult(sc);
                case "0" -> {
                    System.out.println("Exiting.");
                    return;
                }
                default -> System.out.println("Invalid option");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nChoose an option:");
        System.out.println("1. Add Student");
        System.out.println("2. List Students");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Add/Update Result");
        System.out.println("6. List Results");
        System.out.println("7. Delete Result");
        System.out.println("0. Exit");
        System.out.print("> ");
    }

    private static void addStudent(Scanner sc) {
        try {
            System.out.print("Student ID: ");
            int id = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Name: ");
            String name = sc.nextLine().trim();
            System.out.print("Course: ");
            String course = sc.nextLine().trim();
            Student s = new Student(id, name, course);
            if (studentDao.addStudent(s)) System.out.println("Student added."); else System.out.println("Failed to add student.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
    }

    private static void listStudents() {
        List<Student> list = studentDao.findAll();
        if (list.isEmpty()) System.out.println("No students found.");
        else list.forEach(System.out::println);
    }

    private static void updateStudent(Scanner sc) {
        try {
            System.out.print("Student ID to update: ");
            int id = Integer.parseInt(sc.nextLine().trim());
            Student existing = studentDao.findById(id);
            if (existing == null) { System.out.println("Student not found."); return; }
            System.out.print("New name (enter to keep): ");
            String name = sc.nextLine().trim();
            System.out.print("New course (enter to keep): ");
            String course = sc.nextLine().trim();
            if (!name.isEmpty()) existing.setName(name);
            if (!course.isEmpty()) existing.setCourse(course);
            if (studentDao.updateStudent(existing)) System.out.println("Updated."); else System.out.println("Update failed.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
    }

    private static void deleteStudent(Scanner sc) {
        try {
            System.out.print("Student ID to delete: ");
            int id = Integer.parseInt(sc.nextLine().trim());
            if (studentDao.deleteStudent(id)) System.out.println("Deleted."); else System.out.println("Delete failed.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
    }

    private static void addOrUpdateResult(Scanner sc) {
        try {
            System.out.print("Student ID: ");
            int id = Integer.parseInt(sc.nextLine().trim());
            Student s = studentDao.findById(id);
            if (s == null) { System.out.println("Student not found."); return; }
            System.out.print("Marks (0-100): ");
            int marks = Integer.parseInt(sc.nextLine().trim());
            String grade = computeGrade(marks);
            Result r = new Result(id, marks, grade);
            Result existing = resultDao.findByStudentId(id);
            boolean ok = (existing == null) ? resultDao.addResult(r) : resultDao.updateResult(r);
            if (ok) System.out.println("Result saved: " + r); else System.out.println("Failed to save result.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
    }

    private static String computeGrade(int marks) {
        if (marks >= 90) return "A";
        if (marks >= 75) return "B";
        if (marks >= 60) return "C";
        if (marks >= 40) return "D";
        return "F";
    }

    private static void listResults() {
        List<Result> list = resultDao.findAll();
        if (list.isEmpty()) System.out.println("No results found.");
        else list.forEach(System.out::println);
    }

    private static void deleteResult(Scanner sc) {
        try {
            System.out.print("Student ID (result) to delete: ");
            int id = Integer.parseInt(sc.nextLine().trim());
            if (resultDao.deleteResult(id)) System.out.println("Result deleted."); else System.out.println("Delete failed.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
    }
}
