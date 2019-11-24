package Excercise2;

import java.util.ArrayList;

public class SimpleBag implements Bag{
	
	ArrayList<String> words = new ArrayList<String>();
	
	public SimpleBag() {
		
	}
	
	@Override
	public boolean addString(String str) {
		
		words.add(str);
		
		//Checks if the str excists in arraylist words
		if(words.contains(str)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	@Override
	public boolean removeAllOccurrences(String str) {
		
		//Loops through until str cannot be removed (all intences of it are gone)
		while(words.remove(str)) {
			
		}
		
		//Checks if the input str doesn't exists in words
		if(!words.contains(str)) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public  String getString(int index) {
		
		return words.get(index);
	}
	
	@Override
	public  int noOfElements() {
		
		return words.size();
	}
	
}