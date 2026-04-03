package xavier.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        // Diferentes maneiras de acessar o path
        Path p1 = Paths.get("C:\\Users\\leona\\IdeaProjects\\maratona-java\\file.txt");
        Path p2 = Paths.get("C:\\Users\\leona\\IdeaProjects\\maratona-java", "file.txt");
        Path p3 = Paths.get("C", "Users\\leona\\IdeaProjects\\maratona-java", "file.txt");
        Path p4 = Paths.get("C", "Users","leona", "IdeaProjects", "maratona-java", "file.txt");

        System.out.println("Path: " + p1.getFileName());
        System.out.println("Path: " + p2.getFileName());
        System.out.println("Path: " + p3.getFileName());
        System.out.println("Path: " + p4.getFileName());
    }
}
