package softserve.academy.homework4.Task4;

public class Task4 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Donald", Breed.GERMAN_SHEPHERD, 10);
        Dog dog2 = new Dog("Lord", Breed.POODLE, 4);
        Dog dog3 = new Dog("Donald", Breed.GERMAN_SHEPHERD, 1);

        Dog[] dogs = {dog1, dog2, dog3};

        boolean hasDuplicate = false;
        for (int i = 0; i < dogs.length - 1; i++) {
            for (int j = i + 1; j < dogs.length; j++) {
                if (dogs[i].getName().equals(dogs[j].getName())) {
                    hasDuplicate = true;
                    System.out.println(dogs[i].getName() + " - duplicate");
                    break;
                }
            }
        }

        Dog oldestDog = dogs[0];
        for (int i = 1; i < dogs.length; i++) {
            if (dogs[i].getAge() > oldestDog.getAge()) {
                oldestDog = dogs[i];
            }

        }
        System.out.println("The oldest dog is: " + oldestDog.getName() + ", breed: " + oldestDog.getBreed());

        if (hasDuplicate) {
            System.out.println("Some dogs have the same names");
        } else {
            System.out.println("All dogs have unique names");
        }
    }
}
