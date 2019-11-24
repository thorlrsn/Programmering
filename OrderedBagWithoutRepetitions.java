package Excercise2;

import java.util.ArrayList;
import java.util.Collections;

public class OrderedBagWithoutRepetitions implements Bag {

	ArrayList<String> words = new ArrayList<String>();
	
	public OrderedBagWithoutRepetitions() {
		
	}
	
	@Override
	public boolean addString(String str) {
		
		//Won't accept adding str if already excists
		if(words.contains(str)) {
			return false;
		}else {
			words.add(str);
		}
		
		//Uppercase letters before lowercase
		Collections.sort(words);
		
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
