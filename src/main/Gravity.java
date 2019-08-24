package main;
import java.util.Scanner;


public class Gravity {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		double time = sc.nextDouble();
		double gravity = 9.8;
		double speed;
		double distance;

		speed = gravity * time;
		distance = (1 / 2.0) * gravity * time * time;

		System.out.println("The speed of the object at " + time + " seconds after its release is " + speed + " and the distance the object has travelled in the" + time + " seconds after the relase is " + distance);


	}
}
