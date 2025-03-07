package ejercicio7;

import java.util.List;
import java.util.ArrayList;

public class Ejercicio7 {
    
    public interface Enemy{
        void doAction();
    }
    
    public class GunEnemy implements Enemy{
        
        public void doActionShoot(){
            System.out.println("Disparando...");
        }
        
        @Override
        public void doAction(){
            doActionShoot();
        }
    }
    
    public class KnifeEnemy implements Enemy{
        
        public void doActionStab(){
            System.out.println("Apuñalando...");
        }
        
        @Override
        public void doAction(){
            doActionStab();
        }
    }
    
    public class Game{
        private List<Enemy> enemies;
        private boolean endGame = false;
        
        public void init(){
            enemies = new ArrayList<>();
            enemies.add(new KnifeEnemy());
            enemies.add(new GunEnemy());
        }
        
        public void run(){
            while(!endGame){
                for(Enemy enemy : enemies){
                    enemy.doAction();
                }
                endGame = true;
            }
        }
        
        public static void main(String[] args) {
            Game game = new Game();
            game.init();
            game.run();
        }
    }  
}
