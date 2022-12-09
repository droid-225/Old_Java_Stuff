package basic;

public class MathClass {

	public static void main(String[] args) {
		double x = 3.0;
		double y = 2.0;
		
		double max = Math.max(x, y); // gives max num for given x and y
		double min = Math.min(x,y); // gives min num for given x and y
		double abs = Math.abs(x); // gives absolute value of x ( |x| )
		double sqrt = Math.sqrt(x); // gives square root of x
		double round = Math.round(y);
		/* for double value, Math.round rounds based on 10ths place
		 * rounds up if >= 0.5....
		 * rounds down if < 0.5.....
		 */
		double ceil = Math.ceil(x); // always rounds the number up
		double floor = Math.floor(x); // always round the number down
		double power = Math.pow(x, y); // puts x to power y
		
		System.out.println(power);
	}
	
}
