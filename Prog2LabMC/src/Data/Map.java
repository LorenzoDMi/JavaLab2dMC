package Data;

public class Map {
    public int x = 10; //height
    public int y = 10; //lenght
    Block[][] cellMatr = new Block[x][y];   //matrix
    //constructor
    public Map(){
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                cellMatr[i][j] = new Block();
            }
        }
    }
    //display on console
    public void display_on_out(){
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                System.out.print("["+cellMatr[i][j].contenuto+"] ");
            }
            System.out.println(" ");
        }
    }
    //value change
    public void change_cell(int x, int y){
        cellMatr[x][y].contenuto='A';
    }
}
