package softserve.academy.edu14.HW2;

import java.util.*;

public class Employee {
    protected String name;

    protected static final Random RAND = new Random();

    public Employee(String name) {
        this.name = name;
    }

    public static Employee newRandomEmployee() {
        Names[] names = Names.values();
        int maxNameIndex = names.length;
        String randomName = names[RAND.nextInt(maxNameIndex)].name();
        String name = Character.toUpperCase(randomName.charAt(0)) + randomName.substring(1).toLowerCase();
        return new Employee(name);
    }

    public String getName() {
        return name;
    }

    public static Optional<String> mostPopularName(List<Employee> employees) {
        List<String> namesList = employees.stream()
                .map(Employee::getName)
                .distinct()
                .toList();
        List<Long> counterList = new ArrayList<>();

        for (String name : namesList) {
            counterList.add(employees.stream()
                    .filter(e -> e.getName().equals(name))
                    .count());
        }
        long maxValue = Collections.max(counterList);
        long occurrences = counterList.stream()
                .filter(e -> e == maxValue)
                .count();
        String name = null;
        if (occurrences == 1) {
            name = namesList.get(counterList.indexOf(maxValue));
            return Optional.ofNullable(name);
        }
        return Optional.ofNullable(name);
    }

    @Override
    public String toString() {
        return "Employee " + name;
    }
}
