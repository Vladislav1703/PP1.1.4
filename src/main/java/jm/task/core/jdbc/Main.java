package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl userDao = new UserDaoJDBCImpl();
        try {
            userDao.createUsersTable();
            userDao.saveUser("Egor", "Letov", (byte) 43);
            userDao.saveUser("Xi", "Jinping", (byte) 68);
            userDao.saveUser("Dimem", "Mem", (byte) 25);
            userDao.saveUser("Petr", "Ivanov", (byte) 88);
            System.out.println(userDao.getAllUsers());
            userDao.cleanUsersTable();
            userDao.dropUsersTable();
        } catch (Exception e) {
            System.out.println("bad :(");
        }
    }
}
