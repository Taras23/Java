package dao;

import entity.Tests;

import java.sql.SQLException;
import java.util.List;

public interface TestsDAO {

    //create
    void add(Tests tests) throws SQLException;

    //read
    List<Tests> getAll() throws SQLException;

    Tests getById(Long id) throws SQLException;

    //update
    void update(Tests tests) throws SQLException;

    //delete
    void remove(Tests tests) throws SQLException;
}
