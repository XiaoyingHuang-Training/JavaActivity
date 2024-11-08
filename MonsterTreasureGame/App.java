package MonsterTreasureGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //Choose grid size between 2-100
        int gridSize = 0;
        while (true) {
            System.out.println("Enter grid size between 2-100");
            gridSize = scanner.nextInt();

            if (gridSize >= 2 && gridSize <= 100) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a number between 2 and 100.");
            }
        }

        //Choose game level
        System.out.println("Select the level you prefer");
        System.out.println("---1. Easy---");
        System.out.println("--2. Medium--");
        System.out.println("---3. Hard---");
        int gameLevel=scanner.nextInt();

        //Enter player name
        scanner.nextLine();
        System.out.println("Now enter your name :)");
        String playerName=scanner.nextLine();
        
        int[] gamePara= GameUtil.setGameLevel(gameLevel,gridSize);
        
        Game game = new Game();
        game.player=new Player(playerName, gridSize);
        game.placeMonsterAndTreasure(gamePara[0], gamePara[1], gridSize);
        
        //Initial location shown to the player
        GameUtil.gameStartMessage(game);
        
        while (game.isActive) {
            String direction=scanner.nextLine();
            game.player.movePlayer(direction);
            
            if(game.isLocationOccupied(game.player.getLocation())>=400){
                GameUtil.collideWithMonster(game);
                game.isActive=false;
                scanner.close();
            }else if(game.isLocationOccupied(game.player.getLocation())==2){
                GameUtil.collideWithTreasure();
                game.isActive=false;
                scanner.close();
            }else {
                GameUtil.promptPlayerForNextMove(game);
            }
        }
    }
}
