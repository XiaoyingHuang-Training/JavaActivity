package MonsterTreasureGame;

import java.util.Random;

public class Player {
    private String name;
    private int[] location;
    private int boundary;

    public Player(String name, int gridSize){
        this.name=name;
        this.location=generateRandomLocation(gridSize);
        this.boundary=gridSize;

    }

    public void movePlayer(String direction){
        int row=getLocation()[0];
        int column=getLocation()[1];
        switch (direction) {
            case "w":
                if(checkWithinBoundary(row-1, column)){
                    setLocation(row-1, column);
                }else{
                    outOfBoundaryMessage();
                }
                    break;
            case "s":
                if (checkWithinBoundary(row+1, column)) {
                    setLocation(row+1, column);
                }else{
                    outOfBoundaryMessage();
                }
                break;
            case "a":
                if(checkWithinBoundary(row, column-1)){
                    setLocation(row, column-1);
                }else{
                    outOfBoundaryMessage();
                }
                break;
            case "d":
                if (checkWithinBoundary(row, column+1)) {
                    setLocation(row, column+1);
                }else{
                    outOfBoundaryMessage();
                }
                break;
            default:
                System.out.println("Please move the player using w(up) s(down) a(left) d(right)");
                break;
        }
    }

    private boolean checkWithinBoundary(int row, int column){
        if ((row>=0&&row<boundary)&&(column>=0&&column<boundary)){
            return true;
        }else{
            return false;
        }
    }

    private int[] generateRandomLocation(int gridSize){
        Random random=new Random();
        int row=random.nextInt(gridSize);
        int column=random.nextInt(gridSize);
        return new int[]{row, column};
    }

    private void setLocation(int row, int column){
        this.location[0]=row;
        this.location[1]=column;
    }
    public int[] getLocation(){
        return location;
    }
    public String getName(){
        return name;
    }

    private static void outOfBoundaryMessage(){
        System.out.println("Invalid move: out of boundary");
    }
}
