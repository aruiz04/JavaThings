package HMW13;

import java.util.HashMap;
import  java.util.Map;
public class GenericMap<T> {
    private Map<Object, Object> map;
    public void Print(){
        System.out.println(map);
    }
    public GenericMap(T key) {
        map  = new HashMap<Object, Object>();
    }
    public  void Put(T key, T value){
        map.put(key ,value);
    }
}
