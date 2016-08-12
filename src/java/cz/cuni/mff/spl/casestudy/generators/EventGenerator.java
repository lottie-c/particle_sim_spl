package cz.cuni.mff.spl.casestudy.generators;

import java.util.Random;
import java.util.ArrayList;


public class EventGenerator {


	public class Event implements Comparable<Event>{
		private final double time;

		Event(double t){
			this.time = t;
		}

		public double getTime(){
			return this.time;
		}

		public int compareTo(Event that) {
			if(this.time < that.getTime()){
		        	return -1;
			}else if(this.time == that.getTime()){
				return 0;
			}else{
				return 1;
			}
		}
	}
	
	public EventGenerator(){
	}

	public ArrayList<Object[]> generate(){
		ArrayList<Object[]> output = new ArrayList<Object[]>();
		Random rnd = new Random();
		double time = rnd.nextDouble();
		Event[] array = new Event[1];
		array[0] = new Event(time);

		output.add(array);
		return output;
	}
}