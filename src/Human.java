public class Human {

    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;

    public Human(String name, String town, int yearOfBirth, String jobTitle){
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setName(String name) {
        if (this.name != null || this.name != ""){
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (this.yearOfBirth <= 0){
            this.yearOfBirth = Math.abs(yearOfBirth);
        } else {
            this.yearOfBirth = 0;
        }
    }

    public void setTown(String town) {
        if (this.town != null || this.town != ""){
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
    }

    public void setJobTitle(String jobTitle) {
        if (this.jobTitle != null || this.jobTitle != ""){
            this.jobTitle = jobTitle;
        } else {
            this.jobTitle = "Сейчас нигде не работает";
        }
    }

    public String toString(){
        return  "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в "+ yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }

}
