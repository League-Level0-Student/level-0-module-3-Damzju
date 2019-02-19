package MethodWriting;

import org.jointheleague.graphical.robot.Robot;
import javax.swing.JOptionPane;
import java.awt.Color;

public class ObedientRobot {
	static Robot oof = new Robot();

	public static void main(String[] args) {
		String kewler = JOptionPane.showInputDialog("Which color do you like?" + "    Red Green or Yellow?");
		if (kewler.equalsIgnoreCase("Red")) {
			oof.setPenColor(255, 0, 0);
		}

		if (kewler.equalsIgnoreCase("Green")) {
			oof.setPenColor(0, 255, 0);
		}

		if (kewler.equalsIgnoreCase("Yellow")) {
			oof.setPenColor(255, 255, 0);
		}
		oof.setSpeed(990);
		oof.setPenWidth(10);
		oof.penDown();

		String draw = JOptionPane.showInputDialog("What shape do you like");
		if (draw.equalsIgnoreCase("Square")) {
			drawSquare();
		}

		if (draw.equalsIgnoreCase("Triangle")) {
			drawTriangle();
		}

		if (draw.equalsIgnoreCase("Circle")) {
			drawCircle();
		}

	}

	private static void drawSquare() {

		oof.setSpeed(800);
		oof.setPenWidth(5);
		oof.penDown();
		for (int i = 0; i < 5; i++) {
			oof.move(60);
			oof.turn(90);
		}
	}

	private static void drawTriangle() {

		oof.setSpeed(800);
		oof.setPenWidth(5);
		oof.penDown();

		oof.turn(45);
		oof.move(100);
		oof.turn(100);
		oof.move(100);
		oof.turn(130);
		oof.move(100);
		for (int i = 0; i < 3; i++) {

		}
	}

	private static void drawCircle() {

		oof.setSpeed(800);
		oof.setPenWidth(5);
		oof.penDown();
		oof.setSpeed(99000);
		for (int i = 0; i < 40; i++) {
			oof.move(10);
			oof.turn(10);
		}
	}
}
