package cz.cuni.mff.spl.casestudy.annotations;

import cz.cuni.mff.spl.SPL;

public class MinPriorityQueueMeasurements{

	 @SPL(
            generators = {
                    "EventGenerator="
                        + "THIS@HEAD:"
                        + "cz.cuni.mff.spl.casestudy.generators."
                        + "EventGenerator()#generate()"
             },
             methods = {
	             	"arrayAdd="
	             		+ "particles@ArrayList:"
	             		+ "utils."
	             		+ "MinPriorityQueue#add",
	             	"vectorAdd="
	             		+ "particles@Vector:"
	             		+ "utils."
	             		+ "MinPriorityQueue#add"

             },
             formula = {
             		"arrayAdd[EventGenerator]<= vectorAdd[EventGenerator]"
             })

	public static void main(String args[]) {

    }

}