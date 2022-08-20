package Day44_Abstractions_InterfaceIntro.DeviceTask;


import week14.task.OS;

public interface AndroidApps extends Downloadable {

     static String playStoreName = "PlayStore";
     static String OS = "Android";


}
/*Create a child interface of Downloadable named AndroidApps:

			Variables:
				AppStoreName, OS
*/