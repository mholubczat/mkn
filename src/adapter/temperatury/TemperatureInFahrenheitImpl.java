package adapter.temperatury;

public class TemperatureInFahrenheitImpl implements TemperatureInFahrenheit {

   Weather weather;

    public TemperatureInFahrenheitImpl(Weather weather) {
        this.weather = weather;
    }

    @Override
    public double getTemperature() {
        return convertToFahrenheit(weather.getTemperature());
    }
    private double convertToFahrenheit(double temperature){
        return temperature*9/5+32;
    }
}
