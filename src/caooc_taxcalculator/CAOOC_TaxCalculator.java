/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caooc_taxcalculator;

import ioutils.IOUtils;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class CAOOC_TaxCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
             Scanner system = new Scanner(System.in);

                        System.out.println("\"WELCOME TO YOUR REVENUE TAX CALCULATION!\n" +
                "CHOOSE AN OPTION:\n" +
                "1: LOGIN\n" +
                "2: SIGN UP");


            int optionNum = system.nextInt();

                        switch (optionNum) {
                            case 1:
                                login();
                                break;
                            case 2:
                                if (!userExists()) {
                                    newUser();
                                } else {
                                    System.out.println("User already exists in the database. Please choose a different username.");
                                }   break;
                            default:
                                System.out.println("Error!.");
                                break;
                        }
                    }


                    public static boolean login() {
                        
                        //***********Aqui precisamos validar o Login, e verificar se esta correto username e password *****************

                        IOUtils newUserInput = new IOUtils();

                       // boolean usertype;
                        String username;
                        String password;

                        Scanner UserInput = new Scanner(System.in);
    //                    System.out.println("User Type: ADMIN / REGULAR USER ");
    //                    usertype = UserInput.nextBoolean();

                        username = newUserInput.getUserText("Username: ");
                        password = newUserInput.getUserText("Password: ");
                        

                        return true;

                    }
                    
                    public static boolean userExists() {
                        DatabaseReader_CA dbr = new DatabaseReader_CA();
                        IOUtils newUserInput = new IOUtils();

                        String username = newUserInput.getUserText("Type your a username: ");

                        ArrayList<Users> usersList = dbr.getAllUsers();
                        for (Users user : usersList) {
                            if (user.getUsername().equals(username)) {
                                return true; // User already exists
                            }
                        }
                        return false; // User not founded
                    }

                        public static void newUser() throws SQLException {

                        Scanner UserInput = new Scanner(System.in);

                        String firstName;
                        String lastName;
                        String email;
                        String PPSN;
                        double grossIncome;
                        double taxCredit;
    //                    String usertype;
                        String username;
                        String password;


                        System.out.println("First Name: ");
                        firstName = UserInput.nextLine();


                        System.out.println("Last Name: ");
                        lastName = UserInput.nextLine();

                        System.out.println("Email: ");
                        email = UserInput.nextLine();

                        System.out.println("PPSN: ");
                        PPSN = UserInput.nextLine();

                        System.out.println("grossIncome: ");
                        grossIncome = UserInput.nextDouble();
                        UserInput.nextLine();

                        System.out.println("Tax Credit: ");
                        taxCredit = UserInput.nextDouble();
                        UserInput.nextLine();

    //                    System.out.println("User Type: ADMIN / REGULAR USER ");
    //                    usertype = UserInput.nextLine();


                        System.out.println("New Username: ");
                        username = UserInput.nextLine();

                        System.out.println("Password: ");
                        password = UserInput.nextLine();

                        Admin newUser = new Admin (0, firstName, lastName, email, PPSN, grossIncome, taxCredit, 0, username, password);
                      
 
                    
                        addToDatabase(newUser);
                        
                        }



                        public static void addToDatabase(Users newUser) throws SQLException {
                        DatabaseWriter_CA dbw = new DatabaseWriter_CA();
                        boolean success = dbw.newUser(newUser);

                        if (success) {
                            System.out.println("Sucess - New user add.");
                        } else {
                            System.out.println("Error.");
                        }
                    }
                        }
    
    
