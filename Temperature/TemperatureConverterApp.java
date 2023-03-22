package com.homeworks.Temperature;
public class TemperatureConverterApp {
    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        UserInput ui = new UserInput();

        double tempCelsium = ui.userInput("Введите градусы по Цельсию: ");
        double tempFahr = temperatureConverter.converterFromCelsiumToFehrengeit(tempCelsium);
        double tempKelvin = temperatureConverter.converterFromCelsiumToCelvin(tempCelsium);

        System.out.println("В Фаренгейтах это составляет: " + tempFahr);
        System.out.println("В Кельвинах это составляет: " + tempKelvin);

    }
}

