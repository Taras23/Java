package service;


import bl.Util;
import dao.TopicListDAO;
import entity.TopicList;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TopicListService extends Util implements TopicListDAO {

    Connection connection = getConnection();
    @Override
    public void add(TopicList topicList) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO TOPICLIST (ID, TOPIC, DESCRIPTION, LIST) VALUES(?,?,?,?)";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, topicList.getId());
            preparedStatement.setString(2, topicList.getTopic());
            preparedStatement.setString(3, topicList.getDescription());
            preparedStatement.setLong(4, topicList.getList());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (connection != null) {
                connection.close();
            }
        }
    }
    @Override
    public List<TopicList> getAll() throws SQLException {
        List<TopicList> topicListList = new ArrayList<>();
        String sql = "SELECT ID, TOPIC, DESCRIPTION, LIST";

        Statement statement = null;
        try {
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                TopicList topicList = new TopicList();
                topicList.setId(resultSet.getLong("ID"));
                topicList.setTopic(resultSet.getString("TOPIC"));
                topicList.setDescription(resultSet.getString("DESCRIPTION"));
                topicList.setList(resultSet.getLong("LIST"));

                topicListList.add(topicList);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }

        return topicListList;
    }
    @Override
    public TopicList getById(Long id) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "SELECT ID, TOPIC, DESCRIPTION, LIST FROM TOPICLIST WHERE ID=?";

        TopicList topicList = new TopicList();

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);

            ResultSet resultSet = preparedStatement.executeQuery(sql);

            topicList.setId(resultSet.getLong("ID"));
            topicList.setTopic(resultSet.getString("TOPIC"));
            topicList.setDescription(resultSet.getString("DESCRIPTION"));
            topicList.setList(resultSet.getLong("LIST"));


            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (connection != null) {
                connection.close();
            }
        }
        return topicList;
    }
    @Override
    public void update(TopicList topicList) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "UPDATE TOPICLIST SET ID=?, TOPIC=?, DESCRIPTION=?, LIST=? WHERE ID=?";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, topicList.getId());
            preparedStatement.setString(2, topicList.getTopic());
            preparedStatement.setString(3, topicList.getDescription());
            preparedStatement.setLong(4, topicList.getList());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
    @Override
    public void remove(TopicList topicList) throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM TOPICLIST WHERE ID=?";
        try{
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, topicList.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

}
