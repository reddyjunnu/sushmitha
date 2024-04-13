package programs;
	import java.io.*;  
	  
	public class AppendStringToFile {  
	  
	    // Method to append a string to a file  
	    public static void appendStrToFile(String fileName, String str) {  
	        try {  
	            // Create a BufferedWriter object with FileWriter to append to the file  
	            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));  
	              
	            // Write the string to the file and add a new line character  
	            writer.write(str);  
	            writer.newLine();  
	              
	            // Close the writer  
	            writer.close();  
	        }  
	        catch (IOException e) {  
	            // Catch any exceptions that occur and print the error message  
	            System.out.println("Exception occurred: " + e);  
	        }  
	    }  
	  
	    public static void main(String[] args) {  
	        String fileName = "Watcher.txt";  
	  
	        try {  
	            // Create a BufferedReader object with FileReader to read the file  
	            BufferedReader reader = new BufferedReader(new FileReader(fileName));  
	            String line;  
	  
	            // Print the existing content of the file  
	            System.out.println("Existing content of the file:");  
	            while ((line = reader.readLine()) != null) {  
	                System.out.println(line);  
	            }  
	            reader.close();  
	        }  
	        catch (IOException e) {  
	            // Catch any exceptions that occur and print the error message  
	            System.out.println("Exception occurred: " + e);  
	        }  
	  
	        // Append the new content to the file  
	        String str = "WELCOME";  
	        appendStrToFile(fileName, str);  
	  
	        // Print the modified content of the file  
	        try {  
	            // Create a BufferedReader object with FileReader to read the file again  
	            BufferedReader reader = new BufferedReader(new FileReader(fileName));  
	            String line;  
	  
	            // Print the existing and appended content of the file  
	            System.out.println("\nModified content of the file:");  
	            while ((line = reader.readLine()) != null) {  
	                System.out.println(line);  
	            }  
	            reader.close();  
	        }  
	        catch (IOException e) {  
	            // Catch any exceptions that occur and print the error message  
	            System.out.println("Exception occurred: " + e);  
	        }  
	    }  
	}  

