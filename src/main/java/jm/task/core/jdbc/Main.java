package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        try {
            userService.createUsersTable();
            userService.saveUser("Egor", "Letov", (byte) 43);
            userService.saveUser("Xi", "Jinping", (byte) 68);
            userService.saveUser("Dimem", "Mem", (byte) 25);
            userService.saveUser("Petr", "Ivanov", (byte) 88);
            System.out.println(userService.getAllUsers());
            userService.cleanUsersTable();
            userService.dropUsersTable();
        } catch (Exception e) {
            System.out.println("bad :(");
        }
    }
}
