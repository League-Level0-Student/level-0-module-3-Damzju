package MethodWriting;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class ObedientRobot {
	
public static void main(String[] args) {
	Robot oof = new Robot();
	oof.setSpeed(800);
	oof.setPenWidth(5);
	oof.penDown();
	
	drawSquare();
	for (int i = 0; i < 5; i++) {
		oof.move(60);
		oof.turn(90);		
	}

	
	
	
	
	drawTriangle();
	oof.turn(-90);
	oof.turn(45);
	oof.move(100);
	oof.turn(100);
	oof.move(100);
	oof.turn(130);
	oof.move(100);
	for (int i = 0; i < 3; i++) {
		
	}
	//oof.move(9999);//
	drawCircle();
}

private static void drawSquare() {
	
}

private static void drawTriangle() {
	
}


private static void drawCircle() {
	
}
}
