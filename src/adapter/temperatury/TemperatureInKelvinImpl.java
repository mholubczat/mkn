package adapter.temperatury;

public class TemperatureInKelvinImpl implements TepmeratureInKelvin {

   Weather weather;

    public TemperatureInKelvinImpl(Weather weather) {
        this.weather = weather;
    }

    @Override
    public double getTemperature() {
        return convertToKelvin(weather.getTemperature());
    }
    private double convertToKelvin(double temperature){
        return temperature+273.15;
    }
}
