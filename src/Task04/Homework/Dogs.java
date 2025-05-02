package Task04.Homework;

import java.util.Objects;

public class Dogs {

    enum Breed{
    SPANIEL, PITBULL, PUG, BEAGLE, DALMATIAN, SPITZ;
    }
    private String name;
    private Enum breed;
    private int age;

    public Dogs(String name, Enum breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public Dogs() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return "'" + name +"', breed=" + breed +
                ", age=" + age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dogs dogs = (Dogs) o;
        return Objects.equals(name, dogs.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public Dogs oldestDog (Dogs dog1, Dogs dog2, Dogs dog3){
        int age1 = dog1.getAge();
        int age2 = dog2.getAge();
        int age3 = dog3.getAge();

        if (age1>age2&&age1>age3){
            return dog1;
        }
        if (age2>age1&&age2>age3){
            return dog2;
        }
        if (age3>age2&&age3>age1){
            return dog3;
        }
        return null;
    }

    public Dogs sameName(Dogs dog1, Dogs dog2, Dogs dog3){
        String breed1 = dog1.getName();
        String breed2 = dog2.getName();
        String breed3 = dog3.getName();
        if(breed1.equals(breed2)){
            System.out.println("The " + dog1 + " and " + dog2 + " have the same name");
        }
        if(breed1.equals(breed3)){
            System.out.println("The " + dog1 + " and " + dog3 + " have the same name");
        }
        if(breed2.equals(breed3)){
            System.out.println("The " + dog2 + " and " + dog3 + " have the same name");
        }
        return null;
    }

    public static void main(String[] args){

        Dogs dog = new Dogs();

        Dogs dog1 = new Dogs("Bady", Breed.PITBULL,6);
        Dogs dog2 = new Dogs ("Lusi", Breed.SPANIEL,4);
        Dogs dog3 = new Dogs ("Bady", Breed.SPANIEL,9);

        System.out.println(dog.sameName(dog1,dog2,dog3));
        System.out.println("The oldest dog is : " + dog.oldestDog(dog1,dog2,dog3));
    }
}
