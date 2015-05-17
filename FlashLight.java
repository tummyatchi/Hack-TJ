package com.example.kitty.hacktj;

/**
 * Created by Kitty on 16/05/2015.
 */
public class FlashLight {
    private int time;
    private int charge;
    public FlashLight()
    {
        time = 60;
        charge = 100;
    }
    public int getTime()
    {
        return time;
    }
    public void setTime(int newtime)
    {
        time = newtime;
    }
    public int getCharge()
    {
        return charge;
    }
    public void setCharge(int newcharge)
    {
        charge = newcharge;
    }
    public void decrement()
    {
        time=time-10;
        charge=charge-5;
    }
    public void increment()
    {
        time = time+5;
    }
    public boolean death() {
        if (time == 0) {
            return true;
        }
        else if(charge==0) {
            return true;

        }
        return false;
    }

}
