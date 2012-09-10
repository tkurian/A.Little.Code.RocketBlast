/**
 * Created By: Johnson J. Thomas & Tina Kurian
 * Version: 0.0.1
 * File Name: SkyFlux.java 
 * Date: 10.06.2012
 * Purpose: This class will handle all sky specific motions.
 * 			It will contain getters and setters as well as other
 * 			private and public methods
 * 
 * @author: Johnson J. Thomas & Tina Kurian
 * @version: 0.0.1
 * @file: SkyFlux.java 
 * @date: 10.06.2012
 * @purpose: This class will handle all sky specific motions.
 * 			 It will contain getters and setters as well as other
 * 			 private and public methods
 * 
 */



//package
package com.rocket.blast;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureWrap;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import java.util.*;


/**
 * Class Name: SkyFlux
 * Purpose: This class will handle all sky specific motions.
 * 			It will contain getters and setters as well as other
 * 			private and public methods
 * 
 * @name: SkyFlux
 * @purpose: This class will handle all sky specific motions.
 * 			 It will contain getters and setters as well as other
 * 			 private and public methods
 */
public class SkyFlux {
	
	/**************************************************************
	 * 						CLASS VARIABLE
	 **************************************************************/
	// All public and private class level variables are situated 
	// below: 
	
	
	/*********************** PUBLIC VARIABLES**********************/
	//TODO: add public variables here
	
	
	
	
	/************************ PRIVATE VARIABLES********************/
	
	private Texture main_texture,texture_layer1,texture_layer2;
	private Sprite main_sprite,sprite_layer1,sprite_layer2;
	private ArrayList<Texture> textures;
	private ArrayList<Sprite> sprites;
		
	
	
	
	
	
	
	/**************************************************************
	 * 						 METHODS
	 **************************************************************/
	// All public and private methods are situated 
	// below: 
	
	
	/************************ CONSTRUCTOR **********************/
	
	/*
	 * Method Name: SkyFlux()
	 * Description: Constructor for the SkyFlux class
	 * Parameters: n/a
	 * Parameter Description: n/a
	 * Return: void
	 * 
	 * @name: SkyFlux()
	 * @param: n/a
	 * @description: Constructor for the SkyFlux class
	 * @return: void
	 */
	public SkyFlux() {
		textures = new ArrayList<Texture>();
		sprites = new ArrayList<Sprite>();

		//Main layer setup
		main_layer_init();
		
		//Layer 1 setup
		layer1_init();
		
		//Layer 2 Setup
		layer2_init();
	}
	
	
	
	
	
	
	/************************ PUBLIC METHODS **********************/
	//TODO: add private variables here
	
	/*
	 * Method Name: getTexture()
	 * Description: Returns all the sky textures
	 * Parameters: n/a
	 * Parameter : n/a
	 * Return: ArrayList<Texture>: Returns an ArrayList of
	 * 		   sky textures
	 * 
	 * @name: getTexture()
	 * @description: Returns all the sky textures
	 * @param: n/a
	 * @description: n/a
	 * @return: ArrayList<Texture>: Returns an ArrayList of
	 * 		    sky textures
	 */
	public ArrayList<Texture> getTexture() {
		return textures;
	}
	
	
	/*
	 * Method Name: getSprite()
	 * Description: Returns all the sky sprites
	 * Parameters: n/a
	 * Parameter : n/a
	 * Return: ArrayList<Sprite>: Returns an ArrayList of
	 * 		   sky sprites
	 * 
	 * @name: getSprite()
	 * @description: Returns all the sky sprites
	 * @param: n/a
	 * @description: n/a
	 * @return: ArrayList<Sprite>: Returns an ArrayList of
	 * 		    sky sprites
	 */
	public ArrayList<Sprite> getSprite() {
		return sprites;
	}

	
	/*********************** PRIVATE METHODS **********************/
	
	/*
	 * Method Name: main_layer_init()
	 * Description: Initializing the main cloud layer
	 * Parameters: n/a
	 * Parameter Description: n/a
	 * Return: void
	 * 
	 * @name: main_layer_init()
	 * @description: Initializing the main cloud layer
	 * @param: n/a
	 * @description:
	 * @return: void
	 */
	private void main_layer_init() {
		main_texture = new Texture(Gdx.files.internal("images/sky/skyMain_cropped.jpg"));
		//main_texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		main_texture.setWrap(TextureWrap.Repeat, TextureWrap.Repeat);		
		textures.add(main_texture);
		
		//setting up region
		TextureRegion region = new TextureRegion(main_texture, 0, 0, 1024, 1024);
		
		//setting up sprite
		main_sprite = new Sprite(region);
		main_sprite.setSize(1.0f, 1.0f * main_sprite.getHeight() / main_sprite.getWidth());
		main_sprite.setOrigin(main_sprite.getWidth()/2, main_sprite.getHeight()/2);
		main_sprite.setPosition(-main_sprite.getWidth()/2, -main_sprite.getHeight()/2);
		sprites.add(main_sprite);
	}

	/*
	 * Method Name: layer1_init()
	 * Description: Initializing cloud layer 1
	 * Parameters: n/a
	 * Parameter Description: n/a
	 * Return: void
	 * 
	 * @name: layer1_init()
	 * @description: Initializing cloud layer 1
	 * @param: n/a
	 * @description:
	 * @return: void
	 */
	private void layer1_init() {
		texture_layer1 = new Texture(Gdx.files.internal("images/sky/skyLayer1_cropped.png"));
		texture_layer1.setWrap(TextureWrap.Repeat, TextureWrap.Repeat);
		textures.add(texture_layer1);
		
		//setting up region
		TextureRegion region = new TextureRegion(texture_layer1, 0, 0, 512, 512);
		
		//setting up sprite
		sprite_layer1 = new Sprite(region);
		sprite_layer1.setSize(1.0f, 1.0f * sprite_layer1.getHeight() / sprite_layer1.getWidth());
		sprite_layer1.setOrigin(sprite_layer1.getWidth()/2, sprite_layer1.getHeight()/2);
		sprite_layer1.setPosition(-sprite_layer1.getWidth()/2, -sprite_layer1.getHeight()/2);
		sprites.add(sprite_layer1);
	}

	
	/*
	 * Method Name: layer2_init()
	 * Description: Initializing cloud layer 2
	 * Parameters: n/a
	 * Parameter Description: n/a
	 * Return: void
	 * 
	 * @name: layer2_init()
	 * @description: Initializing cloud layer 2
	 * @param: n/a
	 * @description:
	 * @return: void
	 */
	private void layer2_init() {
		texture_layer2 = new Texture(Gdx.files.internal("images/sky/skyLayer2_cropped.png"));
		texture_layer2.setWrap(TextureWrap.Repeat, TextureWrap.Repeat);
		textures.add(texture_layer2);
		
		//setting up region
		TextureRegion region = new TextureRegion(texture_layer2, 0, 0, 256, 512);
		
		//setting up sprite
		sprite_layer2 = new Sprite(region);
		sprite_layer2.setSize(1.0f, 1.0f * sprite_layer2.getHeight() / sprite_layer2.getWidth());
		sprite_layer2.setOrigin(sprite_layer2.getWidth()/2, sprite_layer2.getHeight()/2);
		sprite_layer2.setPosition(-sprite_layer2.getWidth()/2, -sprite_layer2.getHeight()/2);
		sprites.add(sprite_layer2);
	}


}
