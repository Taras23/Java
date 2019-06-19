package service;

import bl.Util;
import dao.StudentDAO;
import entity.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class StudentService extends Util implements StudentDAO {

    Connection connection = getConnection();
    @Override
    public void add(Student student) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO STUDENT (STUDENT_NAME, STUDENT_SURNAME, EMAIL, SUCCESS) VALUES(?,?,?,?)";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, student.getStudent_name());
            preparedStatement.setString(2, student.getStudent_surname());
            preparedStatement.setString(3, student.getEmail());
            preparedStatement.setFloat(4, student.getSuccess());

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
    public List<Student> getAll() throws SQLException {
        List<Student> studentList = new ArrayList<>();
        String sql = "SELECT ID, STUDENT_NAME, STUDENT_SURNAME, EMAIL, SUCCESS";

        Statement statement = null;
        try {
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getLong("ID"));
                student.setStudent_name(resultSet.getString("STUDENT_NAME"));
                student.setStudent_surname(resultSet.getString("STUDENT_SURNAME"));
                student.setEmail(resultSet.getString("EMAIL"));
                student.setSuccess(resultSet.getFloat("SUCCESS"));

                studentList.add(student);
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

        return studentList;
    }
    @Override
    public Student getById(Long id) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "SELECT ID, STUDENT_NAME, STUDENT_SURNAME, EMAIL, SUCCESS FROM STUDENT WHERE ID=?";

        Student student = new Student();

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);

            ResultSet resultSet = preparedStatement.executeQuery(sql);

            student.setId(resultSet.getLong("ID"));
            student.setStudent_name(resultSet.getString("STUDENT_NAME"));
            student.setStudent_surname(resultSet.getString("STUDENT_SURNAME"));
            student.setEmail(resultSet.getString("EMAIL"));
            student.setSuccess(resultSet.getFloat("SUCCESS"));

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
        return student;
    }

    @Override
    public void update(Student student) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "UPDATE STUDENT SET ID=?, STUDENT_NAME=?, STUDENT_SURNAME=?, EMAIL=?, SUCCESS=? WHERE ID=?";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, student.getId());
            preparedStatement.setString(2, student.getStudent_name());
            preparedStatement.setString(3, student.getStudent_surname());
            preparedStatement.setString(4, student.getEmail());
            preparedStatement.setFloat(5, student.getSuccess());
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
    public void remove(Student student) throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM STUDENT WHERE ID=?";
            try{
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setLong(1, student.getId());
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
