package com.example.kitty.hacktj;

/**
 * Created by Kitty on 16/05/2015.
 */
public class Backpack {

    private int spaces;
    public Backpack()
    {
        spaces=9;
    }
public void decrement() {
    spaces--;
}
    public void increment() {
        spaces++;
    }
    public int getSpace() {
        return spaces;
    }
public boolean isFull()
{
    if (spaces==9)
        return true;
    return false;
}

}
