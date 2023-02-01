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

public class PeriodLists<T> implements HistoryMethod<T> {
	
	public <T> void show(ArrayList<T> pe) {
		for (T period : pe) {
			System.out.println(period);
		}
	}
	
	public <T> void searchByName(ArrayList<T> pe,String name) {
		for (T period : pe) {
			if(((Period) period).getName().toLowerCase().indexOf(name.toLowerCase())>=0) {
				System.out.println(period);
			}
		}
	}
	
	public <T> void searchID(ArrayList<T> pe,int id) {
		for (T period : pe) {
			if(((Period) period).getId()==id) {
				System.out.println(period);
		}
	}
	}
	
	public void searchRelatePersonage(ArrayList<Period> pr,String name) {
		ArrayList<Personage>pe = new ArrayList<Personage>();
		for (Period period : pr) {
			pe = period.getPersonageList();
			for (Personage personage : pe) {
				if(personage.getName().toLowerCase().indexOf(name.toLowerCase())>=0) {
					System.out.println(personage);
				}
			}
		}
	}
	
	public void searchRelateSite(ArrayList<Period> pr,int id) {
		ArrayList<HistoricalSites> hs = new ArrayList<HistoricalSites>();
		for (Period period : pr) {
			hs = period.getHistoricSites();
			System.out.println(hs.toArray()[id]);
		}
	}
}
