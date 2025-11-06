package filehandling;

import java.util.List;

public class Student {

    private String name;
    private String version;
    private List<String> skils;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<String> getSkils() {
        return skils;
    }

    public void setSkils(List<String> skils) {
        this.skils = skils;
    }


}
