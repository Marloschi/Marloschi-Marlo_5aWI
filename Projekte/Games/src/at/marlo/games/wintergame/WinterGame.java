package at.marlo.games.wintergame;


import at.marlo.games.wintergame.CircleActor;
import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class WinterGame extends BasicGame {
    private CircleActor ca1;
    private RectangleActor re1;
    private OvalActor ov1;


    private float speed;
    public WinterGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.ca1 = new CircleActor(100,100, 3);
        this.re1 = new RectangleActor(100,100,5);
        this.ov1 = new OvalActor(100,100,5);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.ca1.update(gameContainer, delta);
        this.re1.update(gameContainer,delta);
        this.ov1.update(gameContainer,delta);

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        this.ca1.render(graphics);
        this.re1.render(graphics);
        this.ov1.render(graphics);

    }

    public static void main(String[] argv) {


        try {
            AppGameContainer container = new AppGameContainer(new WinterGame("Winter Game"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
