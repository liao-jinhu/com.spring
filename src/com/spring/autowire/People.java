package src.com.spring.autowire;

public class People {
    private Cat cat;
    private Dog dog;
    private String people;
    public void People(){
        System.out.println("user:"+people);
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }
}
