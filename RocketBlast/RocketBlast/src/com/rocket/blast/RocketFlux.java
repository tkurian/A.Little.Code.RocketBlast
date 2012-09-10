/**
 * Created By: Johnson J. Thomas & Tina Kurian
 * Version: 0.0.1
 * File Name: RocketFlux.java 
 * Date: 10.06.2012
 * Purpose: This class will handle all rocket specific motions.
 * 			It will contain getters and setters as well as other
 * 			private and public methods
 * 
 * @author: Johnson J. Thomas & Tina Kurian
 * @version: 0.0.1
 * @file: RocketFlux.java 
 * @date: 10.06.2012
 * @purpose: This class will handle all rocket specific motions.
 * 			 It will contain getters and setters as well as other
 * 			 private and public methods
 * 
 */



//package
package com.rocket.blast;

//required imports
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;



/**
 * Class Name: RocketFlux
 * Purpose: This class will handle all rocket specific motions.
 * 			It will contain getters and setters as well as other
 * 			private and public methods
 * 
 * @name: RocketFlux
 * @purpose: This class will handle all rocket specific motions.
 * 			 It will contain getters and setters as well as other
 * 			 private and public methods
 */
public class RocketFlux {

	
	/**************************************************************
	 * 						CLASS VARIABLE
	 **************************************************************/
	// All public and private class level variables are situated 
	// below: 

	
	/*********************** PUBLIC VARIABLES**********************/
	//TODO: add public variables here
	
	
	/************************ PRIVATE VARIABLES********************/
	
	private Texture rocketTexture;
	private Sprite rocketSprite;
	
	
	
	
	
	
	
	/**************************************************************
	 * 						 METHODS
	 **************************************************************/
	// All public and private methods are situated 
	// below: 
	
	
	/************************* CONSTRUCTOR ************************/
	
	/*
	 * Method Name: RocketFlux()
	 * Description: Constructor for the RocketFlux class
	 * Parameters: n/a
	 * Parameter Description: n/a
	 * Return: void
	 * 
	 * @name: RocketFlux()
	 * @param: n/a
	 * @description: Constructor for the RocketFlux class
	 * @return: void
	 */
	public RocketFlux() {
		
		//Layer 1 setup
		Rocket_init();
		
	}
	
	
	
	
	
	
	
	/************************ PUBLIC METHODS **********************/
	
	/*
	 * Method Name: GetTexture()
	 * Description: Returns the texture of the main rocket
	 * Parameters: n/a
	 * Parameter Description: n/a
	 * Return: rocketSprite: Returns the Rocket texture
	 * 
	 * @name: GetTexture()
	 * @description: Returns the texture of the main rocket
	 * @param: n/a
	 * @description: Returns the texture of the main rocket
	 * @return: rocketSprite: Returns the Rocket texture
	 */
	public Texture GetTexture() {
		return rocketTexture;
	}
	
	
	/*
	 * Method Name: GetSprite()
	 * Description: Returns the main rocket sprite
	 * Parameters: n/a
	 * Parameter Description: n/a
	 * Return: rocketSprite: Returns the Rocket sprite
	 * 
	 * @name: GetSprite()
	 * @description: Returns the main rocket sprite
	 * @param: n/a
	 * @description: rocketSprite: Returns the Rocket sprite
	 * @return: void
	 */
	public Sprite GetSprite() {
		return rocketSprite;
	}
	
	
	
	
	
	/*********************** PRIVATE METHODS **********************/
	
	/*
	 * Method Name: Rocket_init()
	 * Description: Initializes the main rocket image
	 * Parameters: n/a
	 * Parameter Description: n/a
	 * Return: void
	 * 
	 * @name: Rocket_init()
	 * @param: n/a
	 * @description: Initializes the main rocket image
	 * @return: void
	 */
	private void Rocket_init() {
		
		//getting the rocket image into a texture
		rocketTexture = new Texture(Gdx.files.internal("images/rocket/spaceship_cropped.png"));
		
		//setting up region
		TextureRegion region = new TextureRegion(rocketTexture, 0, 0, 512, 512);
		
		//setting up sprite
		rocketSprite = new Sprite(region);
		rocketSprite.setSize(1.0f, 0.7f * rocketSprite.getHeight() / rocketSprite.getWidth());
		rocketSprite.setOrigin(rocketSprite.getWidth()/2, rocketSprite.getHeight()/2);
		rocketSprite.setPosition(-rocketSprite.getWidth()/2, -rocketSprite.getHeight()/2);
		
	}
}
