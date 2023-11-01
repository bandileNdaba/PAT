/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author bandi
 */
public class civilianBackEnd {

    public static void register(String username, String password) {
        File U = new File("username.txt");
        try {
            try (PrintWriter pw = new PrintWriter(new FileWriter("username.txt", true))) {
                pw.println(username + "#" + password + "#");
            }
        } catch (IOException ex) {
            System.out.println("Could not write to file");
        }
    }

    public static boolean aboutme(String name, String surname, String id) {
        File A = new File("aboutMe.txt");
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("aboutMe.txt", true));
            pw.println();
            return true ; 

        } catch (IOException ex) {
            System.out.println("could not wtite to file");
            return false;
        }
    }

    public static boolean Login(String UsernameIn, String PasswordIn) {
        try {
            File usersFile = new File("username.txt");
            Scanner filesc = new Scanner(usersFile);
            while (filesc.hasNextLine()) {
                String line = filesc.nextLine();
                Scanner linesc = new Scanner(line).useDelimiter("#");

                //get tokens
                String username = linesc.next();
                String password = linesc.next();

                //do stuff with tokens
                if (username.equals(UsernameIn) && (password.equals(PasswordIn))) {
                    return true;

                }

            }

        } catch (IOException ex) {
            System.out.println("Error: user not found ");

        }
        return false;

    }
}
