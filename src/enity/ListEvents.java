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

public class ListEvents<T> implements HistoryMethod<T> {
	public <T> void show(ArrayList<T> he){
		for (T historicEvents : he) {
			System.out.println(historicEvents);
		}
	}
	
	public <T> void searchByName(ArrayList<T> he,String name) {
		for (T historicEvents : he) {
			if(((HistoricEvents) historicEvents).getName().toLowerCase().indexOf(name.toLowerCase())>=0) {
				System.out.println(historicEvents);
			}
		}
	}
	
	public<T> void searchID(ArrayList<T> he,int id) {
		for (T historicEvents : he) {
			if(((HistoricEvents) historicEvents).getId()==id) {
				System.out.println(historicEvents);
			}
		}
	}

	
}
