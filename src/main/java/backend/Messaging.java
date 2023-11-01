/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.File;

/**
 *
 * @author bandi
 */
public class Messaging {
    public static void createConversationFile(String userName) {
        // Define a directory to store conversation files (you can change the directory path)
        String directoryPath = "conversation_files/";

        // Create the directory if it doesn't exist
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        // Define the filename as the username
        String fileName = directoryPath + userName + ".txt";
 }
}
