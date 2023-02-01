package enity;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CulturalList<T> implements HistoryMethod<T> {
	
	public <T> void show(ArrayList<T> cr)  {
		for (T culturalFestival : cr) {
			System.out.println(culturalFestival);
		}
	}
	
	public <T> void searchByName(ArrayList<T> cr,String name) {
		for (T culturalFestival : cr) {
			if(((CulturalFestival) culturalFestival).getName().toLowerCase().indexOf(name)>=0) {
				System.out.println(culturalFestival);
			}
		}
	}
	
	public <T> void searchID(ArrayList<T> cr,int id){
		for (T culturalFestival : cr) {
			if(((CulturalFestival) culturalFestival).getId()==id) {
				System.out.println(culturalFestival);
			}
		}
	}

	
	
}
