package enity;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class list_personage<T> implements HistoryMethod<T> {
	public <T> void show(ArrayList<T> pel) {
		for (T personage : pel) {
			System.out.println(personage);
		}
		
	}
	
	public <T> void searchByName(ArrayList<T> pel,String name) {
		for (T personage : pel) {
			if(((Personage) personage).getName().toLowerCase().indexOf(name.toLowerCase())>=0) {
				System.out.println(personage);
			}
		}
	}
	
	public Personage searchByName1(ArrayList<Personage> pel,String name){
		for (Personage personage : pel) {
			if(personage.getName().toLowerCase().indexOf(name.toLowerCase())>=0) {
				return personage;
			}
		}
		return null;
	}
	
	public <T> void searchID(ArrayList<T> pel,int id) {
		for (T personage : pel) {
			if(((Personage) personage).getId()==id) {
				System.out.println(personage);
			}
		}
	}
	
}
