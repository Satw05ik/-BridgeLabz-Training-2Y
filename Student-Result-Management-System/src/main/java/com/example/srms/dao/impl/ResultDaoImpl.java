package com.example.srms.dao.impl;

import com.example.srms.dao.ResultDao;
import com.example.srms.db.DatabaseUtil;
import com.example.srms.model.Result;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResultDaoImpl implements ResultDao {
    @Override
    public boolean addResult(Result result) {
        String sql = "INSERT INTO result(student_id, marks, grade) VALUES (?, ?, ?)";
        try (Connection c = DatabaseUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, result.getStudentId());
            ps.setInt(2, result.getMarks());
            ps.setString(3, result.getGrade());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            System.err.println("addResult error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public Result findByStudentId(int studentId) {
        String sql = "SELECT student_id, marks, grade FROM result WHERE student_id = ?";
        try (Connection c = DatabaseUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, studentId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Result(rs.getInt("student_id"), rs.getInt("marks"), rs.getString("grade"));
                }
            }
        } catch (SQLException e) {
            System.err.println("findByStudentId error: " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Result> findAll() {
        String sql = "SELECT student_id, marks, grade FROM result";
        List<Result> list = new ArrayList<>();
        try (Connection c = DatabaseUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                list.add(new Result(rs.getInt("student_id"), rs.getInt("marks"), rs.getString("grade")));
            }
        } catch (SQLException e) {
            System.err.println("findAll results error: " + e.getMessage());
        }
        return list;
    }

    @Override
    public boolean updateResult(Result result) {
        String sql = "UPDATE result SET marks = ?, grade = ? WHERE student_id = ?";
        try (Connection c = DatabaseUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, result.getMarks());
            ps.setString(2, result.getGrade());
            ps.setInt(3, result.getStudentId());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            System.err.println("updateResult error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteResult(int studentId) {
        String sql = "DELETE FROM result WHERE student_id = ?";
        try (Connection c = DatabaseUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, studentId);
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            System.err.println("deleteResult error: " + e.getMessage());
            return false;
        }
    }
}
