package enity;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ListSites<T> implements HistoryMethod<T> {
	public <T> void show(ArrayList<T> hs){
		for (T historicalSites : hs) {
			System.out.println(historicalSites);
		}
	}
	
	public <T> void searchByName(ArrayList<T> hs,String name){
		for (T historicalSites : hs) {
			if(((HistoricalSites) historicalSites).getName().toLowerCase().indexOf(name.toLowerCase())>=0){
				System.out.println(historicalSites);
			}
		}
	}
	
	public HistoricalSites searchByName1(ArrayList<HistoricalSites> hs,String name)  {
		for (HistoricalSites historicalSites : hs) {
			if(historicalSites.getName().toLowerCase().indexOf(name.toLowerCase())>=0) {
				return historicalSites;
			}
		}
		return null;
	}
	
	public <T> void searchID(ArrayList<T> hs,int id)  {
		for (T historicalSites : hs) {
			if(((HistoricalSites) historicalSites).getId()==id) {
				System.out.println(historicalSites);
			}
		}
	}


	
}
