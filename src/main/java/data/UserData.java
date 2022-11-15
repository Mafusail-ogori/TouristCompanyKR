//Receiver
package data;

import user.User;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static graphicsText.Graphics.*;

public class UserData {
    public List<User> getUserData() {
        return userData;
    }

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

    public void signUp() throws IOException {
        FileWriter record = new FileWriter("C:\\Users\\Danylo\\PP labs\\untitled\\src\\main\\resources\\signUpRecords.txt", true);
        System.out.println(signUpText);
        Scanner scanner = new Scanner(System.in);
        String nickName, userName, password;
        System.out.print("Enter nickname >> ");
        nickName = scanner.next();
        if (!findSameNickName(nickName)){
            record.append(nickName).append("\n");
            System.out.print("Enter your name >> ");
            userName = scanner.next();
            record.append(userName).append("\n");
            System.out.print("Enter password >> ");
            password = scanner.next();
            record.append(password).append("\n");
            userData.add(new User(nickName, userName, password));
        }
        else{
            System.out.println("This username is taken already!");
            signUp();
        }
        record.close();
    }
    public User findUser(String nickname, String password){
        for (var user : userData) {
            if (user.getNickName().equalsIgnoreCase(nickname) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

    public boolean accountExistsInFile(String userName) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\Danylo\\PP labs\\untitled\\src\\main\\resources\\signUpRecords.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNext()){
            if(scanner.nextLine().equalsIgnoreCase(userName)){
                return true;
            }
        }
        fileReader.close();
        return false;
    }

    public void deleteFromFile(String userName) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\Danylo\\PP labs\\untitled\\src\\main\\resources\\signUpRecords.txt");
        FileWriter fileWriter2 = new FileWriter("C:\\Users\\Danylo\\PP labs\\untitled\\src\\main\\resources\\signUpRecords.txt", true);
        List<String> recordings = new ArrayList<>();
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNext()){
            recordings.add(scanner.next());
        }
        FileWriter fileWriter = new FileWriter("C:\\Users\\Danylo\\PP labs\\untitled\\src\\main\\resources\\signUpRecords.txt");
        fileWriter.close();
        for (var i = 0; i < recordings.size(); i++) {
            if(recordings.get(i).equalsIgnoreCase(userName)){
                recordings.remove(i);
                recordings.remove(i);
                recordings.remove(i);
            }
        }
        for (var recording : recordings) {
            fileWriter2.append(recording).append("\n");
        }
        fileReader.close();
        fileWriter2.close();
    }


    public void deleteAccount() throws IOException {
        System.out.println(deleteAccountText);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user name of account you want to delete >> ");
        String nickname = scanner.next();
        if(findSameNickName(nickname) && accountExistsInFile(nickname)){
            System.out.print("Enter password >> ");
            String password = scanner.next();
            if (findPassword(password)){
                this.userData.remove(findUser(nickname, password));
                deleteFromFile(nickname);
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

    public void logIn() throws IOException {
        System.out.println(logInText);
        String nickName, password;
        var scanner = new Scanner(System.in);
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

    public void fileReading() throws IOException {
        FileReader getAccounts = new FileReader("C:\\Users\\Danylo\\PP labs\\untitled\\src\\main\\resources\\signUpRecords.txt");
        Scanner scanner = new Scanner(getAccounts);
        while(scanner.hasNext()){
            userData.add(new User(scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }
        getAccounts.close();
    }
}