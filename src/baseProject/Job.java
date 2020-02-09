package baseProject;

public class Job {
    private String companyName;
    private String profession;
    private String category;
    private double yearsOfExperience;

    public Job(String companyName, String profession, String category, double yearsOfExperience) {
        this.companyName = companyName;
        this.profession = profession;
        this.category = category;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public double getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(double yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }


}
