package baseProject;

public class Candidate {

    private String firstName;
    private String lastName;
    private int year;
    private String phoneNumber;
    private String profession;
    private String category;
    private int workExperience;

    public Candidate(String firstName, String lastName, int year, String phoneNumber, String profession, String category, int workExperience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.phoneNumber = phoneNumber;
        this.profession = profession;
        this.category = category;
        this.workExperience = workExperience;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }
}
