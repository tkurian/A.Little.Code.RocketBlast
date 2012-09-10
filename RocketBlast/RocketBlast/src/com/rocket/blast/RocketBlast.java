/**
 * Created By: Johnson J. Thomas & Tina Kurian
 * Version: 0.0.1
 * File Name: RocketBlast.Java
 * Date: 10.06.2012
 * Purpose: This class will serve as the main class where all actions are called upon
 * 			in order to have the application create, dispose, render, resize, pause
 * 			and resume
 * 
 * @author: Johnson J. Thomas & Tina Kurian
 * @version: 0.0.1
 * @file: RocketBlast.java 
 * @date: 10.06.2012
 * @purpose: This class will serve as the main class where all actions are called upon
 * 			 in order to have the application create, dispose, render, resize, pause
 * 			 and resume
 * 
 */



//package
package com.rocket.blast;

//required imports
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.rocket.blast.RocketFlux;
import com.rocket.blast.SkyFlux;
import java.util.*;

/**
 * Class Name: RocketBlast
 * Purpose: This class will serve as the main class where all actions are called upon
 * 			in order to have the application create, dispose, render, resize, pause
 * 			and resume
 * 
 * @name: RocketBlast
 * @purpose: This class will serve as the main class where all actions are called upon
 * 			 in order to have the application create, dispose, render, resize, pause
 * 			 and resume
 */
public class RocketBlast implements ApplicationListener {
	
	
	/**************************************************************
	 * 						CLASS VARIABLE
	 **************************************************************/
	// All public and private class level variables are situated 
	// below: 
	
	
	/*********************** PUBLIC VARIABLES**********************/
	//TODO: add public variables here
	
	
	/************************ PRIVATE VARIABLES********************/
	private OrthographicCamera camera;
	private SpriteBatch batch;	
	private	float time;
	
	//rocket specific variables
	private RocketFlux rocket;
	private Texture rocketTextures; 
	private Sprite rocketSprites; 
	
	//sky specific variables
	private SkyFlux sky;
	private ArrayList<Texture> textures;
	private ArrayList<Sprite> skySprites;
	
	
	
	
	
	
	/**************************************************************
	 * 						 METHODS
	 **************************************************************/
	
	
	/************************ PUBLIC METHODS **********************/
	
	/*
	 * Method Name: create()
	 * Description: ApplicationListener method which creates
	 * Parameters: n/a
	 * Parameter Description: n/a
	 * Return: void
	 * 
	 * @name: create()
	 * @param: n/a
	 * @description: ApplicationListener method which creates
	 * @return: void
	 * @see com.badlogic.gdx.ApplicationListener#create()
	 */
	@Override
	public void create() {	
		
		//creating objects of different classes
		rocket = new RocketFlux(); 
		sky = new SkyFlux();
		
		//getting the height and width for setup purposes
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		//setting up camera and batch
		camera = new OrthographicCamera(1, h/w);
		batch = new SpriteBatch();
		
		//Creating texture arraylist and sprite arraylist
		textures = new ArrayList<Texture>();
		skySprites = new ArrayList<Sprite>();
		
		//setting up sky
		for(Texture texture:sky.getTexture())
			textures.add(texture);
		
		//Adding the sky related sprites
		for(Sprite sprite:sky.getSprite())
			skySprites.add(sprite);
		
		//setting up the main rocket
		rocketTextures = rocket.GetTexture(); 
		rocketSprites = rocket.GetSprite(); 
				
	}

	
	/*
	 * Method Name: dispose()
	 * Description: ApplicationListener method which disposes
	 * Parameters: n/a
	 * Parameter Description: n/a
	 * Return: void
	 * 
	 * @name: create()
	 * @description: ApplicationListener method which disposes
	 * @param: n/a
	 * @description: ApplicationListener method which disposes
	 * @return: void
	 * @see com.badlogic.gdx.ApplicationListener#dispose()
	 */
	@Override
	public void dispose() {
		
		//disposing the batch and texture when we're done
		batch.dispose();
		for(Texture texture: textures)
			texture.dispose();
				
		rocketTextures.dispose(); 
	}

	
	/*
	 * Method Name: render()
	 * Description: ApplicationListener method which renders
	 * Parameters: n/a
	 * Parameter Description: n/a
	 * Return: void
	 * 
	 * @name: create()
	 * @description: ApplicationListener method which renders
	 * @param: n/a
	 * @description: ApplicationListener method which renders
	 * @return: void
	 * @see com.badlogic.gdx.ApplicationListener#render()
	 */
	@Override
	public void render() {
		
		//clearing everything out
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
		time += Gdx.graphics.getDeltaTime();
		if(time > 0.95f)
			time = 0.0f;
		
		float speed = 1.0f;
		
//		skySprites.get(0).setV(time+2.5f);
//		skySprites.get(0).setV2(time);
		
		//Adjusting the speed of the sprites except the first sprite which is the base image.
		for(int i=1;i<skySprites.size();i++) {
			skySprites.get(i).setV(time+speed);
			skySprites.get(i).setV2(time);
			speed = speed+1.0f;
		}

		//setting up
		batch.setProjectionMatrix(camera.combined);
		
		//begging draw
		batch.begin();
		
		//items to be drawn
		//TODO: add other items to be drawn here
		for(Sprite sprite:skySprites)
			sprite.draw(batch);
				
		rocketSprites.draw(batch); 
		
		
		//ending draw 
		batch.end();
	}

	
	/*
	 * Method Name: resize()
	 * Description: ApplicationListener method which renders
	 * Parameters: int width, int height
	 * Parameter Description: int width: the specified resize width
	 * 						  int height: the specified resize height
	 * Return: void
	 * 
	 * @name: create()
	 * @description: ApplicationListener method which renders
	 * @param: n/a
	 * @description: @value: int width: the specified resize width
	 * 				 @value: int height: the specified resize height
	 * @return: void
	 * @see com.badlogic.gdx.ApplicationListener#render()
	 */
	@Override
	public void resize(int width, int height) {
	}

	
	/*
	 * Method Name: pause()
	 * Description: ApplicationListener method which pause
	 * Parameters: n/a
	 * Description: n/a
	 * Return: void
	 * 
	 * @name: pause()
	 * @description: ApplicationListener method which pauses
	 * @param: n/a
	 * @description: n/a
	 * @return: void
	 * @see com.badlogic.gdx.ApplicationListener#pause()
	 */
	@Override
	public void pause() {
	}

	
	/*
	 * Method Name: resume()
	 * Description: ApplicationListener method which pause
	 * Parameters: n/a
	 * Parameter Description: n/a
	 * Return: void
	 * 
	 * @name: resume()
	 * @description: ApplicationListener method which resumes
	 * @param: n/a
	 * @description: n/a
	 * @return: void
	 * @see com.badlogic.gdx.ApplicationListener#resumes()
	 */
	@Override
	public void resume() {
	}
	
	
	
	/*********************** PRIVATE METHODS **********************/
	//TODO: add private variables here
}
