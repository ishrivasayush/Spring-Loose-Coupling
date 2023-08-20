package org.example;

public class Student {
    /*
    Hard Coding- creating the object by ourself
    MathCheat mathCheat=new MathCheat();
     */
    private MathCheat mathCheat;
    private int id;


    public void setId(int id) {
        this.id = id;
    }

    //Setter Injection
    public void setMathCheat(MathCheat mathCheat)
    {
        this.mathCheat=mathCheat;
    }



    public Student(MathCheat mathCheat, int id) {
        this.mathCheat = mathCheat;
        this.id = id;
    }

    public Student() {
    }

    public void cheat()
    {
        System.out.println(id);
        mathCheat.cheatOfMath();
    }
}
