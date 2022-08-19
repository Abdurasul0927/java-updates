package com.cydeo.task;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100,"Mike","mike@cydeo.com", Arrays.asList("202231232","123142112")),
                new Employee(100,"Ozzy","ozzy@cydeo.com", Arrays.asList("2041141232","12364512")),
                new Employee(100,"Peter","peter@cydeo.com", Arrays.asList("202231441","123142745"))
        );
    }
}
