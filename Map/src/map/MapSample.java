package map;

import java.util.HashMap;
import java.util.Map;
public class MapSample {
	public static void main(String[]args){
		Map<String,String>map=new HashMap<String,String>();
		map.put("key1","value1");
		map.put("key2","value2");
		map.put("key3","value3");
		map.put("key4", "value4");
		map.put("key5","value5");

		String value=map.get("key1");
		System.out.println("value");

		String valueNull =map.get("key6");
		System.out.println(valueNull);

		//mapに該当keyがあるかのチェックもさせられる。
		if(map.containsKey("key1")){
		  System.out.println("key1は存在");
		}else{
		System.out.println("key1は存在しない");
		}

		//拡張for文のやり方
		for(Map.Entry<String,String>e:map.entrySet()){
		 System.out.println(e.getKey()+":"+e.getValue());
		}
	}

}
