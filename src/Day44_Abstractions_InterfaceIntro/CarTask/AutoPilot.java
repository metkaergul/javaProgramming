package Day44_Abstractions_InterfaceIntro.CarTask;

public interface AutoPilot extends AutoPark {
    boolean hasAutoPilot = true;

     void selfDrive();

}
/*reate a child interface of AutoPark named AutoPilot
				Variables:
					hasAutoPilot

				Abstract method:
					selfDrive();*/