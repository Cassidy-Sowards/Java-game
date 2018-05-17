/*
 * GameObject.java - serves as the parent class for all objects in the Save Angel game
 * @author Cassidy Sowards
 * @version 1.0
 */

package javagame;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
public class GameObject {
	protected float x=0; //The x of the game object
	protected float y=0; //The y of the game object
	private float xVelocity = 0;
	private float yVelocity = 0;
	private float scale = 1.0f;
	private float width = 0;
	private float height = 0;
	private Image objImage;
	public Rectangle rect;
	
	//Constructor
	public GameObject(){
	}
	
	//returns a rectangle that's used in collisions 
	public Rectangle getRect(){
		rect = new Rectangle(getX(),getY(),getWidth(),getHeight());
		return rect;
		
		
		
	}

	//returns height
	public float getHeight() {
		// TODO Auto-generated method stub
		return height;
	}

	public float getX() {
		// TODO Auto-generated method stub
		return x;
	}

	public float getY() {
		// TODO Auto-generated method stub
		return y;
	}

	public float getWidth() {
		// TODO Auto-generated method stub
		return width;
	}
	
	public void setImage(String filename){
		try{
			objImage = new Image("res/" + filename);
			
		}
		catch(SlickException e){
			System.err.print("error" + e);
		}
	}
	
	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}

	public void setxVelocity(float xVelocity) {
		this.xVelocity = xVelocity;
	}

	public void setyVelocity(float yVelocity) {
		this.yVelocity = yVelocity;
	}

	public void setScale(float scale) {
		this.scale = scale;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setObjImage(Image objImage) {
		this.objImage = objImage;
	}
	
	public float getxVelocity() {
		return xVelocity;
	}

	public float getyVelocity() {
		return yVelocity;
	}

	public float getScale() {
		return scale;
	}

	public Image getImage() {
		return objImage;
	}

}
