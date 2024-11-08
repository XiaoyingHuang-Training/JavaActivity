package MonsterTreasureGame;

import java.util.Random;

public class Monster{
    private String type;
    private String greeting;
    private int[] location;
    private int typeNo;
    private static final String[] MONSTER_TYPES={
        "Pikachu",
        "Eevee",
        "Jigglypuff",
        "Snorlax",
        "Bulbasaur",
        "Charmander",
        "Squirtle",
        "Togepi",
        "Piplup",
        "Cyndaquil"
        };

    public Monster(int gridSize){
        this.type=generateRandomMonster();
        this.greeting=generateGreeting(this.type);
        this.location=generateRandomLocation(gridSize);
        this.typeNo=assignTypeNo(this.type);
    }

    private String generateRandomMonster(){
        Random random = new Random();
        String monster=MONSTER_TYPES[random.nextInt(MONSTER_TYPES.length)];
        return monster;
    }

    private String generateGreeting(String type){
        switch (type) {
            case "Pikachu":
                return "Pika Pika! Ready to spark some fun?";
            case "Eevee":
                return "Eevee! Let's evolve our adventures together!";
            case "Jigglypuff":
                return  "Jigglypuff! Time for a sing-along!";
            case "Snorlax":
                return  "Snorlax! Zzz... Wake me up for a snack!";
            case "Bulbasaur":
                return "Bulbasaur! Let's grow together under the sun!";
            case "Charmander":
                return "Charmander! Let's light up the day!";
            case "Squirtle":
                return  "Squirtle! Ready to make a splash?";
            case "Togepi":
                return "Togepi! Let's hatch some happy times!";
            case "Piplup":
                return "Piplup! Waddle we do today?";
            case "Cyndaquil":
                return  "Cyndaquil! Let's warm up our friendship!";
            default:
                return "Hello! Let's have some fun!";
        }
    }

    private int assignTypeNo(String type){
        switch (type) {
            case "Pikachu":
                return 1;
            case "Eevee":
                return 2;
            case "Jigglypuff":
                return 3;
            case "Snorlax":
                return 4;
            case "Bulbasaur":
                return 5;
            case "Charmander":
                return 6;
            case "Squirtle":
                return 7;
            case "Togepi":
                return 8;
            case "Piplup":
                return 9;
            case "Cyndaquil":
                return 10;
            default:
                return 0;
        }
    }

    private int[] generateRandomLocation(int gridSize){
        Random random=new Random();
        int row=random.nextInt(gridSize);
        int column=random.nextInt(gridSize);
        return new int[]{row, column};
    }

    public void greet(){
        System.out.println(greeting);
    }

    
    public String getMonsterType(){
        return type;
    }
    public int[] getLocation(){
        return location;
    }

    public String getInfo(){
        return "I'm a "+this.getMonsterType()+", I'm at Row "+this.getLocation()[0]+", Column "+this.getLocation()[1];
    }

    public int getTyepNo(){
        return typeNo;
    }
}