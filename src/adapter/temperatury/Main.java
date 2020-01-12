package adapter.temperatury;

public class Main {
    public static void main(String[] args){
        Weather weather = new Weather();
        System.out.println("Temperatura w Celsjuszach "+weather.getTemperature());

        TemperatureInFahrenheitImpl temperatureInFahrenheit = new TemperatureInFahrenheitImpl(weather);
        System.out.println("Temperatura w Fahrenheitach "+temperatureInFahrenheit.getTemperature());

        TepmeratureInKelvin tepmeratureInKelvin = new TemperatureInKelvinImpl(weather);
        System.out.println("Temperatura w Kelvinach "+tepmeratureInKelvin.getTemperature());
    }
}
