package Task06.Practical02;

public class Main {

    public static void main (String[] args){

        Cars car1 = new Sedan("Audi",260,2008,"diesel",true);
        Cars car2 = new Sedan("Seat",200,2012,"gas",false);
        Cars car3 = new Truck("Tatra",160,2010,16.5,false);
        Cars car4 = new Truck("Iveco",150,2014,24.5,true);
        
        Cars[] carsList = {car1,car2,car3,car4};

        for (int i = 0; i <= carsList.length-1; i++){
            System.out.println(carsList[i].toString());
        }
    }
}
