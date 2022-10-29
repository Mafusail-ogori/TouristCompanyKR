//Receiver
package data;

import user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static graphicsText.Graphics.*;

public class UserData {
    protected List<User> userData = new ArrayList<>();

    public boolean findSameNickName(String nickName) {
        for (User user : userData) {
            if (user.getNickName().equalsIgnoreCase(nickName)) {
                return true;
            }
        }
        return false;
    }

    public boolean findPassword(String password){
        for (User user : userData){
            if(user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    public void signUp() {
        System.out.println(signUpText);
        Scanner scanner = new Scanner(System.in);
        String nickName, userName, password;
        System.out.print("Enter nickname >> ");
        nickName = scanner.next();
        if (!findSameNickName(nickName)){
            System.out.print("Enter your name >> ");
            userName = scanner.next();
            System.out.print("Enter password >> ");
            password = scanner.next();
            userData.add(new User(nickName, userName, password));
        }
        else{
            System.out.println("This username is taken already!");
            signUp();
        }
    }
    public User findUser(String nickname, String password){
        for (var user : userData) {
            if (user.getUserName().equalsIgnoreCase(nickname) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }


    public void deleteAccount() {
        System.out.println(deleteAccountText);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user name of account you want to delete >> ");
        String nickname = scanner.next();
        if(findSameNickName(nickname)){
            System.out.print("Enter password >> ");
            String password = scanner.next();
            if (findPassword(password)){
                this.userData.remove(findUser(nickname, password));
                System.out.println("Deleted successfully!");
            }
            else{
                System.out.println("Incorrect password");
            }
        }
        else{
            System.out.println("There is no such account in a storage!");
        }
    }

    public void logIn() {
        System.out.println(logInText);
        String nickName, password;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter nickname >> ");
        nickName = scanner.next();
        if(findSameNickName(nickName)){
            System.out.print("Enter password >> ");
            password = scanner.next();
            if(findPassword(password)){
                System.out.println("Logged in successfully!");
            }
            else{
                System.out.println("Incorrect password! try again!");
                logIn();
            }
        }
        else{
            System.out.println("Looks like you are not registered yet, sign up first!");
            signUp();
        }
    }
}

