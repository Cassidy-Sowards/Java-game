/*
 * Camera.java - acts as the camera to follow the game action
 * @author Cassidy Sowards
 * @version 1.0
 */
package javagame;

public class Camera {


	private float cameraX;
	private float cameraY;
	//returns the camera's x axis
	public float getCameraX() {
		return cameraX;
	}
	//sets the camera x axis
	public void setCameraX(float cameraX) {
		this.cameraX =- cameraX;
	}
	
	//returns the camera y axis
	public float getCameraY() {
		return cameraY;
	}
	//sets the camera y axis
	public void setCameraY(float cameraY) {
		this.cameraY =- cameraY;
	}


}
