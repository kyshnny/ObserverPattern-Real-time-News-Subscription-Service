/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observerpattern;

/**
 *
 * @author shaniamaeucag
 */
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        
        Subscriber subscriber1 = new Subscriber("Almira");
        Subscriber subscriber2 = new Subscriber("James");
        Subscriber subscriber3 = new Subscriber("Diana");
        
        // Subscribing the subscribers to the news
        newsAgency.subscribe(subscriber1);
        newsAgency.subscribe(subscriber2);
        newsAgency.subscribe(subscriber3);
        
        // Publishing news update
        newsAgency.publishNews("Severe Tropical Storm Kristine (Trami) entered the Philippine Area of Responsibility (PAR) as a tropical depression!");
        
        System.out.println();
        
        // Unsubscribing Almira to the news
        newsAgency.unsubscribe(subscriber1);
        
        // Publishing new news update
        newsAgency.publishNews("Breaking: Cop intel officer slain in Cotabato City gun attack!");
    }
    
}
