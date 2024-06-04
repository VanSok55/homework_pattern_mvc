package view;

import controller.UserController;
import model.User;

import java.util.Scanner;

public class View {
    private static final UserController userController
            = new UserController();
    public static void UI(){
        userController.getAllUsers().forEach(System.out::println);
        userController.addNewUser(new User(5, "Van","van123@gmail.com"));
        userController.getAllUsers().forEach(System.out::println);
        userController.deleteUser(5);
        userController.getAllUsers().forEach(System.out::println);
    }
}
