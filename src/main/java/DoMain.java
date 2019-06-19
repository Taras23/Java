import entity.Authentication;
import entity.Student;
import entity.Tests;
import entity.TopicList;
import service.AuthenticationService;
import service.StudentService;
import service.TestsService;
import service.TopicListService;

import java.sql.SQLException;

public class DoMain {
    public static void main (String[] args){
     //   Util util = new Util();
       // util.getConnection();
        AuthenticationService authenticationService = new AuthenticationService();
        StudentService studentService  = new StudentService();
        TestsService testsService = new TestsService();
        TopicListService topicListService = new TopicListService();

        Authentication authentication = new Authentication();
       // authentication.setLogin("123456");
        //authentication.setPassword("123456");

        Student student = new Student();

        student.setStudent_name("Props");
        student.setStudent_surname("ris");
        student.setEmail("dsa");
        student.setSuccess((float) 3);


        Tests tests = new Tests();

        TopicList topicList = new TopicList();

        try{
            authenticationService.add(authentication);
            studentService.add(student);
            testsService.add(tests);
            topicListService.add(topicList);
        }catch(SQLException e){
        e.printStackTrace();
        }

    }
}
