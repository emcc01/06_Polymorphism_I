package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Instanziierung:
        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();

        pollObj(queen);
        pollObj(worker);
        pollObj(drone);

           }

    //neue Methode fürs zusammenfassen: 
   // Parameter obj von Typ Queen
   //geändert zu HoneyBee, weil es auch für worker und drone gelten soll
   //nennt sich Polymorphie
    private static void pollObj(HoneyBee obj) {
        output(obj.doYourJob());
        output(obj.fly());
    }

   
   
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

