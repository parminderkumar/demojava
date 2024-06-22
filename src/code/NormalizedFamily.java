package code;

import java.util.ArrayList;
import java.util.List;

public class NormalizedFamily {
    String fatherName;

    String motherName;
    List<Child> children = new ArrayList<>();

    public NormalizedFamily(String fatherName, String motherName, List<Child> children) {
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.children = children;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }
}
