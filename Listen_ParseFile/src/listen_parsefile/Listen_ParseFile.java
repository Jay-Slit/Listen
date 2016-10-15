/*
 * Author: Cameron Justice
 * Program Title: 
 * Program Summary:
 */
package listen_parsefile;

import java.io.*;

public class Listen_ParseFile {

    public static void parseFile(){
        File factsList = new File("/home/justice/Documents/Repos/WoW Addons/Listen/FactsList.txt");
        
        try{
            FileReader fileReader = new FileReader(factsList);
            
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            writeFile(bufferedReader);
        }
        catch(FileNotFoundException err){
            System.out.println("File Not Found: " + factsList.toString());
        }
    }
    
    public static void writeFile(BufferedReader bufferedReader){
        
        File formattedFactsList = new File("/home/justice/Documents/Repos/WoW Addons/Listen/FormattedFactsList.txt");
        String line = null;
        
        try{
            FileWriter fileWriter = new FileWriter(formattedFactsList);
            
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            while((line = bufferedReader.readLine()) != null){
                bufferedWriter.write("\"" + line + "\",\n");
            }
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        parseFile();
    }
    
}
