package Task06.Practical02;

 abstract class Cars {
     protected String model;
     protected int maxSpeed;
     protected int yearOfProduction;

     public Cars(String model, int maxSpeed, int yearOfProduction) {
         this.model = model;
         this.maxSpeed = maxSpeed;
         this.yearOfProduction = yearOfProduction;
     }

     public Cars() {
     }

     public String getModel() {
         return model;
     }

     public int getMaxSpeed() {
         return maxSpeed;
     }

     public int getYearOfProduction() {
         return yearOfProduction;
     }

     public void run(){
         System.out.println("Brum-Brum");
     }

     public void stop(){
         System.out.println("STOP");
     }

 }

