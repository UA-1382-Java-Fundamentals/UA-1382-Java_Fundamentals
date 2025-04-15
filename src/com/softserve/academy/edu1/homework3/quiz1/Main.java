import com.softserve.academy.edu1.homework3.quiz1.TemperatureConverter;

public class Main {
    public static void main(String[] args) {
        double fahrenheitTemperature = Double.parseDouble(args[0]);
        double celsiusTemperature = TemperatureConverter.fahrenheitToCelsius(fahrenheitTemperature);
        System.out.println("C: " + celsiusTemperature);
    }
}