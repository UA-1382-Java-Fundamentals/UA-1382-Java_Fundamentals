package hwfourth;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Mishel", 5, Breed.HUSKY);
        Dog dog2 = new Dog("Deby", 4, Breed.LABRADOR);
        Dog dog3 = new Dog("Deby", 1, Breed.MOPS);


        Dog oldest = dog1;
        if (dog2.getAge() > oldest.getAge())
            oldest = dog2;
        if (dog3.getAge() > oldest.getAge())
            oldest = dog3;
        System.out.println("The oldest dog is:");
        System.out.println("name: " + oldest.getName());
        System.out.println("breed: " + oldest.getBreed());


        boolean uniqueNames =
                  !dog1.getName().equals(dog2.getName()) &&
                  !dog1.getName().equals(dog3.getName()) &&
                  !dog2.getName().equals(dog3.getName());


        if (uniqueNames) {
            System.out.println("All dogs with unique names");
        } else {
            System.out.println("There are dogs with same names");
        }

    }
}
