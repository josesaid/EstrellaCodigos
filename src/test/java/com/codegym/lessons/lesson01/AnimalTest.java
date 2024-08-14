package com.codegym.lessons.lesson01;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.codegym.lessons.module02.lesson06.EmployeeRepository;
import org.junit.AfterClass;
import org.junit.Test;
import com.codegym.lessons.module02.lesson06.Employee;
import com.codegym.lessons.module02.lesson06.User;

import java.util.*;
import java.util.logging.Logger;
import static org.junit.Assert.*;


public class AnimalTest {
    private User user;
    static Logger logger = Logger.getLogger(AnimalTest.class.getName());

    final private static String fileName = "src/test/resources/test.txt";

    final private static Employee[] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 100000.0),
            new Employee(2, "Bill Gates", 200000.0),
            new Employee(3, "Mark Zuckerberg", 300000.0)
    };

    final private static List<Employee> empList = Arrays.asList(arrayOfEmps);
    final private static EmployeeRepository employeeRepository = new EmployeeRepository(empList);


    @Test(expected = NoSuchElementException.class)
    public void whenCreateEmptyOptional_thenNull() {
        Optional<User> emptyOpt = Optional.empty();
        emptyOpt.get();
    }


    @AfterClass
    public static void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(fileName));
    }

    @Test
    public void whenGetStreamFromList_ObtainStream() {
        assert(empList.stream() instanceof Stream<?>);
    }

    @Test
    public void whenGetStreamFromArray_ObtainStream() {
        assert(Stream.of(arrayOfEmps) instanceof Stream<?>);
    }

    @Test
    public void whenGetStreamFromElements_ObtainStream() {
        assert(Stream.of(arrayOfEmps[0], arrayOfEmps[1], arrayOfEmps[2]) instanceof Stream<?>);
    }

    @Test
    public void whenBuildStreamFromElements_ObtainStream() {
        Stream.Builder<Employee> empStreamBuilder = Stream.builder();

        empStreamBuilder.accept(arrayOfEmps[0]);
        empStreamBuilder.accept(arrayOfEmps[1]);
        empStreamBuilder.accept(arrayOfEmps[2]);

        Stream<Employee> empStream = empStreamBuilder.build();

        assert(empStream instanceof Stream<?>);
    }

    @Test
    public void whenIncrementSalaryForEachEmployee_thenApplyNewSalary() {
        Employee jeff = new Employee(1, "Jeff Bezos", 100_000.0);
        Employee bill = new Employee(2, "Bill Gates", 200_000.0);
        Employee[] arrayOfEmps = {
                jeff,
                bill,
                new Employee(3, "Mark Zuckerberg", 300_000.0)
        };

        List<Employee> empList = Arrays.asList(arrayOfEmps);
        /*for(Employee e : empList){
            e.salaryIncrement(10.0);
        }*/

        empList.stream().forEach( e -> e.salaryIncrement(10.0) );

        //Si la colección "empList" tiene empleados, entonces debo preguntar si "contiene" solo empleados, no algún
        //objeto diferente
        if ( empList.contains(jeff) ){
            logger.info("found");
        }else {
            logger.warning("not found");
        }

    }

    @Test
    public void whenIncrementSalaryUsingPeek_thenApplyNewSalary() {
        Employee jeff = new Employee(1, "Jeff Bezos", 100000.0);
        Employee[] arrayOfEmps = {
                jeff,
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        };

        List<Employee> empList = Arrays.asList(arrayOfEmps);

        empList.stream()
                .peek(e -> e.salaryIncrement(10.0))
                .peek(System.out::println)
                .collect(Collectors.toList());

        if (empList.contains(jeff)){
            logger.info("found");
        }else {
            logger.warning("not found");
        }
    }

    @Test
    public void whenMapIdToEmployees_thenGetEmployeeStream() {
        Integer[] empIds = { 1, 2, 3 , 4};

        List<Employee> employees = Stream.of(empIds)
                .map(employeeRepository::findById)
                .collect(Collectors.toList());

        System.out.println("employees.size: " + employees.size());

        /*

        for(Employee  e: employees){
            System.out.println("ID:  " + e.getId());
            System.out.println("Salary: " + e.getSalary());
        }*/

        assertEquals(employees.size(), empIds.length);
        //assertNull(employees.get(employees.size()-1));
    }

    public static boolean cadenaEsMayorACero(String cadena){
        return cadena.length() > 0;
    }

    @Test
    public void whenFlatMapEmployeeNames_thenGetNameStream() {
        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg"));

        List<String> namesFlatStream = namesNested.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        /*for(String name : namesFlatStream){
            System.out.println("name : " + name);
        }*/

        //long size = namesNested.stream().flatMap(Collection::stream).count();
        //System.out.println("size: " + size);
        List<String> listWithoutDuplicates = namesNested.stream()
                .flatMap(Collection::stream)
                .filter(AnimalTest::cadenaEsMayorACero)
                .filter( (e) -> e.contains("s"))
                //.filter(i -> i.length() > 0)
                .filter((paola) -> paola != null)
                .distinct()
                .peek(System.out::println)
                .collect(Collectors.toList());

        long size = listWithoutDuplicates.size();
        System.out.println("6- listWithoutDuplicates size pero tiene S en su contenido: " + size);
        System.out.println("------------------------------------ lo de abajo es otra cosa...");
        //----------------------
        List<String> namesFlatStream2 = namesNested.stream()
                .flatMap(Collection::stream)
                .peek(System.out::println)
                .collect(Collectors.toList());


        System.out.println("namesFlatStream.size(): " + namesFlatStream.size());
        System.out.println("namesNested.size() * 2: " + namesNested.size() * 2);
        assertEquals(namesFlatStream.size(), namesNested.size() * 2);
    }

    @Test
    public void whenFilterEmployees_thenGetFilteredStream() {
        Integer[] empIds = { 1, 2, 3, 4 };

        List<Employee> employees = Stream.of(empIds)
                .map(employeeRepository::findById)
                .filter(e -> e != null)
                .filter(e -> e.getSalary() > 200_000)
                .collect(Collectors.toList());

        Employee mark = arrayOfEmps[2];
        System.out.println("employees.size: " + employees.size());
        assertEquals(Arrays.asList(mark), employees);
    }

    @Test(expected = NullPointerException.class)
    public void whenFindFirst_thenGetFirstEmployeeInStream() {
        Integer[] empIds = { 1, 2, 3, 4 };

        Employee employee = Stream.of(empIds)
                .map(employeeRepository::findById)
                .filter(e -> e != null)
                .filter(e -> e.getSalary() > 500_000)
                //.findFirst()
                .findAny()
                .orElse(null);

        //assertEquals(employee.getSalary(), new Double(200000));
        if(employee.getSalary() >= 200_000){
            logger.info("el salario es <= 200k - Salario: " + employee.getSalary() );
        }else{
            logger.warning("DIFERENTES");
        }
    }

    @Test
    public void whenCollectStreamToList_thenGetList() {
        List<Employee> employees = empList.stream().collect(Collectors.toList());

        assertEquals(empList, employees);
    }

    @Test
    public void whenStreamToArray_thenGetArray() {
        Employee[] employees = empList
                .stream()
                .toArray(Employee[]::new);

        assertThat(empList.toArray(), equalTo(employees));
    }

    @Test
    public void whenStreamCount_thenGetElementCount() {
        Long empCount = empList.stream()
                .filter(e -> e.getSalary() > 200000)
                .count();

        System.out.println(empCount ==1 ?"UN EMPLEADO":" NINGUN EMPLEADO");
    }

    @Test
    public void whenLimitInfiniteStream_thenGetFiniteElements() {
        Stream<Integer> infiniteStream = Stream.iterate(2, i -> i * 2);

        List<Integer> collect = infiniteStream
                .skip(3)
                .limit(5)
                .collect(Collectors.toList());

        assertEquals(collect, Arrays.asList(16, 32, 64, 128, 256));
    }

    @Test
    public void whenSortStream_thenGetSortedStream() {
        List<Employee> employees = empList.stream()
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .collect(Collectors.toList());

        assertEquals(employees.get(0).getName(), "Bill Gates");
        assertEquals(employees.get(1).getName(), "Jeff Bezos");
        assertEquals(employees.get(2).getName(), "Mark Zuckerberg");
    }


    @Test
    public void whenFindMin_thenGetMinElementFromStream() {
        Employee firstEmp = empList.stream()
                .min((e1, e2) -> e1.getId() - e2.getId())
                .orElseThrow(NoSuchElementException::new);

        System.out.println(firstEmp.getId() == 1 ?"UN EMPLEADO":" NINGUN EMPLEADO");
    }

    @Test
    public void whenFindMax_thenGetMaxElementFromStream() {
        Employee maxSalEmp = empList.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow(NoSuchElementException::new);

        System.out.println(maxSalEmp.getSalary() == 300_000 ? "IGUALES" : "DIFERENTES");
    }

    @Test
    public void whenApplyDistinct_thenRemoveDuplicatesFromStream() {
        List<Integer> intList = Arrays.asList(2, 5, 3, 2, 4, 3);
        List<Integer> distinctIntList = intList.stream().distinct().collect(Collectors.toList());

        assertEquals(distinctIntList, Arrays.asList(2, 5, 3, 4));
    }

    @Test
    public void whenApplyMatch_thenReturnBoolean() {
        List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);

        boolean allEven = intList.stream().allMatch(i -> i % 2 == 0);
        boolean oneEven = intList.stream().anyMatch(i -> i % 2 == 0);
        boolean noneMultipleOfThree = intList.stream().noneMatch(i -> i % 3 == 0);

        assertEquals(allEven, false);
        assertEquals(oneEven, true);
        assertEquals(noneMultipleOfThree, false);
    }

    @Test
    public void whenFindMaxOnIntStream_thenGetMaxInteger() {
        Integer latestEmpId = empList.stream()
                .mapToInt(Employee::getId)
                .max()
                .orElseThrow(NoSuchElementException::new);

        System.out.println(latestEmpId.intValue() == 1 ? "UN EMPLEADO" : " NINGUN EMPLEADO");
    }

    @Test
    public void whenApplySumOnIntStream_thenGetSum() {
        Double avgSal = empList.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElseThrow(NoSuchElementException::new);

        System.out.println(avgSal.doubleValue() == 200_000 ? "IGUALES" : "DIFERENTES");
    }

    @Test
    public void whenApplyReduceOnStream_thenGetValue() {
        Double sumSal = empList.stream()
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);

        System.out.println(sumSal.doubleValue() == 600_000 ? "salario 600k" : "Other salary amount: " + sumSal.doubleValue() );
    }

    @Test
    public void whenCollectByJoining_thenGetJoinedString() {
        String empNames = empList.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", "))
                .toString();

        assertEquals(empNames, "Jeff Bezos, Bill Gates, Mark Zuckerberg");
    }

    @Test
    public void whenCollectBySet_thenGetSet() {
        Set<String> empNames = empList.stream()
                .map(Employee::getName)
                .collect(Collectors.toSet());

        assertEquals(empNames.size(), 3);
    }

    @Test
    public void whenToVectorCollection_thenGetVector() {
        Vector<String> empNames = empList.stream()
                .map(Employee::getName)
                .collect(Collectors.toCollection(Vector::new));

        assertEquals(empNames.size(), 3);
    }

    @Test
    public void whenApplySummarizing_thenGetBasicStats() {
        DoubleSummaryStatistics stats = empList.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));

        assertEquals(stats.getCount(), 3);
        assertEquals(stats.getSum(), 600000.0, 0);
        assertEquals(stats.getMin(), 100000.0, 0);
        assertEquals(stats.getMax(), 300000.0, 0);
        assertEquals(stats.getAverage(), 200000.0, 0);
    }

    @Test
    public void whenApplySummaryStatistics_thenGetBasicStats() {
        DoubleSummaryStatistics stats = empList.stream()
                .mapToDouble(Employee::getSalary)
                .summaryStatistics();

        assertEquals(stats.getCount(), 3);
        assertEquals(stats.getSum(), 600000.0, 0);
        assertEquals(stats.getMin(), 100000.0, 0);
        assertEquals(stats.getMax(), 300000.0, 0);
        assertEquals(stats.getAverage(), 200000.0, 0);
    }

    @Test
    public void whenStreamPartition_thenGetMap() {
        List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);
        Map<Boolean, List<Integer>> isEven = intList.stream().collect(
                Collectors.partitioningBy(i -> i % 2 == 0));

        assertEquals(isEven.get(true).size(), 4);
        assertEquals(isEven.get(false).size(), 1);
    }

    /*
    @Test
    public void whenStreamGroupingBy_thenGetMap() {
        Map<Character, List<Employee>> groupByAlphabet = empList.stream().collect(
                Collectors.groupingBy(e -> new Character(e.getName().charAt(0))));

        assertEquals(groupByAlphabet.get('B').get(0).getName(), "Bill Gates");
        assertEquals(groupByAlphabet.get('J').get(0).getName(), "Jeff Bezos");
        assertEquals(groupByAlphabet.get('M').get(0).getName(), "Mark Zuckerberg");
    }

    @Test
    public void whenStreamMapping_thenGetMap() {
        Map<Character, List<Integer>> idGroupedByAlphabet = empList.stream().collect(
                Collectors.groupingBy(e -> new Character(e.getName().charAt(0)),
                        Collectors.mapping(Employee::getId, Collectors.toList())));

        assertEquals(idGroupedByAlphabet.get('B').get(0), new Integer(2));
        assertEquals(idGroupedByAlphabet.get('J').get(0), new Integer(1));
        assertEquals(idGroupedByAlphabet.get('M').get(0), new Integer(3));
    }*/

    @Test
    public void whenStreamReducing_thenGetValue() {
        Double percentage = 10.0;
        Double salIncrOverhead = empList.stream().collect(Collectors.reducing(
                0.0, e -> e.getSalary() * percentage / 100, (s1, s2) -> s1 + s2));

        assertEquals(salIncrOverhead, 60000.0, 0);
    }

    /*
    @Test
    public void whenStreamGroupingAndReducing_thenGetMap() {
        Comparator<Employee> byNameLength = Comparator.comparing(Employee::getName);

        Map<Character, Optional<Employee>> longestNameByAlphabet = empList.stream().collect(
                Collectors.groupingBy(e -> new Character(e.getName().charAt(0)),
                        Collectors.reducing(BinaryOperator.maxBy(byNameLength))));

        assertEquals(longestNameByAlphabet.get('B').get().getName(), "Bill Gates");
        assertEquals(longestNameByAlphabet.get('J').get().getName(), "Jeff Bezos");
        assertEquals(longestNameByAlphabet.get('M').get().getName(), "Mark Zuckerberg");
    }
     */
    @Test
    public void whenParallelStream_thenPerformOperationsInParallel() {
        Employee[] arrayOfEmps = {
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        };

        List<Employee> empList = Arrays.asList(arrayOfEmps);

        empList.stream().parallel().forEach(e -> e.salaryIncrement(10.0));

        if(empList.contains(new Employee(1, "Jeff Bezos", 110_000.0))){
            System.out.println("Empleado con incremento salaril del 10%");
        }else{
            System.out.println("Empleado sin incremento salarial");
        }
    }

    @Test
    public void whenGenerateStream_thenGetInfiniteStream() {
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
    }

    @Test
    public void whenIterateStream_thenGetInfiniteStream() {
        Stream<Integer> evenNumStream = Stream.iterate(2, i -> i * 2);

        List<Integer> collect = evenNumStream
                .limit(5)
                .collect(Collectors.toList());

        assertEquals(collect, Arrays.asList(2, 4, 8, 16, 32));
    }

    @Test
    public void whenStreamToFile_thenGetFile() throws IOException {
        String[] words = {
                "hello",
                "refer",
                "world",
                "level"
        };

        try (PrintWriter pw = new PrintWriter(
                Files.newBufferedWriter(Paths.get(fileName)))) {
            Stream.of(words).forEach(pw::println);
        }
    }

    private List<String> getPalindrome(Stream<String> stream, int length) {
        return stream.filter(s -> s.length() == length)
                .filter(s -> s.compareToIgnoreCase(
                        new StringBuilder(s).reverse().toString()) == 0)
                .collect(Collectors.toList());
    }

    /*@Test
    public void whenFileToStream_thenGetStream() throws IOException {
        whenStreamToFile_thenGetFile();

        List<String> str = getPalindrome(Files.lines(Paths.get(fileName)), 5);
        assertThat(str, contains("refer", "level"));
    }*/

    @Test(expected = NullPointerException.class)
    public void whenCreateOfEmptyOptional_thenNullPointerException() {
        Optional<User> opt = Optional.of(user);
    }

    @Test
    public void whenCreateOfNullableOptional_thenOk() {
        String name = "John";
        Optional<String> opt = Optional.ofNullable(name);
        assertEquals("John", opt.get());
    }

    @Test
    public void whenCheckIsPresent_thenOk() {
        user = new User("john@gmail.com", "1234");
        Optional<User> opt = Optional.ofNullable(user);
        assertTrue(opt.isPresent());

        assertEquals(user.getEmail(), opt.get().getEmail());
    }

    @Test
    public void whenCheckIfPresent_thenOk() {
        user = new User("john@gmail.com", "1234");
        Optional<User> opt = Optional.ofNullable(user);
        assertTrue(opt.isPresent());

        opt.ifPresent(u -> assertEquals(user.getEmail(), u.getEmail()));
    }

    @Test
    public void whenEmptyValue_thenReturnDefault() {
        User user = null;
        User user2 = new User("anna@gmail.com", "1234");
        User result = Optional.ofNullable(user).orElse(user2);

        assertEquals("anna@gmail.com", result.getEmail());
    }

    @Test
    public void whenValueNotNull_thenIgnoreDefault() {
        User user = new User("john@gmail.com", "1234");
        User user2 = new User("anna@gmail.com", "1234");
        User result = Optional.ofNullable(user).orElse(user2);

        assertEquals("john@gmail.com", result.getEmail());
    }

    @Test
    public void whenSetDefaultOrElseGet_thenOk() {
        User user = null;
        User user2 = new User("anna@gmail.com", "1234");
        User result = Optional.ofNullable(user).orElseGet(() -> user2);

        assertEquals("anna@gmail.com", result.getEmail());
    }

    @Test
    public void givenPresentValue_whenCompare_thenOk() {
        User user = new User("john@gmail.com", "1234");
        logger.info("Using orElse");
        User result = Optional.ofNullable(user).orElse(createNewUser());
        logger.info("Using orElseGet");
        User result2 = Optional.ofNullable(user).orElseGet(() -> createNewUser());
    }

    private User createNewUser() {
        logger.info("Creating New User");
        return new User("extra@gmail.com", "1234");
    }

    @Test
    public void givenEmptyValue_whenCompare_thenOk() {
        User user = null;
        logger.info("Using orElse");
        User result = Optional.ofNullable(user).orElse(createNewUser());
        logger.info("Using orElseGet");
        User result2 = Optional.ofNullable(user).orElseGet(() -> createNewUser());
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenThrowException_thenOk() {
        User result = Optional.ofNullable(user).orElseThrow(() -> new IllegalArgumentException());
    }

    @Test
    public void whenMap_thenOk() {
        user = new User("anna@gmail.com", "1234");
        String email = Optional.ofNullable(user).map(u -> u.getEmail()).orElse("default@gmail.com");
        assertEquals(email, user.getEmail());

    }

    @Test
    public void whenFlatMap_thenOk() {
        user = new User("anna@gmail.com", "1234");
        user.setPosition("Developer");
        String position = Optional.ofNullable(user).flatMap(u -> u.getPosition()).orElse("default");
        assertEquals(position, user.getPosition().get());

    }

    @Test
    public void whenFilter_thenOk() {
        user = new User("anna@gmail.com", "1234");
        Optional<User> result = Optional.ofNullable(user)
                .filter(u -> u.getEmail() != null && u.getEmail().contains("@"));

        assertTrue(result.isPresent());
    }

    @Test
    public void whenStream_thenOk() {
        List<User> users = new ArrayList<>();
        User user = users.stream().findFirst().orElse(new User("default", "1234"));
        assertEquals(user.getEmail(), "default");
    }
}
