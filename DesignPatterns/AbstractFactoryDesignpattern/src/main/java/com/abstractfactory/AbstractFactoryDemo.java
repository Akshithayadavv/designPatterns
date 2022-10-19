package com.abstractfactory;

public class AbstractFactoryDemo {

    public static void main(String[] args){
    //get shape factory
    AbstractFactory shapeFactory= FactoryProducer.getFactory("SHAPE");
    //get an object of shape circle
    Shape shape1=shapeFactory.getShape("CIRCLE");
    //call draw method of shape circle
    shape1.draw();
    //get an object of shape rectangle
    Shape shape2=shapeFactory.getShape("RECTANGLE");
    shape2.draw();
    //get an object of shape Square
    Shape shape3=shapeFactory.getShape("SQUARE");
    shape3.draw();

    //get color factory
    AbstractFactory colorFactory=FactoryProducer.getFactory("COLOR");
    //get an object of color Red
    Color color1=colorFactory.getColor("RED");
    //call fill method for red
    color1.fill();
    //get an object of color Green
    Color color2=colorFactory.getColor("GREEN");
    //call fill method for red
    color2.fill();
    //get an object of color Blue
    Color color3=colorFactory.getColor("BLUE");
    //call fill method for red
    color3.fill();


}}
