package fileio;

import com.google.gson.Gson;
import obj.Contact;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class ReadWrite {

    public static Path tryMakeFileDirectory(){
        String directory = "data";
        String filename = "contacts.json";

        // make the Path objects for the director and file
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        // because Files.createDirectories and Files.createFile can throw IOException,
        // we need to toss them into a try/catch block so it doesn't crash the program
        try{
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }

            if (! Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }
            return dataFile;
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        // oof - null check needed!
        return null;
    }

    public static void tryWriteFile(Path filePath, List<Contact> contactsToWrite) {
        try{
            String contactStr = new Gson().toJson(contactsToWrite);
            Files.write(filePath, Stream.of(contactStr).toList());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static List<Contact> tryReadFile(Path filePath){
        try {
            return Stream
                    .of(new Gson().fromJson(Files.readAllLines(filePath).get(0), Contact[].class))
                    .toList();
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static HashMap<String, Contact> contactsMapMaker(Path filePath) {
        HashMap<String, Contact> contactsMap = new HashMap<>();
        try{
            for (Contact contact : tryReadFile(filePath)){
                contactsMap.put(contact.getFirstName().toUpperCase() + " " + contact.getLastName().toUpperCase(), contact);
            }
            return contactsMap;
        } catch(NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

}
