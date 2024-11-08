package MonsterTreasureGame;

import java.util.Random;

public class Treasure {
    private String name;
    private int[] location;
    public Treasure(int gridSize){
        this.name="Treasure";
        this.location=generateRandomLocation(gridSize);
    }

    private int[] generateRandomLocation(int gridSize){
        Random random=new Random();
        int row=random.nextInt(gridSize);
        int column=random.nextInt(gridSize);
        return new int[]{row, column};
    }

    public int[] getLocation(){
        return location;
    }
    public String getName(){
        return name;
    }

    public String getInfo(){
        return "I'm a treasure. I'm at Row "+this.getLocation()[0]+", Column "+this.getLocation()[1];
    }
}
