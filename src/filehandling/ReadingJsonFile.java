package filehandling;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;
/*
jackson-databind dependency is required to work with ObjectMapper class
jackson-core  dependency is required for low level parsing
jackson-annotations dependency is required for jackson annotations
 */
public class ReadingJsonFile {
    public static void main(String[] args) {

    }

    public void readingJsonFileasMap() throws IOException {
        ObjectMapper objectmapper = new ObjectMapper();

        Map<String, Object> data;

        data=  objectmapper.readValue(new File("src/testData/testdata.json"), Map.class);
        System.out.println("Name: " + data.get("name"));
        System.out.println("Version: " + data.get("version"));
        System.out.println("Skills: " + data.get("skils"));
    }

    public void readJsonFileasPOJO() throws IOException {
        ObjectMapper objectmapper = new ObjectMapper();

       Student student;

        student=  objectmapper.readValue(new File("src/testData/testdata.json"), Student.class);
        System.out.println("Name: " + student.getName());
        System.out.println("Version: " + student.getVersion());
        System.out.println("Skills: " + student.getSkils());
        System.out.println("First Skill: " + student.getSkils().get(0));
    }
}
