package service;


import bl.Util;
import dao.TestsDAO;
import entity.Tests;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

    public class TestsService extends Util implements TestsDAO {

        Connection connection = getConnection();
        @Override
        public void add(Tests tests) throws SQLException {
            PreparedStatement preparedStatement = null;

            String sql = "INSERT INTO TESTS (ID, TOPIC, QUESTION1, ANSWER11, ANSWER12, ANSWER13,ANSWER14,CORRECTANSWER1, QUESTION2, ANSWER21, ANSWER22, ANSWER23,ANSWER24,CORRECTANSWER2, QUESTION3, ANSWER31, ANSWER32, ANSWER33,ANSWER34,CORRECTANSWER3, QUESTION4, ANSWER41, ANSWER42, ANSWER43,ANSWER44,CORRECTANSWER4, QUESTION5, ANSWER51, ANSWER52, ANSWER53,ANSWER54,CORRECTANSWER5, QUESTION6, ANSWER61, ANSWER62, ANSWER63,ANSWER64,CORRECTANSWER6, QUESTION7, ANSWER71, ANSWER72, ANSWER73,ANSWER74,CORRECTANSWER7, QUESTION8, ANSWER81, ANSWER82, ANSWER83,ANSWER84,CORRECTANSWER8, QUESTION9, ANSWER91, ANSWER92, ANSWER93,ANSWER94,CORRECTANSWER9, QUESTION10, ANSWER101, ANSWER102, ANSWER103,ANSWER104,CORRECTANSWER10, QUESTION11, ANSWER111, ANSWER112, ANSWER113,ANSWER114,CORRECTANSWER11, QUESTION12, ANSWER121, ANSWER122, ANSWER123,ANSWER124,CORRECTANSWER12) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setLong(1, tests.getId());
                preparedStatement.setLong(2, tests.getTopic());

                preparedStatement.setString(3, tests.getQuestion1());
                preparedStatement.setString(4, tests.getAnswer11());
                preparedStatement.setString(5, tests.getAnswer12());
                preparedStatement.setString(6, tests.getAnswer13());
                preparedStatement.setString(7, tests.getAnswer14());
                preparedStatement.setString(8, tests.getCorrectanswer1());

                preparedStatement.setString(9, tests.getQuestion2());
                preparedStatement.setString(10, tests.getAnswer21());
                preparedStatement.setString(11, tests.getAnswer22());
                preparedStatement.setString(12, tests.getAnswer23());
                preparedStatement.setString(13, tests.getAnswer24());
                preparedStatement.setString(14, tests.getCorrectanswer2());

                preparedStatement.setString(15, tests.getQuestion3());
                preparedStatement.setString(16, tests.getAnswer31());
                preparedStatement.setString(17, tests.getAnswer32());
                preparedStatement.setString(18, tests.getAnswer33());
                preparedStatement.setString(19, tests.getAnswer34());
                preparedStatement.setString(20, tests.getCorrectanswer3());

                preparedStatement.setString(21, tests.getQuestion4());
                preparedStatement.setString(22, tests.getAnswer41());
                preparedStatement.setString(23, tests.getAnswer42());
                preparedStatement.setString(24, tests.getAnswer43());
                preparedStatement.setString(25, tests.getAnswer44());
                preparedStatement.setString(26, tests.getCorrectanswer4());

                preparedStatement.setString(27, tests.getQuestion5());
                preparedStatement.setString(28, tests.getAnswer51());
                preparedStatement.setString(29, tests.getAnswer52());
                preparedStatement.setString(30, tests.getAnswer53());
                preparedStatement.setString(31, tests.getAnswer54());
                preparedStatement.setString(32, tests.getCorrectanswer5());

                preparedStatement.setString(33, tests.getQuestion6());
                preparedStatement.setString(34, tests.getAnswer61());
                preparedStatement.setString(35, tests.getAnswer62());
                preparedStatement.setString(36, tests.getAnswer63());
                preparedStatement.setString(37, tests.getAnswer64());
                preparedStatement.setString(38, tests.getCorrectanswer6());

                preparedStatement.setString(39, tests.getQuestion7());
                preparedStatement.setString(40, tests.getAnswer71());
                preparedStatement.setString(41, tests.getAnswer72());
                preparedStatement.setString(42, tests.getAnswer73());
                preparedStatement.setString(43, tests.getAnswer74());
                preparedStatement.setString(44, tests.getCorrectanswer7());

                preparedStatement.setString(45, tests.getQuestion8());
                preparedStatement.setString(46, tests.getAnswer81());
                preparedStatement.setString(47, tests.getAnswer82());
                preparedStatement.setString(48, tests.getAnswer83());
                preparedStatement.setString(49, tests.getAnswer84());
                preparedStatement.setString(50, tests.getCorrectanswer8());

                preparedStatement.setString(51, tests.getQuestion9());
                preparedStatement.setString(52, tests.getAnswer91());
                preparedStatement.setString(53, tests.getAnswer92());
                preparedStatement.setString(54, tests.getAnswer93());
                preparedStatement.setString(55, tests.getAnswer94());
                preparedStatement.setString(56, tests.getCorrectanswer9());

                preparedStatement.setString(57, tests.getQuestion10());
                preparedStatement.setString(58, tests.getAnswer101());
                preparedStatement.setString(59, tests.getAnswer102());
                preparedStatement.setString(60, tests.getAnswer103());
                preparedStatement.setString(61, tests.getAnswer104());
                preparedStatement.setString(62, tests.getCorrectanswer10());

                preparedStatement.setString(63, tests.getQuestion11());
                preparedStatement.setString(64, tests.getAnswer111());
                preparedStatement.setString(65, tests.getAnswer112());
                preparedStatement.setString(66, tests.getAnswer113());
                preparedStatement.setString(67, tests.getAnswer114());
                preparedStatement.setString(68, tests.getCorrectanswer11());

                preparedStatement.setString(69, tests.getQuestion12());
                preparedStatement.setString(70, tests.getAnswer121());
                preparedStatement.setString(71, tests.getAnswer122());
                preparedStatement.setString(72, tests.getAnswer123());
                preparedStatement.setString(73, tests.getAnswer124());
                preparedStatement.setString(74, tests.getCorrectanswer12());


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
        public List<Tests> getAll() throws SQLException {
            List<Tests> teststList = new ArrayList<>();
            String sql = "SELECT ID, TOPIC, QUESTION1, ANSWER11, ANSWER12, ANSWER13,ANSWER14,CORRECTANSWER1, QUESTION2, ANSWER21, ANSWER22, ANSWER23,ANSWER24,CORRECTANSWER2, QUESTION3, ANSWER31, ANSWER32, ANSWER33,ANSWER34,CORRECTANSWER3, QUESTION4, ANSWER41, ANSWER42, ANSWER43,ANSWER44,CORRECTANSWER4, QUESTION5, ANSWER51, ANSWER52, ANSWER53,ANSWER54,CORRECTANSWER5, QUESTION6, ANSWER61, ANSWER62, ANSWER63,ANSWER64,CORRECTANSWER6, QUESTION7, ANSWER71, ANSWER72, ANSWER73,ANSWER74,CORRECTANSWER7, QUESTION8, ANSWER81, ANSWER82, ANSWER83,ANSWER84,CORRECTANSWER8, QUESTION9, ANSWER91, ANSWER92, ANSWER93,ANSWER94,CORRECTANSWER9, QUESTION10, ANSWER101, ANSWER102, ANSWER103,ANSWER104,CORRECTANSWER10, QUESTION11, ANSWER111, ANSWER112, ANSWER113,ANSWER114,CORRECTANSWER11, QUESTION12, ANSWER121, ANSWER122, ANSWER123,ANSWER124,CORRECTANSWER12";

            Statement statement = null;
            try {
                statement = connection.createStatement();

                ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next()) {
                    Tests tests = new Tests();

                    tests.setId(resultSet.getLong("ID"));
                    tests.setTopic(resultSet.getLong("TOPIC"));
                    tests.setQuestion1(resultSet.getString("QUESTION1"));
                    tests.setAnswer11(resultSet.getString("ANSWER11"));
                    tests.setAnswer12(resultSet.getString("ANSWER12"));
                    tests.setAnswer13(resultSet.getString("ANSWER13"));
                    tests.setAnswer14(resultSet.getString("ANSWER14"));
                    tests.setCorrectanswer1(resultSet.getString("CORRECTANSWER1"));

                    tests.setQuestion2(resultSet.getString("QUESTION2"));
                    tests.setAnswer21(resultSet.getString("ANSWER21"));
                    tests.setAnswer22(resultSet.getString("ANSWER22"));
                    tests.setAnswer23(resultSet.getString("ANSWER23"));
                    tests.setAnswer24(resultSet.getString("ANSWER24"));
                    tests.setCorrectanswer2(resultSet.getString("CORRECTANSWER2"));

                    tests.setQuestion3(resultSet.getString("QUESTION3"));
                    tests.setAnswer31(resultSet.getString("ANSWER31"));
                    tests.setAnswer32(resultSet.getString("ANSWER32"));
                    tests.setAnswer33(resultSet.getString("ANSWER33"));
                    tests.setAnswer34(resultSet.getString("ANSWER34"));
                    tests.setCorrectanswer3(resultSet.getString("CORRECTANSWER3"));

                    tests.setQuestion4(resultSet.getString("QUESTION4"));
                    tests.setAnswer41(resultSet.getString("ANSWER41"));
                    tests.setAnswer42(resultSet.getString("ANSWER42"));
                    tests.setAnswer43(resultSet.getString("ANSWER43"));
                    tests.setAnswer44(resultSet.getString("ANSWER44"));
                    tests.setCorrectanswer4(resultSet.getString("CORRECTANSWER4"));

                    tests.setQuestion5(resultSet.getString("QUESTION5"));
                    tests.setAnswer51(resultSet.getString("ANSWER51"));
                    tests.setAnswer52(resultSet.getString("ANSWER52"));
                    tests.setAnswer53(resultSet.getString("ANSWER53"));
                    tests.setAnswer54(resultSet.getString("ANSWER54"));
                    tests.setCorrectanswer5(resultSet.getString("CORRECTANSWER5"));

                    tests.setQuestion6(resultSet.getString("QUESTION6"));
                    tests.setAnswer61(resultSet.getString("ANSWER61"));
                    tests.setAnswer62(resultSet.getString("ANSWER62"));
                    tests.setAnswer63(resultSet.getString("ANSWER63"));
                    tests.setAnswer64(resultSet.getString("ANSWER64"));
                    tests.setCorrectanswer6(resultSet.getString("CORRECTANSWER6"));

                    tests.setQuestion7(resultSet.getString("QUESTION7"));
                    tests.setAnswer71(resultSet.getString("ANSWER71"));
                    tests.setAnswer72(resultSet.getString("ANSWER72"));
                    tests.setAnswer73(resultSet.getString("ANSWER73"));
                    tests.setAnswer74(resultSet.getString("ANSWER74"));
                    tests.setCorrectanswer7(resultSet.getString("CORRECTANSWER7"));

                    tests.setQuestion8(resultSet.getString("QUESTION8"));
                    tests.setAnswer81(resultSet.getString("ANSWER81"));
                    tests.setAnswer82(resultSet.getString("ANSWER82"));
                    tests.setAnswer83(resultSet.getString("ANSWER83"));
                    tests.setAnswer84(resultSet.getString("ANSWER84"));
                    tests.setCorrectanswer8(resultSet.getString("CORRECTANSWER8"));

                    tests.setQuestion9(resultSet.getString("QUESTION9"));
                    tests.setAnswer91(resultSet.getString("ANSWER91"));
                    tests.setAnswer92(resultSet.getString("ANSWER92"));
                    tests.setAnswer93(resultSet.getString("ANSWER93"));
                    tests.setAnswer94(resultSet.getString("ANSWER94"));
                    tests.setCorrectanswer9(resultSet.getString("CORRECTANSWER9"));

                    tests.setQuestion10(resultSet.getString("QUESTION10"));
                    tests.setAnswer101(resultSet.getString("ANSWER101"));
                    tests.setAnswer102(resultSet.getString("ANSWER102"));
                    tests.setAnswer103(resultSet.getString("ANSWER103"));
                    tests.setAnswer104(resultSet.getString("ANSWER104"));
                    tests.setCorrectanswer10(resultSet.getString("CORRECTANSWER10"));

                    tests.setQuestion11(resultSet.getString("QUESTION11"));
                    tests.setAnswer111(resultSet.getString("ANSWER111"));
                    tests.setAnswer112(resultSet.getString("ANSWER112"));
                    tests.setAnswer113(resultSet.getString("ANSWER113"));
                    tests.setAnswer114(resultSet.getString("ANSWER114"));
                    tests.setCorrectanswer11(resultSet.getString("CORRECTANSWER11"));

                    tests.setQuestion12(resultSet.getString("QUESTION12"));
                    tests.setAnswer121(resultSet.getString("ANSWER121"));
                    tests.setAnswer122(resultSet.getString("ANSWER122"));
                    tests.setAnswer123(resultSet.getString("ANSWER123"));
                    tests.setAnswer124(resultSet.getString("ANSWER124"));
                    tests.setCorrectanswer12(resultSet.getString("CORRECTANSWER12"));

                    teststList.add(tests);
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

            return teststList;
        }
        @Override
        public Tests getById(Long id) throws SQLException {
            PreparedStatement preparedStatement = null;

            String sql = "SELECT ID, TOPIC, QUESTION1, ANSWER11, ANSWER12, ANSWER13,ANSWER14,CORRECTANSWER1, QUESTION2, ANSWER21, ANSWER22, ANSWER23,ANSWER24,CORRECTANSWER2, QUESTION3, ANSWER31, ANSWER32, ANSWER33,ANSWER34,CORRECTANSWER3, QUESTION4, ANSWER41, ANSWER42, ANSWER43,ANSWER44,CORRECTANSWER4, QUESTION5, ANSWER51, ANSWER52, ANSWER53,ANSWER54,CORRECTANSWER5, QUESTION6, ANSWER61, ANSWER62, ANSWER63,ANSWER64,CORRECTANSWER6, QUESTION7, ANSWER71, ANSWER72, ANSWER73,ANSWER74,CORRECTANSWER7, QUESTION8, ANSWER81, ANSWER82, ANSWER83,ANSWER84,CORRECTANSWER8, QUESTION9, ANSWER91, ANSWER92, ANSWER93,ANSWER94,CORRECTANSWER9, QUESTION10, ANSWER101, ANSWER102, ANSWER103,ANSWER104,CORRECTANSWER10, QUESTION11, ANSWER111, ANSWER112, ANSWER113,ANSWER114,CORRECTANSWER11, QUESTION12, ANSWER121, ANSWER122, ANSWER123,ANSWER124,CORRECTANSWER12 FROM TESTS WHERE ID=?";

            Tests tests = new Tests();

            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setLong(1, id);

                ResultSet resultSet = preparedStatement.executeQuery(sql);

                tests.setId(resultSet.getLong("ID"));
                tests.setTopic(resultSet.getLong("TOPIC"));
                tests.setQuestion1(resultSet.getString("QUESTION1"));
                tests.setAnswer11(resultSet.getString("ANSWER11"));
                tests.setAnswer12(resultSet.getString("ANSWER12"));
                tests.setAnswer13(resultSet.getString("ANSWER13"));
                tests.setAnswer14(resultSet.getString("ANSWER14"));
                tests.setCorrectanswer1(resultSet.getString("CORRECTANSWER1"));

                tests.setQuestion2(resultSet.getString("QUESTION2"));
                tests.setAnswer21(resultSet.getString("ANSWER21"));
                tests.setAnswer22(resultSet.getString("ANSWER22"));
                tests.setAnswer23(resultSet.getString("ANSWER23"));
                tests.setAnswer24(resultSet.getString("ANSWER24"));
                tests.setCorrectanswer2(resultSet.getString("CORRECTANSWER2"));

                tests.setQuestion3(resultSet.getString("QUESTION3"));
                tests.setAnswer31(resultSet.getString("ANSWER31"));
                tests.setAnswer32(resultSet.getString("ANSWER32"));
                tests.setAnswer33(resultSet.getString("ANSWER33"));
                tests.setAnswer34(resultSet.getString("ANSWER34"));
                tests.setCorrectanswer3(resultSet.getString("CORRECTANSWER3"));

                tests.setQuestion4(resultSet.getString("QUESTION4"));
                tests.setAnswer41(resultSet.getString("ANSWER41"));
                tests.setAnswer42(resultSet.getString("ANSWER42"));
                tests.setAnswer43(resultSet.getString("ANSWER43"));
                tests.setAnswer44(resultSet.getString("ANSWER44"));
                tests.setCorrectanswer4(resultSet.getString("CORRECTANSWER4"));

                tests.setQuestion5(resultSet.getString("QUESTION5"));
                tests.setAnswer51(resultSet.getString("ANSWER51"));
                tests.setAnswer52(resultSet.getString("ANSWER52"));
                tests.setAnswer53(resultSet.getString("ANSWER53"));
                tests.setAnswer54(resultSet.getString("ANSWER54"));
                tests.setCorrectanswer5(resultSet.getString("CORRECTANSWER5"));

                tests.setQuestion6(resultSet.getString("QUESTION6"));
                tests.setAnswer61(resultSet.getString("ANSWER61"));
                tests.setAnswer62(resultSet.getString("ANSWER62"));
                tests.setAnswer63(resultSet.getString("ANSWER63"));
                tests.setAnswer64(resultSet.getString("ANSWER64"));
                tests.setCorrectanswer6(resultSet.getString("CORRECTANSWER6"));

                tests.setQuestion7(resultSet.getString("QUESTION7"));
                tests.setAnswer71(resultSet.getString("ANSWER71"));
                tests.setAnswer72(resultSet.getString("ANSWER72"));
                tests.setAnswer73(resultSet.getString("ANSWER73"));
                tests.setAnswer74(resultSet.getString("ANSWER74"));
                tests.setCorrectanswer7(resultSet.getString("CORRECTANSWER7"));

                tests.setQuestion8(resultSet.getString("QUESTION8"));
                tests.setAnswer81(resultSet.getString("ANSWER81"));
                tests.setAnswer82(resultSet.getString("ANSWER82"));
                tests.setAnswer83(resultSet.getString("ANSWER83"));
                tests.setAnswer84(resultSet.getString("ANSWER84"));
                tests.setCorrectanswer8(resultSet.getString("CORRECTANSWER8"));

                tests.setQuestion9(resultSet.getString("QUESTION9"));
                tests.setAnswer91(resultSet.getString("ANSWER91"));
                tests.setAnswer92(resultSet.getString("ANSWER92"));
                tests.setAnswer93(resultSet.getString("ANSWER93"));
                tests.setAnswer94(resultSet.getString("ANSWER94"));
                tests.setCorrectanswer9(resultSet.getString("CORRECTANSWER9"));

                tests.setQuestion10(resultSet.getString("QUESTION10"));
                tests.setAnswer101(resultSet.getString("ANSWER101"));
                tests.setAnswer102(resultSet.getString("ANSWER102"));
                tests.setAnswer103(resultSet.getString("ANSWER103"));
                tests.setAnswer104(resultSet.getString("ANSWER104"));
                tests.setCorrectanswer10(resultSet.getString("CORRECTANSWER10"));

                tests.setQuestion11(resultSet.getString("QUESTION11"));
                tests.setAnswer111(resultSet.getString("ANSWER111"));
                tests.setAnswer112(resultSet.getString("ANSWER112"));
                tests.setAnswer113(resultSet.getString("ANSWER113"));
                tests.setAnswer114(resultSet.getString("ANSWER114"));
                tests.setCorrectanswer11(resultSet.getString("CORRECTANSWER11"));

                tests.setQuestion12(resultSet.getString("QUESTION12"));
                tests.setAnswer121(resultSet.getString("ANSWER121"));
                tests.setAnswer122(resultSet.getString("ANSWER122"));
                tests.setAnswer123(resultSet.getString("ANSWER123"));
                tests.setAnswer124(resultSet.getString("ANSWER124"));
                tests.setCorrectanswer12(resultSet.getString("CORRECTANSWER12"));

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
            return tests;
        }
        @Override
        public void update(Tests tests) throws SQLException {
            PreparedStatement preparedStatement = null;

            String sql = "UPDATE TESTS SET ID=?, TOPIC=?, QUESTION1=?, ANSWER11=?, ANSWER12=?, ANSWER13=?,ANSWER14=?,CORRECTANSWER1=?, QUESTION2=?, ANSWER21=?, ANSWER22=?, ANSWER23=?,ANSWER24=?,CORRECTANSWER2=?, QUESTION3=?, ANSWER31=?, ANSWER32=?, ANSWER33=?,ANSWER34=?,CORRECTANSWER3=?, QUESTION4=?, ANSWER41=?, ANSWER42=?, ANSWER43=?,ANSWER44=?,CORRECTANSWER4=?, QUESTION5=?, ANSWER51=?, ANSWER52=?, ANSWER53=?,ANSWER54=?,CORRECTANSWER5=?, QUESTION6=?, ANSWER61=?, ANSWER62=?, ANSWER63=?,ANSWER64=?,CORRECTANSWER6=?, QUESTION7=?, ANSWER71=?, ANSWER72=?, ANSWER73=?,ANSWER74=?,CORRECTANSWER7=?, QUESTION8=?, ANSWER81=?, ANSWER82=?, ANSWER83=?,ANSWER84=?,CORRECTANSWER8=?, QUESTION9=?, ANSWER91=?, ANSWER92=?, ANSWER93=?,ANSWER94=?,CORRECTANSWER9=?, QUESTION10=?, ANSWER101=?, ANSWER102=?, ANSWER103=?,ANSWER104=?,CORRECTANSWER10=?, QUESTION11=?, ANSWER111=?, ANSWER112=?, ANSWER113=?,ANSWER114=?,CORRECTANSWER11=?, QUESTION12=?, ANSWER121=?, ANSWER122=?, ANSWER123=?,ANSWER124=?,CORRECTANSWER12=? WHERE ID=?";

            try {
                preparedStatement = connection.prepareStatement(sql);

                preparedStatement.setLong(1, tests.getId());
                preparedStatement.setLong(2, tests.getTopic());

                preparedStatement.setString(3, tests.getQuestion1());
                preparedStatement.setString(4, tests.getAnswer11());
                preparedStatement.setString(5, tests.getAnswer12());
                preparedStatement.setString(6, tests.getAnswer13());
                preparedStatement.setString(7, tests.getAnswer14());
                preparedStatement.setString(8, tests.getCorrectanswer1());

                preparedStatement.setString(9, tests.getQuestion2());
                preparedStatement.setString(10, tests.getAnswer21());
                preparedStatement.setString(11, tests.getAnswer22());
                preparedStatement.setString(12, tests.getAnswer23());
                preparedStatement.setString(13, tests.getAnswer24());
                preparedStatement.setString(14, tests.getCorrectanswer2());

                preparedStatement.setString(15, tests.getQuestion3());
                preparedStatement.setString(16, tests.getAnswer31());
                preparedStatement.setString(17, tests.getAnswer32());
                preparedStatement.setString(18, tests.getAnswer33());
                preparedStatement.setString(19, tests.getAnswer34());
                preparedStatement.setString(20, tests.getCorrectanswer3());

                preparedStatement.setString(21, tests.getQuestion4());
                preparedStatement.setString(22, tests.getAnswer41());
                preparedStatement.setString(23, tests.getAnswer42());
                preparedStatement.setString(24, tests.getAnswer43());
                preparedStatement.setString(25, tests.getAnswer44());
                preparedStatement.setString(26, tests.getCorrectanswer4());

                preparedStatement.setString(27, tests.getQuestion5());
                preparedStatement.setString(28, tests.getAnswer51());
                preparedStatement.setString(29, tests.getAnswer52());
                preparedStatement.setString(30, tests.getAnswer53());
                preparedStatement.setString(31, tests.getAnswer54());
                preparedStatement.setString(32, tests.getCorrectanswer5());

                preparedStatement.setString(33, tests.getQuestion6());
                preparedStatement.setString(34, tests.getAnswer61());
                preparedStatement.setString(35, tests.getAnswer62());
                preparedStatement.setString(36, tests.getAnswer63());
                preparedStatement.setString(37, tests.getAnswer64());
                preparedStatement.setString(38, tests.getCorrectanswer6());

                preparedStatement.setString(39, tests.getQuestion7());
                preparedStatement.setString(40, tests.getAnswer71());
                preparedStatement.setString(41, tests.getAnswer72());
                preparedStatement.setString(42, tests.getAnswer73());
                preparedStatement.setString(43, tests.getAnswer74());
                preparedStatement.setString(44, tests.getCorrectanswer7());

                preparedStatement.setString(45, tests.getQuestion8());
                preparedStatement.setString(46, tests.getAnswer81());
                preparedStatement.setString(47, tests.getAnswer82());
                preparedStatement.setString(48, tests.getAnswer83());
                preparedStatement.setString(49, tests.getAnswer84());
                preparedStatement.setString(50, tests.getCorrectanswer8());

                preparedStatement.setString(51, tests.getQuestion9());
                preparedStatement.setString(52, tests.getAnswer91());
                preparedStatement.setString(53, tests.getAnswer92());
                preparedStatement.setString(54, tests.getAnswer93());
                preparedStatement.setString(55, tests.getAnswer94());
                preparedStatement.setString(56, tests.getCorrectanswer9());

                preparedStatement.setString(57, tests.getQuestion10());
                preparedStatement.setString(58, tests.getAnswer101());
                preparedStatement.setString(59, tests.getAnswer102());
                preparedStatement.setString(60, tests.getAnswer103());
                preparedStatement.setString(61, tests.getAnswer104());
                preparedStatement.setString(62, tests.getCorrectanswer10());

                preparedStatement.setString(63, tests.getQuestion11());
                preparedStatement.setString(64, tests.getAnswer111());
                preparedStatement.setString(65, tests.getAnswer112());
                preparedStatement.setString(66, tests.getAnswer113());
                preparedStatement.setString(67, tests.getAnswer114());
                preparedStatement.setString(68, tests.getCorrectanswer11());

                preparedStatement.setString(69, tests.getQuestion12());
                preparedStatement.setString(70, tests.getAnswer121());
                preparedStatement.setString(71, tests.getAnswer122());
                preparedStatement.setString(72, tests.getAnswer123());
                preparedStatement.setString(73, tests.getAnswer124());
                preparedStatement.setString(74, tests.getCorrectanswer12());

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
        public void remove(Tests tests) throws SQLException {
            PreparedStatement preparedStatement = null;
            String sql = "DELETE FROM TESTS WHERE ID=?";
            try{
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setLong(1, tests.getId());
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


