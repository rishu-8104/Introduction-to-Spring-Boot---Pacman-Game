package fi.sade23.spring.pacman;

public class Pacman implements GameConsole{
    @Override
    public void start(){
        System.out.println("Pacman Game Started");
    }
    @Override
    public void up(){
        System.out.println("Pacman UP");
    }
    @Override
    public void down(){
        System.out.println("Pacman DOWN");
    }

}
