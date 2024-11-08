package MonsterTreasureGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
    public List<Monster> monsters;
    public List<Treasure> treasures;
    public Player player;
    public boolean isActive;
    
    public Game() {
        monsters = new ArrayList<>(); // Initialize the monsters list
        treasures = new ArrayList<>(); // Initialize the treasures list
        isActive=true;
    }

    public void placeMonsterAndTreasure(int monsterAmount, int treasureAmount,int gridSize){
        //Generate monsters and treasures
        while(monsters.size()<monsterAmount){
            Monster newMonster=new Monster(gridSize);
            if(isLocationOccupied(newMonster.getLocation())==0){
                monsters.add(newMonster);
            }
        }
        while (treasures.size()<treasureAmount) {
            Treasure newTreasure=new Treasure(gridSize);
            if(isLocationOccupied(newTreasure.getLocation())==0){
                treasures.add(newTreasure);
            }
        }
    }

    public int isLocationOccupied(int[] location){
        for(Monster monster: monsters){
            if (Arrays.equals(monster.getLocation(),location)) {
                return 400+monster.getTyepNo();
            }
        }
        for(Treasure treasure: treasures){
            if(Arrays.equals(treasure.getLocation(), location)){
                return 2;
            }
        }
        if(Arrays.equals(player.getLocation(), location)){
            return 3;
        }
        return 0;
    }

    public int minimumStepsFromTreasure(int[] location){
        int minSteps=20000;
        for(Treasure treasure:treasures){
            int vertical=Math.abs(treasure.getLocation()[1]-location[1]);
            int horizontal=Math.abs(treasure.getLocation()[0]-location[0]);
            if (vertical+horizontal<minSteps) {
                minSteps=vertical+horizontal;
            }
        }
        return minSteps;
    }

    public String MonsterGreetByTypeNo(int typeNo){
        switch (typeNo) {
            case 1:
                return "Pika Pika! Ready to spark some fun?";
            case 2:
                return "Eevee! Let's evolve our adventures together!";
            case 3:
                return  "Jigglypuff! Time for a sing-along!";
            case 4:
                return  "Snorlax! Zzz... Wake me up for a snack!";
            case 5:
                return "Bulbasaur! Let's grow together under the sun!";
            case 6:
                return "Charmander! Let's light up the day!";
            case 7:
                return  "Squirtle! Ready to make a splash?";
            case 8:
                return "Togepi! Let's hatch some happy times!";
            case 9:
                return "Piplup! Waddle we do today?";
            case 10:
                return  "Cyndaquil! Let's warm up our friendship!";
            default:
                return "Hello! Let's have some fun!";
        }
    }

}
