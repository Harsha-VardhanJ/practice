import java.util.Scanner;

public class DistanceCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the speed of the vehicle in km/h: ");
		double speed = scan.nextDouble();
		System.out.println("Enter the time travelled in hrs: ");
		double time = scan.nextDouble();
		double distance = calculateDistance(speed,time);
		System.out.println("Distance travelled in kms: " + distance);
		scan.close();
	}

	static double calculateDistance(double speed, double time) {
		return speed*time;
	}

}
