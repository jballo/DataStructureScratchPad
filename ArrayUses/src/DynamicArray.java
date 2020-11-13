

public class DynamicArray { 
	private int[] data;
	
	private int size;
	
	private int counter;
	
	
	
	DynamicArray(){                //Constructor w/ baseline
		data = new int[0];           
		
		size = 1;
		
		counter = 0;
		
	}
	
	
	void append(int value) {
		data[counter] = value;
		counter++;
		
		if(counter == size) {      //Max hit to resize array
			int oldSize = size;
			size*=2;
			int[] newArr = new int[size]; //New array with double of size
			
			for(int i = 0; i < oldSize; i++) { //Fills up new array with old values
				newArr[i] = data[i];
			}
			
			data = newArr;             //Updates the old array with new array (size)
			
			
		}
	}
	
	void insert(int index, int value) {
		if(counter == 0 && index == 0) {
			data[0] = value;
		}
		
	}
	
	public int get() {
		
		return -1;
	}
	
	public int size() {
		return size;
	}
	
	public int count() {
		return counter;
	}
	
	void print(){
		
	}
	
}