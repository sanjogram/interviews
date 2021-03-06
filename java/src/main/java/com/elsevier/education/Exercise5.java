package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		private static Singleton singleton;
		
		private Singleton(){
		}
		
		public void doSomething() {
			System.out.println("Doing something....");
	    }
		
		public static synchronized Singleton createSingletonInstance() {
            if(singleton != null)
                return singleton;
            else
            	return new Singleton();
        }
    }
		
	public static void main(String a[]){
		Singleton st = new Singleton();
		st.doSomething();
	}
}
