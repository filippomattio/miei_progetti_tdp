package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	TreeMap<String,String> map;
		
	public Parole() {
		//TODO
		map = new TreeMap<String,String>();
		}
	
	public void addParola(String p) {
		//TODO
		if(map.get(p)==null)
			map.put(p, p);
		}
	
	public List<String> getElenco() {
		//TODO
		List<String> l = new LinkedList<String>(map.values());
		return l;
	}
	
	public void reset() {
		// TODO
		map.clear();
	}

	public void cancella(String s) {
		// TODO Auto-generated method stub
		if(this.map.get(s)!=null)
		this.map.remove(s);
		}

}
