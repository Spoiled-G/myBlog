package com.myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.myblog11.Login;

//import static com.sun.beans.introspect.PropertyInfo.Name.bound;

public class TestClass1 {
    public static void main(String[] args) {

//        Predicate<Integer> val = x->x%2==0;
//        boolean result = val.test(9);
//        System.out.println(result);

//        Predicate<String> val = str->str.equals("Mike");
//        boolean result = val.test("Stalin");
//        System.out.println(result);

//        List<Integer> numbers = Arrays.asList(10, 21, 54, 8, 9, 80, 81);
//        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
//        System.out.println(evenNumbers);

//        List<String> name = Arrays.asList("Mike", "Mohan", "Stalin", "Shyqa");
//        List<String> data1 = name.stream().filter(n -> n.startsWith("S")).collect(Collectors.toList());
//        List<String> data2 = name.stream().filter(n -> n.equals("Mike")).collect(Collectors.toList());
//        List<String> data3 = name.stream().filter(n -> n.endsWith("a")).collect(Collectors.toList());
//        System.out.println(data1);
//        System.out.println(data2);
//        System.out.println(data3);


//        Function<String,Integer> result = str->str.length();
//        Integer val = result.apply("Stallin");
//        System.out.println(val);
//

//        Function<Integer,Integer> data = i->i + 10;
//        Object val = data.apply(20);
//        System.out.println(val);

//        List<Integer> list = Arrays.asList(10, 20, 30, 40);
//        List<Integer> collect = list.stream().map(i -> i + 10).collect(Collectors.toList());
//        System.out.println(collect);

//        List<String> list = Arrays.asList("Mike", "stallin", "Adam");
//        List <String> newD = list.stream().map(i -> i.toUpperCase()).collect(Collectors.toList());
//        System.out.println(newD);


//        List<String> list = Arrays.asList("Mike", "stallin", "Adam");
//        List<String> collect = list.stream().sorted().collect(Collectors.toList());
//        System.out.println(collect);


//        List<Integer> list = Arrays.asList(20,33,8,9,66,12,24);
//        List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
//       System.out.println(collect);

//
//        List<Integer> list = Arrays.asList(20,33,8,9,66,12,24,33,8,11,20);
//        List<Integer> newD = list.stream().distinct().collect(Collectors.toList());
//        System.out.println(newD);

//        List<Integer> numbers = Arrays.asList(13, 45, 19, 17, 100, 90,24,81,15);
//
//        List<Integer> result = numbers.stream().filter(i -> i.toString().startsWith("1")).collect(Collectors.toList());
//
//               System.out.println(result);
//

//        Consumer<Integer> result = number-> System.out.println(number);
//        result.accept(100);

//        List<String> names = Arrays.asList("mike", "adam", "sam"); ////FOR EACH
//        Consumer<String> val = name-> System.out.println(name);
//        names.forEach(val);


//        Supplier<Integer> x = ()-> new Random().nextInt(); ////// Supllier
//        Integer y = x.get();
//        System.out.println(y);

////////////copying login to dto using stream api
//        List<Login> logins = Arrays.asList(new Login("Mike","testing"),
//                new Login("Adam","testing"),
//                (new Login("Stallin","testing")));
//
//        List<LoginDto> dtos = logins.stream().map(login -> mapToDto(login)).collect(Collectors.toList());
//        System.out.println(dtos
//        );
//
//
//    }
//       static  LoginDto mapToDto(Login login){
//        LoginDto dto = new LoginDto();
//        dto.setUsername(login.getUsername());
//        dto.setPassword(login.getPassword());
//        return dto;



        ///// example for filtering Employees by age...

//List <Employee> employees = Arrays.asList(new Employee("adam",25,"Ranchi"),
//        new Employee ("mike",30,"Ranchi"),
//        new Employee("stallin",32,"Banglore"),
//        new Employee("sam",31,"Banglore"));

//        List<Employee> eage = employees.stream().filter(emp -> emp.getAge() > 30).collect(Collectors.toList());
//        for (Employee e:eage){
//            System.out.println(e.getName());
//            System.out.println(e.getCity());
//            System.out.println(e.getAge());;
//        }

        /////// example for filtering names starts with a

//

        /////// filter the even numbers  and convert the given integers into square

        List<Integer> num = Arrays.asList(12, 4, 7, 9, 14, 6, 8);
        List<Integer> collected = num.stream().filter(n1 -> n1 % 2 == 0).map(n2 -> n2 * 2).collect(Collectors.toList());
        System.out.println(collected);
    }


    }

