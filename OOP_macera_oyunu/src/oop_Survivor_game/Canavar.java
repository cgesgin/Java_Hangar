 
package oop_Survivor_game;

import java.util.Random;

 
public class Canavar {
    
    private String name;
    private int hasar,loot,can,maxCanavar;

    public Canavar(String name, int hasar, int can,int loot,  int maxCanavar) {
        this.name = name;
        this.hasar = hasar;
        this.loot = loot;
        this.can = can;
        this.maxCanavar = maxCanavar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHasar() {
        return hasar;
    }

    public void setHasar(int hasar) {
        this.hasar = hasar;
    }

    public int getLoot() {
        return loot;
    }

    public void setLoot(int loot) {
        this.loot = loot;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }

    public int getMaxCanavar() {
        return maxCanavar;
    }

    public void setMaxCanavar(int maxCanavar) {
        this.maxCanavar = maxCanavar;
    }
    
    public int canavarSayisi()
    {
        Random rand=new Random();
        
        return rand.nextInt(this.maxCanavar+1);        
    }
    
    
}
