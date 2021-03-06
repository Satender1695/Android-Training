package com.gurles.utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *  This class defines basic JSON data functions
 *  @author Ankur Parashar(ankur@finoit.com)
 *
 */
public class JSONUtils {
		
	public static JSONObject getJSONObject(String data){
		
		if(data!=null)
			try {
				return new JSONObject(data);
			} 
			catch (JSONException e) {
				e.printStackTrace();
			}
		
		return null;
		
	}
	
	public static JSONObject getJSONObject(JSONObject data, String key){
		
		if(data!=null)
			try {
				return data.getJSONObject(key);
			} 
			catch (JSONException e) {
				e.printStackTrace();
			}
		return null;
		
	}
	
	public static JSONObject getJSONObject(JSONArray data, int index){
		
		if(data!=null)
			try {
					return data.getJSONObject(index);
			} 
			catch (JSONException e) {
				e.printStackTrace();
			}
		return null;
		
	}
	
	public static String getStringObject(JSONArray data, int index){
		
		if(data!=null)
			try {
					return data.getString(index);
			} 
			catch (JSONException e) {
				e.printStackTrace();
			}
		return null;
		
	}
	
	public static JSONArray getJSONArray(JSONObject data, String key){
			
		if(data!=null)
			try {
				return data.getJSONArray(key);
			}
			catch (JSONException e) {
					e.printStackTrace();
			}
			
		return null;
			
	}
	
	public static JSONArray getJSONArray(String data){
		
		if(data!=null)
			try {
				return new JSONArray(data);
			}
			catch (JSONException e) {
					e.printStackTrace();
			}
			
		return null;
			
	}
	
	public static String getStringfromJSON(JSONObject object, String key){
		
			if( object!=null )
				try {
					return object.getString(key);
				}
				catch (JSONException e) {
					e.printStackTrace();
				}
		
			return key;
		
	}
	
	public static int getIntegerfromJSON(JSONObject object, String key){
		
		if( object!=null )
			try {
				return object.getInt(key);
			}
			catch (JSONException e) {
				e.printStackTrace();
			}
	
		return -1;
	
	}
	
	public static long getLongfromJSON(JSONObject object, String key){
		
		if( object!=null )
			try {
				return object.getLong(key);
			}
			catch (JSONException e) {
				e.printStackTrace();
			}
	
		return -1;
	
	}
	
	public static void putStringInJSON(JSONObject object, String key, String value){
		
		if( object!=null )
				try {
					object.put(key, value);
				}
				catch (JSONException e) {
					e.printStackTrace();
				}
	
	}
	
}