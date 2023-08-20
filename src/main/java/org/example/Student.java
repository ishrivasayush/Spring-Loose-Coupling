package org.example;

public class Student {
    /*
    Hard Coding- creating the object by ourself
    MathCheat mathCheat=new MathCheat();
     */
    //Not a good practice
    private Cheat cheat;

    //Setter Injection
    public void setCheat(Cheat cheat) {
        this.cheat = cheat;
    }

    public void cheat()
    {
        cheat.cheat();
    }
}
