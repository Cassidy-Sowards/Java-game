/*
 * Menu.java - the menu state for the Save Angel Game
 * @author: Cassidy Sowards
 * @version 1.0
 */

package javagame;


import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState {
	private Image playButton;
	private GameObject background;
	
	//Constructor
	public Menu(int state){
		
	}
	//method to initialize objects
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		background = new GameObject();
		background.setImage("Project5Bg.png");
		
		
	}
	
	//method that renders objects to the screen
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		background.getImage().draw(0,0,1);
		playButton = new Image("res/play.png");
		g.drawString("SAVE ANGEL!", 150,100);
		g.drawString("Instructions:", 150, 150);
		g.drawString("Use the UP, DOWN, and RIGHT arrow keys ",50, 175);
		g.drawString("in order to get pass the Eraser (Werewolf)", 50, 200);
		playButton.draw(150, 250);

		int posX = Mouse.getX();
		int posY = Mouse.getY();
		if((posX > 150 && posX < 362) && (posY < 251 && posY > 169)){
			if(Mouse.isButtonDown(0)){
				sbg.enterState(1);
			}
		}
		
	
	}
	
	//method that updates objects on the screen
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{

		
	}
	
	//method that returns the state id
	public int getID(){
		return 0;
	}

	
}