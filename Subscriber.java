/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpattern;

/**
 *
 * @author shaniamaeucag
 */
public class Subscriber implements Observer {
    private String name;
    
    public Subscriber(String name){
        this.name = name;
    }
    
    @Override
    public void update(String news){
        System.out.println(name + " received the news: " + news);
    }
    
    public String getName(){
        return name;
    }
    
}
