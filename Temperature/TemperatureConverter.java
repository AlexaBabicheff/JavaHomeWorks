package com.homeworks.Temperature;

public class TemperatureConverter {

    public double converterFromCelsiumToFehrengeit(double tempCelsium){
        double tempInFahr = tempCelsium * 1.8 +32;
        return tempInFahr;
    }

    public double converterFromCelsiumToCelvin(double tempCelsium){
        double tempInKelvin = tempCelsium + 273.15;
        return tempInKelvin;
    }


}
