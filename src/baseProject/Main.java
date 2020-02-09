package baseProject;


import fileReader.FileOperation;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        String fileLocation = "files/Candidates.xlsx";

        try {
            FileOperation.ReadeExcelPoi(fileLocation);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
