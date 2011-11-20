package com.test.myfirsttriangle;

import com.badlogic.gdx.backends.jogl.JoglApplication;

public class MyFirstTriangleDesktop {

	public static void main(String[] args) {
        new JoglApplication(new MyFirstTriangle(), "My First Triangle", 480, 320, false);               
	}

}
