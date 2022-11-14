public class Human {

    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;

    public Human(String name, String town, int yearOfBirth, String jobTitle){
        this.name = name;
        if (this.name == null || this.name == ""){
            this.name = "Информация не указана";;
        }

        this.town = town;

        if (this.yearOfBirth <= 0){
            this.yearOfBirth = Math.abs(yearOfBirth);
        }

        this.jobTitle = jobTitle;
    }

    public String toString(){
        return  "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в "+ yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }

}
