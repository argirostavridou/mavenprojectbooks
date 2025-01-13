package com.example.demo.all;
import java.util.ArrayList;
import java.util.List;
public class UserServices {
	private List<User> users;  // Lista me tous users

    public void UserService() {
        this.users = new ArrayList<>();
    }

    // add new user to the list
    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user.getName());
    }

    // Find user based on the ID
    public User getUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    // User borrows book
    public void borrowBook(int userId, Book book) {
        User user = getUserById(userId);
        if (user != null) {
            user.borrowBook(book);
        } else {
            System.out.println("User not found!");
        }
    }

    // Return book from the user
    public void returnBook(int userId, Book book) {
        User user = getUserById(userId);
        if (user != null) {
            user.returnBook(book);
        } else {
            System.out.println("User not found!");
        }
    }

    // Print all users
    public void printUsers() {
        for (User user : users) {
            System.out.println(user.getName() + " has borrowed the following books: ");
            for (Book book : user.getBorrowedBooks()) {
                System.out.println("- " + book.getTitle());
            }
        }
    }
}
