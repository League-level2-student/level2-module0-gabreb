package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static boolean race = true;
	static boolean race2 = true;

	// 1. make a main method
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < robots.length; i++) {
			robots[i].setY(540);
			robots[i].setX(70 + (i * 100));
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		/*
		 * while(race==true) { for (int i= 0; i < robots.length; i++) { int z = new
		 * Random().nextInt(51); robots[i].move(z); if (robots[i].getY()<=100) {
		 * race=false; JOptionPane.showMessageDialog(null,"Robot " + (1+i) + " won!");
		 * break; } } }
		 */
		int[] a = new int[robots.length];
		while (race2 == true) {
			for (int i = 0; i < robots.length; i++) {
				int z = new Random().nextInt(51);
				for (int x = 0; x < z; x++) {
					robots[i].turn(1);
					robots[i].move(1);
				}
				a[i] = a[i] + z;
				if (a[i] >= 360) {
					race2 = false;
					JOptionPane.showMessageDialog(null, "Robot " + (1 + i) + " won!");
					break;
				}
			}
		}
		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
