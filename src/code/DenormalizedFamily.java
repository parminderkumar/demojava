package code;

public class DenormalizedFamily {
    String fatherName;

    String motherName;
    String childName;

    public DenormalizedFamily(String fatherName, String motherName, String childName) {
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.childName = childName;
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

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }
}
