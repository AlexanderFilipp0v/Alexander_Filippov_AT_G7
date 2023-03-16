package homework.day10;

import homework.day7.playground.essence.Flyable;
import homework.day7.playground.essence.Matter;
import homework.day7.playground.essence.craft.Rideable;
import homework.day7.playground.essence.craft.Transportable;
import homework.day7.playground.essence.craft.air.Aircraft;
import homework.day7.playground.essence.craft.air.Copter;
import homework.day7.playground.essence.craft.air.Plane;
import homework.day7.playground.essence.craft.air.Rocket;
import homework.day7.playground.essence.craft.field.Car;
import homework.day7.playground.essence.craft.field.Moped;
import homework.day7.playground.essence.craft.field.Motorbike;
import homework.day7.playground.essence.craft.field.Vehicle;
import homework.day7.playground.essence.craft.hand.*;
import homework.day7.playground.essence.creatures.*;
import homework.day7.playground.essence.material.*;

public class GenericMethodsInGenericClassTwoParamsRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassTwoParams<String, String> GenericClassSS = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Integer> GenericClassSI = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Double> GenericClassSD = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Integer, Integer> GenericClassII = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Aircraft, Copter> xAircraftCopter = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Plane, Rocket> xPlaneRocket = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Car, Moped> xCarMoped = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Motorbike, Vehicle> xMotorbikeVehicle = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Bottle, Can> xBottleCan = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Container, Mug> xContainerMug = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Storable, Rideable> xStorableRideable = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Transportable, Animal> xTransportableAnimal = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Beetle, Carrot> xBeetleCarrot = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Chamomile, Crawlable> xChamomileCrawlable = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Crocodile, Flower> xCrocodileFlower = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Fly, Insect> xFlyInsect = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Maylily, Mosquito> xMaylilyMosquito = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Pigeon, Plant> xPigeonPlant = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Potato, Radish> xPotatoRadish = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Raven, Rose> xRavenRose = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Vegetable, Vertebrata> xVegetableVertebrata = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Diesel, Petrol> xDieselPetrol = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Pourable, Powerable> xPourablePowerable = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Water, Flyable> xWaterFlyable = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Matter, Pigeon> xMatterPigeon = new GenericMethodsInGenericClassTwoParams<>();

        String objectString = "Hello";
        Integer objectInteger = 5;
        Double objectDouble = 5.5;
        Aircraft objectAircraft = new Aircraft(1, "xAircraft") {
        };
        Copter objectCopter = new Copter(1, "xCopter");
        Plane objectPlane = new Plane(1, "xPlane");
        Rocket objectRocket = new Rocket(1, "xRocket");
        Car objectCar = new Car(1, "xCar");
        Moped objectMoped = new Moped(1, "xMoped");
        Motorbike objectMotorbike = new Motorbike(1, "xMotorbike");
        Vehicle objectVehicle = new Vehicle(1, "xVehicle") {
        };
        Bottle objectBottle = new Bottle(1, "xBottle");
        Can objectCan = new Can(1, "xCan");
        Container objectContainer = new Container(1, "xContainer") {
        };
        Mug objectMug = new Mug(1, "xMug");
        Storable objectStorable = new Storable() {
        };
        Rideable objectRideable = new Rideable() {
            @Override
            public void drive(String direction) {
            }
        };
        Transportable objectTransportable = new Transportable() {
            @Override
            public int move(int pointA, int pointB) {
                return 0;
            }
        };
        Animal objectAnimal = new Animal(1, "xAnimal") {
        };
        Beetle objectBeetle = new Beetle(1, "xBeetle");
        Carrot objectCarrot = new Carrot(1, "xCarrot");
        Chamomile objectChamomile = new Chamomile(1, "mxChamomile");
        Crawlable objectCrawlable = new Crawlable() {
            @Override
            public void crawl(String direction, int distance) {
            }
        };
        Crocodile objectCrocodile = new Crocodile(1, "xCrocodile");
        Flower objectFlower = new Flower(1, "xFlower") {
        };
        Fly objectFly = new Fly(1, "xFly");
        Insect objectInsect = new Insect(1, "xInsect") {
        };
        Maylily objectMaylily = new Maylily(1, "xMaylily");
        Mosquito objectMosquito = new Mosquito(1, "xMosquito");
        Pigeon objectPigeon = new Pigeon(1, "xPigeon");
        Plant objectPlant = new Plant(1, "xPlant") {
        };
        Potato objectPotato = new Potato(1, "xPotato");
        Radish objectRadish = new Radish(1, "xRadish");
        Raven objectRaven = new Raven(1, "xRaven");
        Rose objectRose = new Rose(1, "xRose");
        Vegetable objectVegetable = new Vegetable(1, "xVegetable") {
        };
        Vertebrata objectVertebrata = new Vertebrata(1, "xVertebrata") {
        };
        Diesel objectDiesel = new Diesel();
        Petrol objectPetrol = new Petrol();
        Pourable objectPourable = new Pourable() {
        };
        Powerable objectPowerable = new Powerable() {
        };
        Water objectWater = new Water();
        Flyable objectFlyable = new Flyable() {
            @Override
            public void fly(String direction) {
            }
        };
        Matter objectMatter = new Matter(1) {
        };

        System.out.println(GenericClassSS.genericMethodGenArgs(objectString));
        System.out.println(GenericClassSS.genericMethodGenArgs(objectString, objectString));
        GenericClassSS.genericMethodHalfGenArgs(objectString, objectString);
        GenericClassSS.genericMethodHalfGenArgs(objectString, objectString, objectString);

        System.out.println(GenericClassSI.genericMethodGenArgs(objectString));
        System.out.println(GenericClassSI.genericMethodGenArgs(objectString, objectInteger));
        GenericClassSI.genericMethodHalfGenArgs(objectString, objectString);
        GenericClassSI.genericMethodHalfGenArgs(objectString, objectInteger, objectString);

        System.out.println(GenericClassSD.genericMethodGenArgs(objectString));
        System.out.println(GenericClassSD.genericMethodGenArgs(objectString, objectDouble));
        GenericClassSD.genericMethodHalfGenArgs(objectString, objectString);
        GenericClassSD.genericMethodHalfGenArgs(objectString, objectDouble, objectString);

        System.out.println(GenericClassII.genericMethodGenArgs(objectInteger));
        System.out.println(GenericClassII.genericMethodGenArgs(objectInteger, objectInteger));
        GenericClassII.genericMethodHalfGenArgs(objectInteger, objectString);
        GenericClassII.genericMethodHalfGenArgs(objectInteger, objectInteger, objectString);

        System.out.println(xAircraftCopter.genericMethodGenArgs(objectAircraft));
        System.out.println(xAircraftCopter.genericMethodGenArgs(objectAircraft, objectCopter));
        xAircraftCopter.genericMethodHalfGenArgs(objectAircraft, objectString);
        xAircraftCopter.genericMethodHalfGenArgs(objectAircraft, objectCopter, objectString);

        System.out.println(xPlaneRocket.genericMethodGenArgs(objectPlane));
        System.out.println(xPlaneRocket.genericMethodGenArgs(objectPlane, objectRocket));
        xPlaneRocket.genericMethodHalfGenArgs(objectPlane, objectString);
        xPlaneRocket.genericMethodHalfGenArgs(objectPlane, objectRocket, objectString);

        System.out.println(xCarMoped.genericMethodGenArgs(objectCar));
        System.out.println(xCarMoped.genericMethodGenArgs(objectCar, objectMoped));
        xCarMoped.genericMethodHalfGenArgs(objectCar, objectString);
        xCarMoped.genericMethodHalfGenArgs(objectCar, objectMoped, objectString);

        System.out.println(xMotorbikeVehicle.genericMethodGenArgs(objectMotorbike));
        System.out.println(xMotorbikeVehicle.genericMethodGenArgs(objectMotorbike, objectVehicle));
        xMotorbikeVehicle.genericMethodHalfGenArgs(objectMotorbike, objectString);
        xMotorbikeVehicle.genericMethodHalfGenArgs(objectMotorbike, objectVehicle, objectString);

        System.out.println(xBottleCan.genericMethodGenArgs(objectBottle));
        System.out.println(xBottleCan.genericMethodGenArgs(objectBottle, objectCan));
        xBottleCan.genericMethodHalfGenArgs(objectBottle, objectString);
        xBottleCan.genericMethodHalfGenArgs(objectBottle, objectCan, objectString);

        System.out.println(xContainerMug.genericMethodGenArgs(objectContainer));
        System.out.println(xContainerMug.genericMethodGenArgs(objectContainer, objectMug));
        xContainerMug.genericMethodHalfGenArgs(objectContainer, objectString);
        xContainerMug.genericMethodHalfGenArgs(objectContainer, objectMug, objectString);

        System.out.println(xStorableRideable.genericMethodGenArgs(objectStorable));
        System.out.println(xStorableRideable.genericMethodGenArgs(objectStorable, objectRideable));
        xStorableRideable.genericMethodHalfGenArgs(objectStorable, objectString);
        xStorableRideable.genericMethodHalfGenArgs(objectStorable, objectRideable, objectString);

        System.out.println(xTransportableAnimal.genericMethodGenArgs(objectTransportable));
        System.out.println(xTransportableAnimal.genericMethodGenArgs(objectTransportable, objectAnimal));
        xTransportableAnimal.genericMethodHalfGenArgs(objectTransportable, objectString);
        xTransportableAnimal.genericMethodHalfGenArgs(objectTransportable, objectAnimal, objectString);

        System.out.println(xBeetleCarrot.genericMethodGenArgs(objectBeetle));
        System.out.println(xBeetleCarrot.genericMethodGenArgs(objectBeetle, objectCarrot));
        xBeetleCarrot.genericMethodHalfGenArgs(objectBeetle, objectString);
        xBeetleCarrot.genericMethodHalfGenArgs(objectBeetle, objectCarrot, objectString);

        System.out.println(xChamomileCrawlable.genericMethodGenArgs(objectChamomile));
        System.out.println(xChamomileCrawlable.genericMethodGenArgs(objectChamomile, objectCrawlable));
        xChamomileCrawlable.genericMethodHalfGenArgs(objectChamomile, objectString);
        xChamomileCrawlable.genericMethodHalfGenArgs(objectChamomile, objectCrawlable, objectString);

        System.out.println(xCrocodileFlower.genericMethodGenArgs(objectCrocodile));
        System.out.println(xCrocodileFlower.genericMethodGenArgs(objectCrocodile, objectFlower));
        xCrocodileFlower.genericMethodHalfGenArgs(objectCrocodile, objectString);
        xCrocodileFlower.genericMethodHalfGenArgs(objectCrocodile, objectFlower, objectString);

        System.out.println(xFlyInsect.genericMethodGenArgs(objectFly));
        System.out.println(xFlyInsect.genericMethodGenArgs(objectFly, objectInsect));
        xFlyInsect.genericMethodHalfGenArgs(objectFly, objectString);
        xFlyInsect.genericMethodHalfGenArgs(objectFly, objectInsect, objectString);

        System.out.println(xMaylilyMosquito.genericMethodGenArgs(objectMaylily));
        System.out.println(xMaylilyMosquito.genericMethodGenArgs(objectMaylily, objectMosquito));
        xMaylilyMosquito.genericMethodHalfGenArgs(objectMaylily, objectString);
        xMaylilyMosquito.genericMethodHalfGenArgs(objectMaylily, objectMosquito, objectString);

        System.out.println(xPigeonPlant.genericMethodGenArgs(objectPigeon));
        System.out.println(xPigeonPlant.genericMethodGenArgs(objectPigeon, objectPlant));
        xPigeonPlant.genericMethodHalfGenArgs(objectPigeon, objectString);
        xPigeonPlant.genericMethodHalfGenArgs(objectPigeon, objectPlant, objectString);

        System.out.println(xPotatoRadish.genericMethodGenArgs(objectPotato));
        System.out.println(xPotatoRadish.genericMethodGenArgs(objectPotato, objectRadish));
        xPotatoRadish.genericMethodHalfGenArgs(objectPotato, objectString);
        xPotatoRadish.genericMethodHalfGenArgs(objectPotato, objectRadish, objectString);

        System.out.println(xRavenRose.genericMethodGenArgs(objectRaven));
        System.out.println(xRavenRose.genericMethodGenArgs(objectRaven, objectRose));
        xRavenRose.genericMethodHalfGenArgs(objectRaven, objectString);
        xRavenRose.genericMethodHalfGenArgs(objectRaven, objectRose, objectString);

        System.out.println(xVegetableVertebrata.genericMethodGenArgs(objectVegetable));
        System.out.println(xVegetableVertebrata.genericMethodGenArgs(objectVegetable, objectVertebrata));
        xVegetableVertebrata.genericMethodHalfGenArgs(objectVegetable, objectString);
        xVegetableVertebrata.genericMethodHalfGenArgs(objectVegetable, objectVertebrata, objectString);

        System.out.println(xDieselPetrol.genericMethodGenArgs(objectDiesel));
        System.out.println(xDieselPetrol.genericMethodGenArgs(objectDiesel, objectPetrol));
        xDieselPetrol.genericMethodHalfGenArgs(objectDiesel, objectString);
        xDieselPetrol.genericMethodHalfGenArgs(objectDiesel, objectPetrol, objectString);

        System.out.println(xPourablePowerable.genericMethodGenArgs(objectPourable));
        System.out.println(xPourablePowerable.genericMethodGenArgs(objectPourable, objectPowerable));
        xPourablePowerable.genericMethodHalfGenArgs(objectPourable, objectString);
        xPourablePowerable.genericMethodHalfGenArgs(objectPourable, objectPowerable, objectString);

        System.out.println(xWaterFlyable.genericMethodGenArgs(objectWater));
        System.out.println(xWaterFlyable.genericMethodGenArgs(objectWater, objectFlyable));
        xWaterFlyable.genericMethodHalfGenArgs(objectWater, objectString);
        xWaterFlyable.genericMethodHalfGenArgs(objectWater, objectFlyable, objectString);

        System.out.println(xMatterPigeon.genericMethodGenArgs(objectMatter));
        System.out.println(xMatterPigeon.genericMethodGenArgs(objectMatter, objectPigeon));
        xMatterPigeon.genericMethodHalfGenArgs(objectMatter, objectString);
        xMatterPigeon.genericMethodHalfGenArgs(objectMatter, objectPigeon, objectString);
    }
}


