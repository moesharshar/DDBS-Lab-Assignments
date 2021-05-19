public class JobDetails {
    private String title;
    private String company;
    private String location;
    private String type;
    private String level;
    private String yearsExp;
    private String country;
    private String skills;

    public JobDetails (String title, String company, String location,
     String type, String level, String yearsExp, String country, String skills) {
         this.title = title;
         this.company = company;
         this.location = location;
         this.type = type;
         this.level = level;
         this.yearsExp = yearsExp;
         this.country = country;
         this.skills = skills;
    }

    public void setYearsExp(String yearsExp) {
        this.yearsExp = yearsExp;
    }

    public String getYearsExp() {
        return yearsExp;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setCompany(String company) {
        this.company = company;
    }
    
    public String getCompany() {
        return company;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getLocation() {
        return location;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
        public String getCountry() {
            return country;
        }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getSkills() {
        return skills;
    }
}