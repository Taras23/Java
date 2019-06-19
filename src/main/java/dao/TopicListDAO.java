package dao;

import entity.TopicList;

import java.sql.SQLException;
import java.util.List;

public interface TopicListDAO {

    //create
    void add(TopicList topicList) throws SQLException;

    //read
    List<TopicList> getAll() throws SQLException;

    TopicList getById(Long id) throws SQLException;

    //update
    void update(TopicList topicList) throws SQLException;

    //delete
    void remove(TopicList topicList) throws SQLException;
}
