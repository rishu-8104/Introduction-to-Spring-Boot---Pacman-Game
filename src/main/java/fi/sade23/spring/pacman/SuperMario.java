package fi.sade23.spring.pacman;

import org.springframework.stereotype.Component;

@Component
public class SuperMario implements GameConsole{
    public void start(){
        System.out.println("Super Mario Game Started");
    }
    public void up(){
        System.out.println("Super Mario UP");
    }
    public void down(){
        System.out.println("Super Mario DOWN");
    }
}
