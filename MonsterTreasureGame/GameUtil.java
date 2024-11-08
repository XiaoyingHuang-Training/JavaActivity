package MonsterTreasureGame;

public class GameUtil {
    public static int[] setGameLevel(int gameLevel, int gridSize){
        int monsterAmount=0;
        int treasureAmount=0;
        switch (gameLevel) {
            case 1:
                monsterAmount=Math.max((int)Math.round(gridSize*gridSize*0.2),1);
                treasureAmount=Math.max((int)Math.round(gridSize*gridSize*0.1), 1);
                return new int[]{monsterAmount,treasureAmount};
            case 2:
                monsterAmount=Math.max((int)Math.round(gridSize*gridSize*0.3),1);
                treasureAmount=Math.max((int)Math.round(gridSize*gridSize*0.05), 1);
                return new int[]{monsterAmount,treasureAmount};
            case 3:
                monsterAmount=Math.max((int)Math.round(gridSize*gridSize*0.3),1);
                treasureAmount=1;
                return new int[]{monsterAmount,treasureAmount};
            default:
                System.out.println("Please enter your chosen game level between 1 and 3");
                return new int[]{monsterAmount,treasureAmount};
        }

    }

    public static void gameStartMessage(Game game){
        System.out.println(game.player.getName()+", You're now at Row "+(game.player.getLocation()[0]+1)+", Column "+(game.player.getLocation()[1]+1)+". Currently you are "+game.minimumStepsFromTreasure(game.player.getLocation())+" steps away from the nearest treasure.");
        
        System.out.println("Now move around using wasd: ");
        System.out.println("w-up");
        System.out.println("s-down");
        System.out.println("a-left");
        System.out.println("d-right");
    }

    public static void promptPlayerForNextMove(Game game){
        System.out.println(game.player.getName()+", You're now at Row "+(game.player.getLocation()[0]+1)+", Column "+(game.player.getLocation()[1]+1)+". Currently you are "+game.minimumStepsFromTreasure(game.player.getLocation())+" steps away from the nearest treasure. Continue your next move!");
    }

    public static void collideWithMonster(Game game){
        System.out.println("Oops!Someone is already there....You can hear a voice saying: ");
        System.out.println(game.MonsterGreetByTypeNo(game.isLocationOccupied(game.player.getLocation())-400));
        System.out.println("You got distracted by the cute pokemon you've found. Treasure hunt ends!");
        System.out.println("And you live with the pokemon happily ever after.");
    }

    public static void collideWithTreasure(){
        System.out.println("Something is inside this place...");
        System.out.println("And you noticed an unusual mark on the ground...");
        System.out.println("So you start digging...");
        System.out.println("Digging......");
        System.out.println("And more digging...");
        System.out.println("Until you found a giangantic chest with a complicated lock...");
        System.out.println("Which you easily removed with the shovel in your hand...so...");
        System.out.println("Congratulations! You got the treasure!");
        System.out.println("Enjoy being the richest person in the world!");
        System.out.println("And the pain of considering how to protect your wealth :)");
    }

}
