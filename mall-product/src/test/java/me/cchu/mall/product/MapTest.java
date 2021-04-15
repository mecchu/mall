package me.cchu.mall.product;

import org.junit.Test;

import java.util.HashMap;

public class MapTest {


    @Test
    public void map() {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("a", 1);
        objectObjectHashMap.get("a");
    }

}
