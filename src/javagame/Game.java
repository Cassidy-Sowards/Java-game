/*
 * Game.java - initializes all the states for the Save Angel game;
 * @author: Cassidy Sowards
 * @version: 1.0
 */

package javagame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;



public class Game extends StateBasedGame {
	public static final String gameName = "Save Angel!";
	public static final int menu = 0;
	public static final int play = 1;
	public static final int message = 2;
	
	//The constructor for the Game 

	public Game(String gameName) {
		super(gameName);
		this.addState(new Menu(menu));
		this.addState(new Play(play));
		this.addState(new Message(message));
		
		
		
	}
	
	//initiates all the states that are found
	public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(menu).init(gc, this);
		this.getState(play).init(gc, this);
		this.getState(message).init(gc, this);
		this.enterState(menu);
		
	}

	
	//Main method
	public static void main(String[] args) {
		AppGameContainer appgc;
		
		try{
			appgc = new AppGameContainer(new Game(gameName));
			appgc.setDisplayMode(500,500,false);
			appgc.start();
		}catch(SlickException e){
			e.printStackTrace();
		}

	}

}
