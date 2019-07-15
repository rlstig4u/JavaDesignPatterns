package com.designpatterns.java;

import com.designpattern.facade.BikeFacade;
import com.designpatterns.abstractfactory.AbstractBikeFactory;
import com.designpatterns.abstractfactory.BikeFrameInterface;
import com.designpatterns.abstractfactory.BikeSeatInterface;
import com.designpatterns.abstractfactory.RoadBikeFactory;
import com.designpatterns.adapater.UltraWheel;
import com.designpatterns.adapater.UltraWheelAdapter;
import com.designpatterns.base.*;
import com.designpatterns.behavioral.MountainBikeRange;
import com.designpatterns.behavioral.RoadBikeRange;
import com.designpatterns.builder.BikeBuilder;
import com.designpatterns.builder.BikeDirector;
import com.designpatterns.builder.RoadBikeBuilder;
import com.designpatterns.builder.RoadBikeDirector;
import com.designpatterns.decorator.CustomGripOption;
import com.designpatterns.decorator.GoldFrameOption;
import com.designpatterns.observer.Gearbox;
import com.designpatterns.observer.SpeedMonitor;
import com.designpatterns.observer.Speedometer;
import com.designpatterns.singleton.SerialNumberGenerator;
import com.designpatterns.visitor.WheelDiagnostics;
import com.designpatterns.visitor.WheelInventory;
import com.designpatterns.visitor.WheelVisitorInterface;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
            visitorExample();
           //observerExample2();
           //observerExample1();
          //iteratorExample2();
          //iteratorExample1();
           //facadeExample();
         // decoratorExample();
        //adapterExample();
        //singletonExample();
        //builderExample();
        //abstractFactoryExample();
	    } // end Main Method

    private static void visitorExample(){
        WheelInterface wheel = new WideWheel(24);
        wheel.acceptVisitor(new WheelDiagnostics());
        wheel.acceptVisitor(new WheelInventory());

    }

    private static void observerExample2() {
        com.designpatterns.observer2.Speedometer speed
                = new com.designpatterns.observer2.Speedometer();
        speed.addSpeedometerListner(new com.designpatterns.observer2.SpeedMonitor());
        speed.addSpeedometerListner(new com.designpatterns.observer2.Gearbox());

        speed.setCurrentSpeed(5);
        speed.setCurrentSpeed(10);
        speed.setCurrentSpeed(20);
        speed.setCurrentSpeed(30);
        speed.setCurrentSpeed(35);
    }




    private static void observerExample1() {
        SpeedMonitor monitor = new SpeedMonitor();
        Speedometer speed = new Speedometer();
        speed.addObserver(monitor);
        speed.addObserver(new Gearbox());

        speed.setCurrentSpeed(5);
        speed.setCurrentSpeed(10);
        speed.setCurrentSpeed(15);
        speed.setCurrentSpeed(20);
        speed.setCurrentSpeed(26);
        speed.setCurrentSpeed(33);

    }

    private static void iteratorExample2() {
        System.out.println("=== Our Mountain Bikes ===");
        MountainBikeRange bikeRange = new MountainBikeRange();

        for(BikeInterface bike : bikeRange.getRange()) {
            System.out.println(bike);
        }
    }

    private static void iteratorExample1(){
        System.out.println("=== Our Road Bikes===");
        RoadBikeRange bikeRange = new RoadBikeRange();
        printIterator(bikeRange.iterator());

    }

    private static void printIterator(Iterator iter) {
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    private static void facadeExample(){
        BikeFacade facade = new BikeFacade();
        facade.perpareForSale(new DownHill(new WideWheel(24)));

    }


    private static void decoratorExample() {
        BikeInterface myTourBike = new Touring(new NarrowWheel(24));
        System.out.println(myTourBike);

        myTourBike = new CustomGripOption(myTourBike);
        System.out.println(myTourBike);

        myTourBike = new GoldFrameOption(myTourBike);
        System.out.println(myTourBike);
    }


    private static void adapterExample() {
        UltraWheel ultraWheel = new UltraWheel(28);
        List<WheelInterface> wheels = new ArrayList<>();
        wheels.add(new NarrowWheel(24));
        wheels.add(new NarrowWheel(20));
        wheels.add(new WideWheel(24));
        wheels.add(new UltraWheelAdapter(ultraWheel));
        wheels.add(new UltraWheelAdapter(new UltraWheel(26)));

    for(WheelInterface wheel : wheels)  {
        System.out.println(wheel);
    }
    } //end method

    private static void singletonExample() {
        System.out.println("Generating Serial Numbers");
        SerialNumberGenerator generator = SerialNumberGenerator.getInstance();
        System.out.println("next serial = " + generator.getNextSerial());
        System.out.println("next serial = " + generator.getNextSerial());
        System.out.println("next serial = " + generator.getNextSerial());
        System.out.println("next serial = " + generator.getNextSerial());
    }
    private static void builderExample() {
        RoadBike bike = new Touring(new NarrowWheel(22));
        BikeBuilder builder = new RoadBikeBuilder(bike);
        BikeDirector director = new RoadBikeDirector();
        BikeInterface bikeInterface = director.build(builder);
        System.out.println(bikeInterface);

            }

private static void abstractFactoryExample() {
    AbstractBikeFactory factory = new RoadBikeFactory();
    BikeFrameInterface frame = factory.createFrame();
    BikeSeatInterface seat = factory.createSeat();

    System.out.println(frame.getFrameParts());
    System.out.println(seat.getSeatParts());

}// end method

} // end class
