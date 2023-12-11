/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caooc_taxcalculator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danie
 */
public class Admin extends Users {
    
public void modifyOwnProfile() {
        // Modifying own profile details
       // setFirstName(newFirstName);
      //  setLastName(newLastName);
        
        // Any other attributes you want to modify
    }

    // Method to access a list of all other users in the system
    public List<Users> getAllUsers(List<Users> usersList) {
        List<Users> otherUsers = new ArrayList<>(usersList);
        otherUsers.remove(this); // Remove the manager from the list
        return otherUsers;
    }

    // Method to remove other users from the system
    public void removeUser(List<Users> usersList, Users userToRemove) {
        if (usersList.contains(userToRemove)) {
            usersList.remove(userToRemove);
            System.out.println(userToRemove.getFirstName() + " " + userToRemove.getLastName() + " removed from the system.");
        } else {
            System.out.println("User not found in the system.");
        }
    }

    // Method to review the operations performed by other users
    public void reviewUserOperations(Users user) {
        // Implement logic to review operations performed by a specific user
        // This could involve accessing logs, database entries, etc.
        // For example:
        // user.getOperationsPerformed();
        System.out.println("Reviewing operations performed by " + user.getFirstName() + " " + user.getLastName());
    }
        
    
}
