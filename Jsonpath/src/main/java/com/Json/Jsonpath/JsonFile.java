package com.Json.Jsonpath;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFile {
	public static void main(String[] args) throws IOException, ParseException {
		
		JSONParser jsonParser = new JSONParser();
		Object object;
		
		object=jsonParser.parse(new FileReader("C:\\Users\\Yuga\\eclipse-workspace\\Jsonpath\\file.json"));
		JSONObject jsonObject=(JSONObject) object;
		
		JSONObject result=(JSONObject) jsonObject.get("result");
		JSONObject event=(JSONObject) result.get("event");
		
		String date=(String) event.get("date");
		String desc=(String) event.get("description");
		String lang=(String) event.get("lang");
		String category1=(String) event.get("category1");
		String category2=(String) event.get("category2");
		String granularity=(String) event.get("granularity");
		
		
		data d=new data();
		d.setDate(date);
		d.setDesc(desc);
		d.setLang(lang);
		d.setCategory1(category1);
		d.setCategory2(category2);
		d.setGranularity(granularity);
		
		
		System.out.println("Date        : "+d.getDate());
		System.out.println("Description : "+d.getDesc());
		System.out.println("lang        : "+d.getLang());
		System.out.println("Category1   : "+d.getCategory1());
		System.out.println("Category2   : "+d.getCategory2());
		System.out.println("Gratularity : "+d.getGranularity());
		
		
		
			
	}
}
