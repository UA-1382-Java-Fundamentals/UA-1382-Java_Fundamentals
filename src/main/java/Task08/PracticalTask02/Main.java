package Task08.PracticalTask02;

public class Main {

    public static void main (String[] args){

        Plant[] plants = new Plant[5];

        // Sample data (some valid, some invalid)
        String[][] data = {
                {"10", "green", "grass"},
                {"200", "dark_green", "tree"},       // Invalid size
                {"15", "orange", "shrub"},    // Invalid color
                {"30", "dark_green", "bush"},     // Invalid type
                {"50", "white_green", "tree"}        // Valid
        };

        for (int i = 0; i < data.length; i++) {
            try {
                int size = Integer.parseInt(data[i][0]);
                String color = data[i][1];
                String type = data[i][2];

                plants[i] = new Plant(size, color, type);
                System.out.println("Created: " + plants[i]);

            } catch (ColorException | TypeException | SizeException e) {
                System.out.println("Error creating plant " + (i + 1) + ": " + e.getMessage());
            } catch (NumberFormatException e){
                System.out.println("Error format of number" + e.getMessage());
            }
        }
    }
}
