package filehandling;

public class TestConfig {
    public static void main(String[] args) {
        System.out.println(ConfigReader.readConfig().getProperty("appurl"));
        System.out.println(ConfigReader.readConfig().getProperty("username"));
        System.out.println(ConfigReader.readConfig().getProperty("password"));
        System.out.println(ConfigReader.readConfig().getProperty("browser"));
        System.out.println(ConfigReader.readConfig().getProperty("timeout"));
    }
}
