package edu.saintjoe.cs.brianc.testdogblc;

public class TestDogBLC {

	     // This will represent the dog name
	    private String name;
	    
	    //This will represent the dog weight and size
	    private int weight;
	    	    
	    // newName goes off this method
	    public void setName(String newName) {
	    	name = newName;
	    }
	    
	    // newWeight goes off this method
	    public void setWeight(int newWeight) {
	    	weight = newWeight;
	    }
	    
	    // this is where we get the name for each dog when it prints out
	    public String getName() {
	    	return name;
	    }
	    // This will return the weight to the line after it determines what size the dog is
	    public int getWeight() {
	    	return weight;
	    }
	    
	    // This is part of the bark method
	    public void bark() {
	    
	    	int pointless = 0;
	    	
	    	// These equations determines the weight and name of the dog
	    	if (weight > 60 ) {
	          System.out.println("Woof!! Woof!! says " + name + " that weighs " + weight);
	    	} else if (weight > 14 ) {
	    		System.out.println("Ruff!! Ruff!! says " + name + " that weighs " + weight);
	    	} else
	    		System.out.println("Yip!! Yip!! says " + name + " that weighs " + weight);
	    }
	    
	    public int setBoth(String newName, int newWeight) {
	    	
	    	int oldWeight = weight;
	    	
	    	name = newName;
	    	weight = newWeight;
	    	return oldWeight;
	    }
	    	

	    public void eat() { }
	    
	    public void chaseCat() { }
	}

