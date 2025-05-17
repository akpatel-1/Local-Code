import java.util.*;
public class Introduction {
    public static void main(String[] args) {
        Pen elkos = new Pen();
        elkos.setName("elkos");
        elkos.setColor("blue");
        elkos.setTip(0.5f);
        elkos.display();
    }
}

class Pen{
    String name;
    String color;
    float tip;

    void setName(String name){
        this.name = name;
    }
    void setColor(String color){
        this.color = color;
    }

    void setTip(float tip){
        this.tip = tip;
    }

    void display(){
        System.out.println("Pen name: " + name + "\nPen color: " + color + "\nPen tip: " + tip);
    }
}