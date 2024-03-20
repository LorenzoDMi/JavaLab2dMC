package Data;

import java.awt.*;

public class Block {
    char contenuto; //block ID (?)
    boolean falls_with_gravity; //it falls?
    boolean fall_through; //things fall through?


    //constructor 1
    Block(){
        contenuto = '.';
        falls_with_gravity=false;
        fall_through=true;
    }
    //constructor 2
    public Block(char cnt, boolean falls, boolean falling_through){
        contenuto=cnt;
        falls_with_gravity=falls;
        fall_through=falling_through;
    }
    //Display on console
    public void display(){
        System.out.println(contenuto);
    }
    public void setVariable(int x){
        this.variable=x;
    }

    public int getVariable{
        return variable;
    }
}
