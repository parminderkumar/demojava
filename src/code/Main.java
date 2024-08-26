package code;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {
        //   streamApi();
        //denormalizeFamily();
        // dateTimeDemo();
        //ErrorCode errorCode = ErrorCode.INVALID_INPUT;
        //System.out.println("Error " + errorCode.name());
        //System.out.println("Error " + errorCode.getCode() + " " + errorCode.getMessage());
    }

    private static void dateTimeDemo() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("local date time " + localDateTime);
        Instant nowUtc = Instant.now();
        System.out.println("UTC date time " + nowUtc);
    }

    private static void denormalizeFamily() {
        List<DenormalizedFamily> denormalizedFamilyList = new ArrayList<>();
        List<Child> childList = new ArrayList<>();
        denormalizedFamilyList.add(new DenormalizedFamily("Ram", "Sudesh", "Sonu"));
        denormalizedFamilyList.add(new DenormalizedFamily("Ram", "Sudesh", "Monu"));
        denormalizedFamilyList.add(new DenormalizedFamily("Ram", "Sudesh", "babbu"));
        denormalizedFamilyList.add(new DenormalizedFamily("John", "Doe", "Brian"));
        denormalizedFamilyList.add(new DenormalizedFamily("John", "Doe", "Kris"));
        Map<String, List<DenormalizedFamily>> groupedOrders = denormalizedFamilyList.stream()
                .collect(Collectors.groupingBy(DenormalizedFamily::getFatherName));

        List<NormalizedFamily> normalizedFamilyList = groupedOrders.entrySet().stream()
                .map(entry -> new NormalizedFamily(
                        entry.getKey(),
                        entry.getValue().get(0).getMotherName(),
                        entry.getValue().stream().map(DenormalizedFamily -> new Child(DenormalizedFamily.getChildName())).collect(Collectors.toList())
                ))
                .collect(Collectors.toList());

        normalizedFamilyList.forEach(normalizedFamily -> {
            System.out.println("Father Name: " + normalizedFamily.getFatherName());
            System.out.println("Mother Name: " + normalizedFamily.getMotherName());
            System.out.println("Children: " + normalizedFamily.getChildren());
            System.out.println();
        });
    }

    private static void streamApi() {
        //Sample for stream API
        System.out.println("Hello world!");
        List<Integer> number = Arrays.asList(2, 3, 4, 5, 3);
        List<Integer> square = number.stream().map(x -> x * x).collect(toList());
        for (Integer i : square) {
            System.out.println(i);
        }
    }
}