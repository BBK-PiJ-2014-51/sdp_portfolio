/*
 * In the facade pattern, the facade class inherits an object through composition
 * and allows a more simple interface for accessing the object.
 * 
 * You can use it when you need a more simple interface to an existing class,
 * its especially useful when you cant, or dont want, to change the existing class
 */

package facade;

public class FacadeRunner {

	public static void main(String[] args) {
		
		ServerFacade face = new ServerFacade();
		
		face.start();
		
		face.stop();

	}

}
