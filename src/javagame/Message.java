/*
 * Message.java - shows a message once the game's objective has been met
 */
package javagame;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;


public class Message extends BasicGameState {
	private Image message;

	//Constructor
	public Message(int state) {
	}

	//initializes objects
	@Override
	public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException {
		// TODO Auto-generated method stub
		message = new Image("res/message.png");
		
	}

	//renders objects onto screen
	@Override
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics arg2) throws SlickException {
		// TODO Auto-generated method stub
		
		message.draw(150,200);
	}

	//updates objects on screen
	@Override
	public void update(GameContainer arg0, StateBasedGame arg1, int arg2) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	//returns the state Id
	@Override
	public int getID() {
		return 2;
	}

}
