package service;


        import bl.Util;
        import dao.AuthenticationDAO;
        import entity.Authentication;

        import java.sql.*;
        import java.util.ArrayList;
        import java.util.List;

public class AuthenticationService extends Util implements AuthenticationDAO {

    Connection connection = getConnection();
    @Override
    public void add(Authentication authentication) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO AUTHENTICATION (LOGIN, PASSWORD, ROLE) VALUES(?,?,?)";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, authentication.getLogin());
            preparedStatement.setString(2, authentication.getPassword());
            preparedStatement.setString(3, authentication.getRole());

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
    public List<Authentication> getAll() throws SQLException {
        List<Authentication> authenticationList = new ArrayList<>();
        String sql = "SELECT LOGIN, PASSWORD,ROLE";

        Statement statement = null;
        try {
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Authentication authentication = new Authentication();
                authentication.setLogin(resultSet.getString("LOGIN"));
                authentication.setPassword(resultSet.getString("PASSWORD"));
                authentication.setRole(resultSet.getString("ROLE"));

                authenticationList.add(authentication);
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

        return authenticationList;
    }
    @Override
    public Authentication getById(String login) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "SELECT LOGIN, PASSWORD, ROLE FROM AUTHENTICATION WHERE LOGIN=?";

        Authentication authentication = new Authentication();

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,login);

            ResultSet resultSet = preparedStatement.executeQuery(sql);

            authentication.setLogin(resultSet.getString("LOGIN"));
            authentication.setPassword(resultSet.getString("PASSWORD"));
            authentication.setRole(resultSet.getString("ROLE"));

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
        return authentication;
    }
    public Authentication checkUser(String login,String password) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "SELECT LOGIN, PASSWORD, ROLE FROM AUTHENTICATION WHERE LOGIN=? and PASSWORD=?";

        Authentication authentication = new Authentication();

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,login);
            preparedStatement.setString(2,password);

            ResultSet resultSet = preparedStatement.executeQuery(sql);

            authentication.setLogin(resultSet.getString("LOGIN"));
            authentication.setPassword(resultSet.getString("PASSWORD"));
            authentication.setRole(resultSet.getString("ROLE"));

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
        return authentication;
    }
    @Override
    public void update(Authentication authentication) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "UPDATE AUTHENTICATION SET LOGIN=?, PASSWORD=?,ROLE=? WHERE LOGIN=?";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, authentication.getLogin());
            preparedStatement.setString(2, authentication.getPassword());
            preparedStatement.setString(3, authentication.getRole());
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
    public void remove(Authentication authentication) throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM AUTHENTICATION WHERE LOGIN=?";
        try{
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, authentication.getLogin());
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


