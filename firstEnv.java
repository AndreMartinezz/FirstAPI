import io.github.cdimascio.dotenv.Dotenv;

public class firstEnv {

    public static void main {
        Dotenv dotenv = Dotenv.load();
        String myVariable = dotenv.get("API_SECRET");
        System.out.println("Value of API_SECRET: " + myVariable);
    }

}
