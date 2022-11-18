package model.tamaEngine;

public class TamaChat extends Tamagotchi{


    final private int FACTOR=2;
    final private int ID=0;

    public TamaChat(){
        super();
    }

    @Override
    public int getFactor() {
        return FACTOR;
    }

    @Override
    public int getID() {
        return ID;
    }

    
}
