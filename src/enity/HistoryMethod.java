package enity;

import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.parser.ParseException;

public interface HistoryMethod <T> {
	public<T> void show(ArrayList<T> hs) ;
	public<T> void searchByName(ArrayList<T> hs,String name) ;
	public<T> void searchID(ArrayList<T> hs,int ID) ;
}
