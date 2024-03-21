public class Employee {

    String name;
    int age;
    String gender;     // в разборе тип char
    int salary;    // в разборе тип double

    String isSameName(Employee employee) {

        if (name.equals(employee.name)) {
            String result = "\nname: " + name
                    + "\nemployee.name: " + employee.name
                    + "\nisSameName: " + "true";
            return result;
        }

        return "";
    }

//    решение из разбора:
//    boolean isSameName(Employee otherEmployee) {
//        return name.equals(otherEmployee.name
//    }


}
