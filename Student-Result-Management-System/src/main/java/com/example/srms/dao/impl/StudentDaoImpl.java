package com.example.srms.dao.impl;

import com.example.srms.dao.StudentDao;
import com.example.srms.db.DatabaseUtil;
import com.example.srms.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public boolean addStudent(Student student) {
        String sql = "INSERT INTO student(student_id, name, course) VALUES (?, ?, ?)";
        try (Connection c = DatabaseUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, student.getStudentId());
            ps.setString(2, student.getName());
            ps.setString(3, student.getCourse());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            System.err.println("addStudent error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public Student findById(int studentId) {
        String sql = "SELECT student_id, name, course FROM student WHERE student_id = ?";
        try (Connection c = DatabaseUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, studentId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Student(rs.getInt("student_id"), rs.getString("name"), rs.getString("course"));
                }
            }
        } catch (SQLException e) {
            System.err.println("findById error: " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Student> findAll() {
        String sql = "SELECT student_id, name, course FROM student";
        List<Student> list = new ArrayList<>();
        try (Connection c = DatabaseUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                list.add(new Student(rs.getInt("student_id"), rs.getString("name"), rs.getString("course")));
            }
        } catch (SQLException e) {
            System.err.println("findAll error: " + e.getMessage());
        }
        return list;
    }

    @Override
    public boolean updateStudent(Student student) {
        String sql = "UPDATE student SET name = ?, course = ? WHERE student_id = ?";
        try (Connection c = DatabaseUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, student.getName());
            ps.setString(2, student.getCourse());
            ps.setInt(3, student.getStudentId());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            System.err.println("updateStudent error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteStudent(int studentId) {
        String sql = "DELETE FROM student WHERE student_id = ?";
        try (Connection c = DatabaseUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, studentId);
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            System.err.println("deleteStudent error: " + e.getMessage());
            return false;
        }
    }
}
