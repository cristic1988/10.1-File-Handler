package app;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    private final static String BASE_PATH = "E:/Java Pro/Homework/10.1 File-Handler/File-Handler/files/";

    public String writeFile(String fileName, String fileContent) {
        try(BufferedWriter buffWriter = new BufferedWriter (
                new FileWriter(BASE_PATH + fileName + ".txt"))) {
            buffWriter.write(fileContent);
            return "Success.";
        } catch (Exception e) {
            return "Something went wrong :(" + e.getMessage();
        }
    }

    public String readFile(String path) {
        try (FileReader reader = new FileReader(path)) {
            int sym;
            StringBuilder stringBuilder = new StringBuilder();
            while ((sym = reader.read()) != -1) {
                stringBuilder.append((char) sym);
            }
            return stringBuilder.toString();
        } catch (IOException ex) {
            return "Exception: " + ex.getMessage();
        }
    }
}
