package com.training.custom;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

//import com.training.ref.Employee;

public class FunDemo {
	public static void main(String[] args) {
		Consumer<String> con = (str) -> System.out.println(str.toUpperCase());
		con.accept("hisadik");
		Consumer<Integer> con1 = (str) -> System.out.println(str * 2);
		con1.accept(100);
		BiConsumer<String, Integer> con3 = (str, num) -> {

			System.out.println("name " + str.toUpperCase());
			System.out.println("salary " + num);
		};
		con3.accept("sadik", 10000);
		BiConsumer<Integer, Integer> biCon = (x, y) -> System.out.println("sum " + (x + y));
		System.out.println();
		biCon.accept(20, 25);
		BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println("product " + (x * y));
		System.out.println();
		biConsumer.accept(20, 25);
		Predicate<String> predicate = (str) -> str.equals("heloo");
		System.out.println(predicate.test("hello"));
		BiPredicate<String, String> bipredicate = (str1, str2) -> str1.equals(str2);
		System.out.println(bipredicate.test("hello", "hi"));
		Supplier<String> sup = () -> "greatt day";
		System.out.println(sup.get());
		Arrays.asList("java","html","javascrit","css","angular")
		.forEach(courseName->System.out.println(courseName.toUpperCase()));
		Arrays.asList("java","html","javascrit","css","angular")
		.forEach(System.out::println);
		Stream.generate(()->"priya").limit(5).forEach(str->System.out.println(str.toUpperCase()));
		System.out.println("function interface");
		
		Function<String, String>fun=str->str.toUpperCase();
		System.out.println(fun.apply("sadik"));
		
		Function<String, Integer>fun1=str->str.length();
		System.out.println(fun1.apply("vfislk"));
		
		Function<Integer, Integer>fun3=num->num*2;
        System.out.println(fun3.apply(10));
        
        Employee  employee=new Employee("raj", 23445, 90000, "Bangalore");
        Function<Employee,String>fun4=emp->emp.getName();
        System.out.println(fun4.apply(employee));
        
        Function<Employee,Integer>fun5=emp->emp.getEmployeeId();
        System.out.println(fun5.apply(employee));
       Function<String,Employee>fun6=str->
       {
       
          employee.setName(str);
        return employee;
        
       };
       System.out.println(fun4.apply(employee));
        
       Function<List<Employee>,List<String>>fun7=(employee->
       {
               List<String>name=employe.getEmployeeId();
              
       };
	}

}
