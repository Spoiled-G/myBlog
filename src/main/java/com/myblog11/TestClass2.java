package com.myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestClass2 {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee("adam", 25, "Ranchi"),
            new Employee("mike", 30, "Ranchi"),
            new Employee("stallin", 32, "Banglore"),
            new Employee("sam", 31, "Banglore"));

        Map<String, List<Employee>> cityI = employees.stream().collect(Collectors.groupingBy(e -> e.getCity()));

       for (Map.Entry<String, List<Employee>> entry:cityI.entrySet()){
           String key = entry.getKey();
           List<Employee> value = entry.getValue();
           for (Employee t:value){
               System.out.println(t.getName());
               System.out.println(t.getAge());
               System.out.println(t.getCity());

           }
       }


    }
}
