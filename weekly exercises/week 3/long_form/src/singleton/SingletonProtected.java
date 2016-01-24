package singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonProtected implements Serializable{
	
	
    // private member variable
    private static SingletonProtected instance;

    // private constructor
    private SingletonProtected() {}

    // public getter
    public synchronized static SingletonProtected getInstance() {
        
        if (instance == null)
            instance = new SingletonProtected();
        
        return instance;
    }
    
    private Object readResolve() throws ObjectStreamException{
    	  return instance;
    }
    
    public Object clone() {
        return instance; 
    }

}
