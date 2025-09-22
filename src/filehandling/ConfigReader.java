package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static void main(String[] args) throws IOException {

    }

    public void readPropertyfile() throws IOException {
        File file = new File("E:\\JavaAug25Session\\LearnJava\\src\\testData\\config.properties");
        FileInputStream fis = new FileInputStream(file);
        Properties prop = new Properties();
        prop.load(fis);

        System.out.println(prop.getProperty("appurl"));
        System.out.println(prop.getProperty("username"));
        System.out.println(prop.getProperty("password"));
        System.out.println(prop.getProperty("browser"));
    }


    public static Properties readConfig() {
        String filepath = "src/testData/config.properties";
        File file = new File(System.getProperty("user.dir") + File.separator + filepath);
        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream(file);
            prop = new Properties();
            prop.load(fis);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

}
