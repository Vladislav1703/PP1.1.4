package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDaoHibernateImpl userDao = new UserDaoHibernateImpl();
        try {
//            userDao.createUsersTable();
//            userDao.removeUserById(1L);
//            userDao.createUsersTable();
//            userDao.dropUsersTable();
//            userDao.dropUsersTable();
//            final String testName = "Ivan";
//            final String testLastName = "Ivanov";
//            final byte testAge = 5;
//            userDao.saveUser(testName, testLastName, testAge);
//            final String testName1 = "Anton";
//            final String testLastName1 = "Olegov";
//            final byte testAge1 = 15;
//            userDao.saveUser(testName1, testLastName1, testAge1);
            List<User> userList = userDao.getAllUsers();
            for (User u: userList) {
                System.out.println(u.getName());
            }
        } catch (Exception e) {
            System.out.println("bad :(");
        }
    }
}
