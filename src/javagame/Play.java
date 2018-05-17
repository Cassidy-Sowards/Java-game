/*
 * Play.java - the state where all the gaming takes place
 * @author Cassidy Sowards
 * @version 1.0
 */

package javagame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState {
	private MaxCharacter maxRide;
	private GameObject background;
	private Camera camera;
	private Eraser eraser;
	private Angel angel;

	//Constructor
	public Play(int state){
		
	}
	
	//method that initializes objects
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		background = new GameObject();
		background.setImage("Project5Bg.png");
		camera = new Camera();
		eraser = new Eraser(200,250);
		maxRide = new MaxCharacter(30,310);
		angel = new Angel(620,325);
		maxRide.setHeight(90);
		maxRide.setWidth(90);
		eraser.setWidth(150);
		eraser.setHeight(120);
		angel.setWidth(90);
		angel.setHeight(140);
		
	
		
		
	}
	
	//method that renders objects to the board
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		camera.setCameraX(maxRide.getX()-50);
		g.translate(camera.getCameraX(), camera.getCameraY());
		g.setBackground(Color.white); 
		background.getImage().draw(0,0,1);
		maxRide.getImage().draw(maxRide.getX(),maxRide.getY(),maxRide.getScale());
		eraser.getImage().draw(eraser.getX(), eraser.getY(), eraser.getScale());
		angel.getImage().draw(angel.getX(), angel.getY(), angel.getScale());
		
		
	}
	
	//method that returns the state Id
	
	public int getID(){
		return 1;
	}

	//method that updates objects on the screen
	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		if(maxRide.getRect().intersects(eraser.getRect())){
			maxRide.setX(30);
			maxRide.setY(310);
		}
		
		if(maxRide.getRect().intersects(angel.getRect())){
			sbg.enterState(2);
		}
		
		Input i = gc.getInput();
		
		

		
		if(i.isKeyDown(Input.KEY_UP)){
			maxRide.setyVelocity(-.2f);
		}
		
		else if(i.isKeyDown(Input.KEY_DOWN)){
			maxRide.setyVelocity(.2f);
		}
		else{
			maxRide.setyVelocity(0);
		}
		
		maxRide.setY(maxRide.getY()+(maxRide.getyVelocity()*delta));

		
		if(i.isKeyDown(Input.KEY_RIGHT)){
			maxRide.setxVelocity(.2f);
			
		}
		else{
			maxRide.setxVelocity(0);
		}
		
		maxRide.setX(maxRide.getX()+(maxRide.getxVelocity()*delta));
	
		
		

		
		
	}




}
