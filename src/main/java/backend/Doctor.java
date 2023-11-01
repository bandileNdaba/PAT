/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author bandi
 */
public class Doctor {
    public static boolean loginCode( String LoginCode){
        File C = new File("Logincode.tct");
        try {
            try (PrintWriter pw = new PrintWriter(new FileWriter("LoginCode",true))){
                pw.println(LoginCode);
                return true;
            }  
        } catch (IOException ex){
            System.out.println("Couldnt add login code");
        }
        return false;
        
        
    }
    public static boolean doctorAboutMe(String name, String surname,String qualification, String language) {
        File U = new File("doctorinfo.txt");
        try {
            try (PrintWriter pw = new PrintWriter(new FileWriter("doctorinfo.txt" ,true))) {
                pw.println(name + "#" + surname + "#" + qualification + "#" + language);
                return true ;
            }
        } catch (IOException ex) {
            System.out.println("Could not write to file");
            return false; 
        }
    }
    public static String[] getStudentsAsArray() {
		try {
			Scanner sc = new Scanner(new File(fileName));
			int numStudents = getNumStudents();
			String[] outputArr = new String[numStudents];
			int currentIndex = 0;
			while (sc.hasNextLine()) {
				outputArr[currentIndex] = sc.nextLine();
				currentIndex++;
			}
			sc.close();
			return outputArr;
		} catch (FileNotFoundException ex) {
			System.out.println("Students file not found");
			return null;
		}
	}

    public static String[] getdoctor() {
		try {
			Scanner sc = new Scanner(new File("doctorinfo.txt"));
			String[] doctor = getdoctor();
			int currentIndex = 0;
			while (sc.hasNextLine()) {
				getdoctor()[currentIndex] = sc.nextLine();
				currentIndex++;
			}
			sc.close();
			return getdoctor();
		} catch (FileNotFoundException ex) {
			System.out.println("Students file not found");
			return null;
		}
	}
      public static boolean doctorLogin(String PasswordIn) {
        try {
            File usersFile = new File("LoginCode.txt");
            Scanner filesc = new Scanner(usersFile);
            while (filesc.hasNextLine()) {
                String line = filesc.nextLine();
                Scanner linesc = new Scanner(line).useDelimiter("#");

                //get tokens
                String password = linesc.next();

                //do stuff with tokens
                if (password.equals(PasswordIn)) {
                    return true;

                }

            }

        } catch (IOException ex) {
            System.out.println("Error: user not found ");

        }
        return false;

    }
      

   
}
