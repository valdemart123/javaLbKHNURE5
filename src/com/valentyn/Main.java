package com.valentyn;

public class Main {

    public static void main(String[] args) {
	City cityNewYork = new City();
	cityNewYork.setCityName("New York");
	City.Avenue newYorkAve = cityNewYork.new Avenue();
	newYorkAve.setAveName("Avenue");
	City.Square newYorksqrt =  cityNewYork.new Square();
	newYorksqrt.setSqrName("sqr New York");
	City.Street newYorkStr = cityNewYork.new Street();
	newYorkStr.setStreetName("Str New York");
    System.out.println("Город: " + cityNewYork.getCityName()+ "\nПроспект: " +newYorkAve.getAveName() +"\nПлощадь: " +
            newYorksqrt.getSqrName() +"\nУлица: " + newYorkStr.getStreetName());
    }
}
