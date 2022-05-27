package Common;

import java.io.Serializable;

public class Mensaje implements Serializable {
    int posX;

    public Mensaje(int x){
        posX = x;
    }

    public String toString(){
        return "Pos X = " + posX; 
    }
}
