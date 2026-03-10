import java.io.*;

public class GitPushExample {
    public static void main(String[] args) {
        try {
            String[] commands = {
                "git add .",
                "git commit -m \"update from java\"",
                "git push origin main"
            };

            for (String command : commands) {
                Process process = Runtime.getRuntime().exec(command);
                process.waitFor();
                System.out.println("Executed: " + command);
            }

            System.out.println("Code pushed to GitHub successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
