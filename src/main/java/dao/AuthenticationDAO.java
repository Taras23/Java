package dao;
import entity.Authentication;

import java.sql.SQLException;
import java.util.List;

public interface AuthenticationDAO {

    //create
    void add(Authentication authentication) throws SQLException;

    //read
    List<Authentication> getAll() throws SQLException;

    Authentication getById(String login) throws SQLException;
    Authentication checkUser(String login,String password) throws SQLException;

    //update
    void update(Authentication authentication) throws SQLException;

    //delete
    void remove(Authentication authentication) throws SQLException;
}
