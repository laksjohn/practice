package com.example.interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExamples {

        public static void main (String[] args){

            Employee e1 = new Employee(1,"abcd","A",1000);
            Employee e2 = new Employee(2,"cde","B",2000);
            Employee e3 = new Employee(3,"x","B",1000);




            List<Employee> employeeList = new ArrayList<>();
            employeeList.add(e1);
            employeeList.add(e2);
            employeeList.add(e3);

            //Filtering
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            List<Integer> evenNumbers = numbers.stream().filter(n ->n%2==0).collect(Collectors.toList());

            //Reducing

            int sum = numbers.stream().reduce(0,Integer::sum);
            //Mapping
            List<String> words = Arrays.asList("hello", "world");

            //Word Count
            Map<String,Long> wordMap = words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

            List<Integer> wordList = words.stream().map(String::length).collect(Collectors.toList());


            employeeList.stream().forEach(employee -> employee.getName());
           //return emplyee name list
            System.out.println(employeeList.stream().map(employee -> employee.getName()).toList());
            System.out.println(employeeList.stream().map(Employee::getName).toList());
            System.out.println(employeeList.stream().map(Employee::getName).collect(Collectors.toList()));

            //return map with id as key employee as value

            System.out.println(employeeList.stream().collect(Collectors.toMap(employee -> employee.getId(),employee -> employee)));


            employeeList.stream().collect(Collectors.groupingBy(Employee::getDept)).entrySet().stream()
                    .forEach(es -> System.out.println("Dept :"+ es.getKey() + " Employees:" + es.getValue().stream().map(Employee::getName).collect(Collectors.toList())));


            //Calculate average salary
            Map<String,Double> avgMap=  employeeList.stream()
                    .collect(Collectors.groupingBy(employee -> employee.getDept(), Collectors.averagingDouble(Employee::getSalary)));

            avgMap.forEach( (dept,sal) -> System.out.println("dept:" + dept + "salary:" +sal ));

            //Filter
            employeeList.stream().filter(employee -> employee.getSalary()>1000).forEach(employee -> System.out.println(employee.getSalary()));

            //Sort
            employeeList.stream().sorted(Comparator.comparing(employee -> employee.getSalary())).forEach(employee -> System.out.println(employee.getSalary()));

            //Max

            employeeList.stream().max(Comparator.comparing(employee -> employee.getSalary())).ifPresent(System.out::println);
        }


}

