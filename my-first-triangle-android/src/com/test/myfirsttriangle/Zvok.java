package com.test.myfirsttriangle;

import java.io.IOException;

import android.media.MediaPlayer;

public class Zvok 
{
	MediaPlayer mp = new MediaPlayer();
	
	public void Predvajaj()
	{
		mp.start();
	}
	
	public void Pavza()
	{
		mp.pause();
	}
	
	public void Stop()
	{
		mp.stop();
	}
	
	public void IzbiraPesmi(String direktorij, String ime_datoteke)
	{
        try 
        {
            mp.setDataSource(direktorij + "/" + ime_datoteke); //Iskanje datoteke
        } 
        catch (IllegalArgumentException e) 
        {
            e.printStackTrace();
        } 
        catch (IllegalStateException e) 
        {
            e.printStackTrace();
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        
        try 
        {
            mp.prepare(); 
        } 
        catch (IllegalStateException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
	
	

}
