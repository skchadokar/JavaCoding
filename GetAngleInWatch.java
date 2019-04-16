import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class GetAngleInWatch {

	static final int ANGLE_PER_HOUR = 360/12;
	static final int ANGLE_PER_MIN = 360/60;
	 
	public static void main(String[] args) {
		
		int hh = 3,mm=40;
		int angleOfHH =0,angleOfMM=0;
		angleOfMM = mm*ANGLE_PER_MIN;
		angleOfHH = hh*ANGLE_PER_HOUR+mm*ANGLE_PER_HOUR/60;
		int finalAngle = Math.abs(angleOfHH-angleOfMM)>180? 360-Math.abs(angleOfHH-angleOfMM):Math.abs(angleOfHH-angleOfMM);
		System.out.println(finalAngle);
	}
}
