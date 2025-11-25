package com.example.srms.dao;

import com.example.srms.model.Result;

import java.util.List;

public interface ResultDao {
    boolean addResult(Result result);
    Result findByStudentId(int studentId);
    List<Result> findAll();
    boolean updateResult(Result result);
    boolean deleteResult(int studentId);
}
