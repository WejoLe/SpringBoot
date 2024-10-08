package ru.mikhailov.MyFirstTestAppSpringBoot.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class HelloController {
   @GetMapping("/hello")

    public String hello (@RequestParam(value = "name", defaultValue = "World") String name){
       return String.format("Hello %s!", name);
   }

    // 1. Метод для обновления ArrayList
    @GetMapping("/update-array")
    public String updateArrayList(@RequestParam String s) {
        arrayList.add(s);
        return "Added to ArrayList: " + s;
    }

    // 2. Метод для отображения элементов ArrayList
    @GetMapping("/show-array")
    public List<String> showArrayList() {
        return arrayList;
    }

    // 3. Метод для обновления HashMap
    @GetMapping("/update-map")
    public String updateHashMap(@RequestParam String s) {
        hashMap.put(mapKeyCounter++, s);
        return "Added to HashMap: " + s;
    }

    // 4. Метод для отображения элементов HashMap
    @GetMapping("/show-map")
    public Map<Integer, String> showHashMap() {
        return hashMap;
    }

    // 5. Метод для отображения количества элементов в ArrayList и HashMap
    @GetMapping("/show-all-length")
    public String showAllLength() {
        int arrayListSize = arrayList.size();
        int hashMapSize = hashMap.size();
        return "ArrayList size: " + arrayListSize + ", HashMap size: " + hashMapSize;
    }
}