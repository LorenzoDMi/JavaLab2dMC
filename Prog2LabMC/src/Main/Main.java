package Main;

import Data.Block;
import Data.Map;

import javax.print.attribute.standard.Finishings;
import java.util.Scanner;

public class Main {
    public static void initialize(Map mappa){
        System.out.print("Inserire numero di iterazioni: ");
        Scanner lettore = new Scanner(System.in);
        int numberIteration = lettore.nextInt();
        for (int k = numberIteration; k>0; k--){

            System.out.print("Inserire numero di riga: ");
            Scanner myObj = new Scanner(System.in);
            int row = myObj.nextInt();

            System.out.print("Inserire numero di colonna: ");
            int col = myObj.nextInt();

            if (row>mappa.x || col> mappa.y){
                System.out.println("Errore nell'inserimento");
                k++;
            }
            else{
                mappa.change_cell(row,col);
                mappa.display_on_out();
                System.out.println("---------------------------------");
            }
        }
    }
    public static void main(String[] args){
        //System.out.println("hello world");
        //Block alfa = new Block('a');
        //alfa.display();
        Map mappa = new Map();

        initialize(mappa);

        /*mappa.display_on_out();
        System.out.println("---------------------------------");
        mappa.change_cell(4,5);
        mappa.change_cell(1,1);
        mappa.change_cell(8,2);
        mappa.display_on_out();*/
    }


}


