/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shaniamaeucag
 */
public class NewsAgency {
    private List<Observer> subscribers = new ArrayList<>();
    
    public void subscribe(Observer observer){
        subscribers.add(observer);
    }
    
    public void unsubscribe(Observer observer){
        subscribers.remove(observer);
    }
    
    public void notifySubscribers(String news){
        for(Observer subscriber : subscribers){
            subscriber.update(news);
        }
    }
    
    public void publishNews(String news){
        System.out.println("News Agency: Breaking News Published - " + news);
        notifySubscribers(news);
    }
}
