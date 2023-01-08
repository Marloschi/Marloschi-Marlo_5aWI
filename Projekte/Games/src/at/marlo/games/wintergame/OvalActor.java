package at.marlo.games.wintergame;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class OvalActor {
    private float x,y;
    private boolean OvalRight = true;
    private boolean OvalLeft = false;
    private float speed;

    public OvalActor(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void update(GameContainer gameContainer, int delta){
        if(this.OvalRight == true){
            if(this.x >= 600){
                this.OvalRight= false;
                this.OvalLeft= true;
            }
            this.x += (float) delta / this.speed;
        }

        if(this.OvalLeft == true){
            if(this.x <= 100){
                this.OvalLeft = false;
                this.OvalRight = true;
            }
            this.x -= (float) delta / this.speed;
        }

    }
    public void render(Graphics graphics){
        graphics.drawOval(this.x, this.y,200,50);
    }
}


