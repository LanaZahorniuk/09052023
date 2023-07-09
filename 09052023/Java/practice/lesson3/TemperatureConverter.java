package practice.lesson3;

public class TemperatureConverter {

    public static void main(String[] args) {
        convertCelsius(20);
        convertCelsiusToFahrenheit(20);

    }
    public static double convertCelsius(int celsiusValue) {
        return celsiusValue + 273.15;
    }

    public static double convertCelsiusToFahrenheit(int celsiusValue) {
        return 1.8 * celsiusValue +32;
    }
}
