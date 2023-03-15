package homework.day10;

import classwork.day10.GenericContainer;
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


public class GenericMethodsInGenericClassTRunner {
    public static void main(String[] args) {

        GenericMethodsInGenericClassT<String> genericClassTS = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Integer> genericClassTI = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Double> genericClassTD = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Aircraft> xAircraft = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Copter> xCopter = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Plane> xPlane = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rocket> xRocket = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Car> xCar = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Moped> xMoped = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Motorbike> xMotorbike = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Vehicle> xVehicle = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Bottle> xBottle = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Can> xCan = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Container> xContainer = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mug> xMug = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Storable> xStorable = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rideable> xRideable = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Transportable> xTransportable = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Animal> xAnimal = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Beetle> xBeetle = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Carrot> xCarrot = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Chamomile> xChamomile = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Crawlable> xCrawlable = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Crocodile> xCrocodile = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Flower> xFlower = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Fly> xFly = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Insect> xInsect = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Maylily> xMaylily = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mosquito> xMosquito = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Pigeon> xPigeon = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Plant> xPlant = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Potato> xPotato = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Radish> xRadish = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Raven> xRaven = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rose> xRose = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Vegetable> xVegetable = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Vertebrata> xVertebrata = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Diesel> xDiesel = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Petrol> xPetrol = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Pourable> xPourable = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Powerable> xPowerable = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Water> xWater = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Flyable> xFlyable = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Matter> xMatter = new GenericMethodsInGenericClassT<>();

        Aircraft objectAircraft = new Aircraft(1, "xAircraft") {
        };
        Copter ojectCopter = new Copter(1, "xCopter");
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

        genericClassTS.genericMethodOneGenArg("genericClassTS");
        System.out.println(genericClassTS.genericMethodTwoGenArgs("genericClassTS", "genericClassTS"));
        genericClassTS.genericMethodHalfGenArgs("genericClassTS", "genericClassTS");
        genericClassTI.genericMethodOneGenArg(5);
        System.out.println(genericClassTI.genericMethodTwoGenArgs(5, 5));
        genericClassTI.genericMethodHalfGenArgs(5, "genericClassTI");
        genericClassTD.genericMethodOneGenArg(5.5);
        System.out.println(genericClassTD.genericMethodTwoGenArgs(5.5, 5.5));
        genericClassTD.genericMethodHalfGenArgs(5.5, "genericClassTD");
        xAircraft.genericMethodOneGenArg(objectAircraft);
        System.out.println(xAircraft.genericMethodTwoGenArgs(objectAircraft, objectAircraft));
        xAircraft.genericMethodHalfGenArgs(objectAircraft, "xAircraft");
        xCopter.genericMethodOneGenArg(ojectCopter);
        System.out.println(xCopter.genericMethodTwoGenArgs(ojectCopter, ojectCopter));
        xCopter.genericMethodHalfGenArgs(ojectCopter, "xCopter");
        xPlane.genericMethodOneGenArg(objectPlane);
        System.out.println(xPlane.genericMethodTwoGenArgs(objectPlane, objectPlane));
        xPlane.genericMethodHalfGenArgs(objectPlane, "xPlane");
        xRocket.genericMethodOneGenArg(objectRocket);
        System.out.println(xRocket.genericMethodTwoGenArgs(objectRocket, objectRocket));
        xRocket.genericMethodHalfGenArgs(objectRocket, "xRocket");
        xCar.genericMethodOneGenArg(objectCar);
        System.out.println(xCar.genericMethodTwoGenArgs(objectCar, objectCar));
        xCar.genericMethodHalfGenArgs(objectCar, "xCar");
        xMoped.genericMethodOneGenArg(objectMoped);
        System.out.println(xMoped.genericMethodTwoGenArgs(objectMoped, objectMoped));
        xMoped.genericMethodHalfGenArgs(objectMoped, "xMoped");
        xMotorbike.genericMethodOneGenArg(objectMotorbike);
        System.out.println(xMotorbike.genericMethodTwoGenArgs(objectMotorbike, objectMotorbike));
        xMotorbike.genericMethodHalfGenArgs(objectMotorbike, "xMotorbike");
        xVehicle.genericMethodOneGenArg(objectVehicle);
        System.out.println(xVehicle.genericMethodTwoGenArgs(objectVehicle, objectVehicle));
        xVehicle.genericMethodHalfGenArgs(objectVehicle, "xVehicle");
        xBottle.genericMethodOneGenArg(objectBottle);
        System.out.println(xBottle.genericMethodTwoGenArgs(objectBottle, objectBottle));
        xBottle.genericMethodHalfGenArgs(objectBottle, "xBottle");
        xCan.genericMethodOneGenArg(objectCan);
        System.out.println(xCan.genericMethodTwoGenArgs(objectCan, objectCan));
        xCan.genericMethodHalfGenArgs(objectCan, "xCan");
        xContainer.genericMethodOneGenArg(objectContainer);
        System.out.println(xContainer.genericMethodTwoGenArgs(objectContainer, objectContainer));
        xContainer.genericMethodHalfGenArgs(objectContainer, "xContainer");
        xMug.genericMethodOneGenArg(objectMug);
        System.out.println(xMug.genericMethodTwoGenArgs(objectMug, objectMug));
        xMug.genericMethodHalfGenArgs(objectMug, "xMug");
        xStorable.genericMethodOneGenArg(objectStorable);
        System.out.println(xStorable.genericMethodTwoGenArgs(objectStorable, objectStorable));
        xStorable.genericMethodHalfGenArgs(objectStorable, "xStorable");
        xRideable.genericMethodOneGenArg(objectRideable);
        System.out.println(xRideable.genericMethodTwoGenArgs(objectRideable, objectRideable));
        xRideable.genericMethodHalfGenArgs(objectRideable, "xRideable");
        xTransportable.genericMethodOneGenArg(objectTransportable);
        System.out.println(xTransportable.genericMethodTwoGenArgs(objectTransportable, objectTransportable));
        xTransportable.genericMethodHalfGenArgs(objectTransportable, "xTransportable");
        xAnimal.genericMethodOneGenArg(objectAnimal);
        System.out.println(xAnimal.genericMethodTwoGenArgs(objectAnimal, objectAnimal));
        xAnimal.genericMethodHalfGenArgs(objectAnimal, "xAnimal");
        xBeetle.genericMethodOneGenArg(objectBeetle);
        System.out.println(xBeetle.genericMethodTwoGenArgs(objectBeetle, objectBeetle));
        xBeetle.genericMethodHalfGenArgs(objectBeetle, "xBeetle");
        xCarrot.genericMethodOneGenArg(objectCarrot);
        System.out.println(xCarrot.genericMethodTwoGenArgs(objectCarrot, objectCarrot));
        xCarrot.genericMethodHalfGenArgs(objectCarrot, "xCarrot");
        xChamomile.genericMethodOneGenArg(objectChamomile);
        System.out.println(xChamomile.genericMethodTwoGenArgs(objectChamomile, objectChamomile));
        xChamomile.genericMethodHalfGenArgs(objectChamomile, "xChamomile");
        xCrawlable.genericMethodOneGenArg(objectCrawlable);
        System.out.println(xCrawlable.genericMethodTwoGenArgs(objectCrawlable, objectCrawlable));
        xCrawlable.genericMethodHalfGenArgs(objectCrawlable, "xCrawlable");
        xCrocodile.genericMethodOneGenArg(objectCrocodile);
        System.out.println(xCrocodile.genericMethodTwoGenArgs(objectCrocodile, objectCrocodile));
        xCrocodile.genericMethodHalfGenArgs(objectCrocodile, "xCrocodile");
        xFlower.genericMethodOneGenArg(objectFlower);
        System.out.println(xFlower.genericMethodTwoGenArgs(objectFlower, objectFlower));
        xFlower.genericMethodHalfGenArgs(objectFlower, "xFlower");
        xFly.genericMethodOneGenArg(objectFly);
        System.out.println(xFly.genericMethodTwoGenArgs(objectFly, objectFly));
        xFly.genericMethodHalfGenArgs(objectFly, "xFly");
        xInsect.genericMethodOneGenArg(objectInsect);
        System.out.println(xInsect.genericMethodTwoGenArgs(objectInsect, objectInsect));
        xInsect.genericMethodHalfGenArgs(objectInsect, "xInsect");
        xMaylily.genericMethodOneGenArg(objectMaylily);
        System.out.println(xMaylily.genericMethodTwoGenArgs(objectMaylily, objectMaylily));
        xMaylily.genericMethodHalfGenArgs(objectMaylily, "xMaylily");
        xMosquito.genericMethodOneGenArg(objectMosquito);
        System.out.println(xMosquito.genericMethodTwoGenArgs(objectMosquito, objectMosquito));
        xMosquito.genericMethodHalfGenArgs(objectMosquito, "xMosquito");
        xPigeon.genericMethodOneGenArg(objectPigeon);
        System.out.println(xPigeon.genericMethodTwoGenArgs(objectPigeon, objectPigeon));
        xPigeon.genericMethodHalfGenArgs(objectPigeon, "xPigeon");
        xPlant.genericMethodOneGenArg(objectPlant);
        System.out.println(xPlant.genericMethodTwoGenArgs(objectPlant, objectPlant));
        xPlant.genericMethodHalfGenArgs(objectPlant, "xPlant");
        xPotato.genericMethodOneGenArg(objectPotato);
        System.out.println(xPotato.genericMethodTwoGenArgs(objectPotato, objectPotato));
        xPotato.genericMethodHalfGenArgs(objectPotato, "xPotato");
        xRadish.genericMethodOneGenArg(objectRadish);
        System.out.println(xRadish.genericMethodTwoGenArgs(objectRadish, objectRadish));
        xRadish.genericMethodHalfGenArgs(objectRadish, "xRadish");
        xRaven.genericMethodOneGenArg(objectRaven);
        System.out.println(xRaven.genericMethodTwoGenArgs(objectRaven, objectRaven));
        xRaven.genericMethodHalfGenArgs(objectRaven, "xRaven");
        xRose.genericMethodOneGenArg(objectRose);
        System.out.println(xRose.genericMethodTwoGenArgs(objectRose, objectRose));
        xRose.genericMethodHalfGenArgs(objectRose, "xRose");
        xVegetable.genericMethodOneGenArg(objectVegetable);
        System.out.println(xVegetable.genericMethodTwoGenArgs(objectVegetable, objectVegetable));
        xVegetable.genericMethodHalfGenArgs(objectVegetable, "xVegetable");
        xVertebrata.genericMethodOneGenArg(objectVertebrata);
        System.out.println(xVertebrata.genericMethodTwoGenArgs(objectVertebrata, objectVertebrata));
        xVertebrata.genericMethodHalfGenArgs(objectVertebrata, "xVertebrata");
        xDiesel.genericMethodOneGenArg(objectDiesel);
        System.out.println(xDiesel.genericMethodTwoGenArgs(objectDiesel, objectDiesel));
        xDiesel.genericMethodHalfGenArgs(objectDiesel, "xDiesel");
        xPetrol.genericMethodOneGenArg(objectPetrol);
        System.out.println(xPetrol.genericMethodTwoGenArgs(objectPetrol, objectPetrol));
        xPetrol.genericMethodHalfGenArgs(objectPetrol, "xPetrol");
        xPourable.genericMethodOneGenArg(objectPourable);
        System.out.println(xPourable.genericMethodTwoGenArgs(objectPourable, objectPourable));
        xPourable.genericMethodHalfGenArgs(objectPourable, "xPourable");
        xPowerable.genericMethodOneGenArg(objectPowerable);
        System.out.println(xPowerable.genericMethodTwoGenArgs(objectPowerable, objectPowerable));
        xPowerable.genericMethodHalfGenArgs(objectPowerable, "xPowerable");
        xWater.genericMethodOneGenArg(objectWater);
        System.out.println(xWater.genericMethodTwoGenArgs(objectWater, objectWater));
        xWater.genericMethodHalfGenArgs(objectWater, "xWater");
        xFlyable.genericMethodOneGenArg(objectFlyable);
        System.out.println(xFlyable.genericMethodTwoGenArgs(objectFlyable, objectFlyable));
        xFlyable.genericMethodHalfGenArgs(objectFlyable, "xFlyable");
        xMatter.genericMethodOneGenArg(objectMatter);
        System.out.println(xMatter.genericMethodTwoGenArgs(objectMatter, objectMatter));
        xMatter.genericMethodHalfGenArgs(objectMatter, "xMatter");
    }

}

