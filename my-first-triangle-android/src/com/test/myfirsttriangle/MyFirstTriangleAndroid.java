package com.test.myfirsttriangle;

import android.os.Bundle;
import android.view.KeyEvent;

import com.badlogic.gdx.backends.android.AndroidApplication;

public class MyFirstTriangleAndroid extends AndroidApplication {
	
	Zvok z = new Zvok();
	
    @Override
        public void onCreate (Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                initialize(new MyFirstTriangle(), false);               
                Pesem();
                z.Predvajaj();
        }
    @Override
	public void onResume() 
    { 
		super.onResume();
		z.Predvajaj();
	}
    
	@Override
	public void onPause() 
	{ 
		super.onPause();
		z.Pavza();
	}
	
	@Override
	public void onDestroy() 
	{
		super.onDestroy();
		z.Stop();
	}
	
    public void Pesem()
    {
        z.IzbiraPesmi("data","nekaj.mp3");
    }
    
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) 
    {
    	super.onKeyDown(keyCode, event);
    	
        if (keyCode == KeyEvent.KEYCODE_P) 
        {
        	z.Pavza();
        }
        if (keyCode == KeyEvent.KEYCODE_O) 
        {
        	z.Predvajaj();
        }
        if (keyCode == KeyEvent.KEYCODE_I) 
        {
        	z.Stop();
        	Pesem();
        }
        
        return super.onKeyDown(keyCode, event);
    }
    
   
}