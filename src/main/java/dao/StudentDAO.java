package dao;

import entity.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDAO {

    //create
    void add(Student student) throws SQLException;

    //read
    List<Student> getAll() throws SQLException;

    Student getById(Long id) throws SQLException;

    //update
    void update(Student student) throws SQLException;

    //delete
    void remove(Student student) throws SQLException;
}
