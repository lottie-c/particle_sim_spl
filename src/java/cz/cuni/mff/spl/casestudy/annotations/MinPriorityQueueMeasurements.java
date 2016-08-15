package cz.cuni.mff.spl.casestudy.annotations;

import cz.cuni.mff.spl.SPL;

public class MinPriorityQueueMeasurements{

	 @SPL(
            generators = {
                    "EventGenerator="
                        + "THIS@HEAD:"
                        + "cz.cuni.mff.spl.casestudy.generators."
                        + "EventGenerator()#generate()",
                    "IntegerGenerator="
                        + "THIS@HEAD:"
                        + "cz.cuni.mff.spl.casestudy.generators."
                        + "EventGenerator()#generateInt()"
             },
             methods = {
	             	"arrayAdd="
	             		+ "particles@ArrayList:"
	             		+ "utils."
	             		+ "MinPriorityQueue#add",
	             	"vectorAdd="
	             		+ "particles@Vector:"
	             		+ "utils."
	             		+ "MinPriorityQueue#add",
                    "runSimArray="
                        +"particles@ArrayList:"
                        +"simulation."
                        + "ParticleSimulation#run(Integer)",
                    "runSimVector="
                        +"particles@Vector:"
                        +"simulation."
                        + "ParticleSimulation#run(Integer)"

             },
             formula = {
             		"arrayAdd[EventGenerator]<= vectorAdd[EventGenerator]",
                    "for (n {10, 100, 1000} )"
                    + "runSimArray[IntegerGenerator](n) <= runSimVector[IntegerGenerator](n)"
             })

	public static void main(String args[]) {

    }

}