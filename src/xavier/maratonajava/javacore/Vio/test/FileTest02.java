package xavier.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File dir = new File("pasta");;
        boolean isCreatedDirectory = dir.mkdir();
        System.out.println("Pasta created? " + isCreatedDirectory);

        File file = new File(dir, "file.txt");
        try {
            System.out.println("isFileCreated: "+file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        File fileRenamed = new File(dir ,"fileRenamed.txt");
        boolean isRenamed = file.renameTo(fileRenamed);
        System.out.println("File renamed? " + isRenamed);

        File dirRenamed = new File("pastaRenamed");
        boolean isPastaRenamed = dir.renameTo(dirRenamed);
        System.out.println("Pasta renamed? " + isPastaRenamed);
    }
}
