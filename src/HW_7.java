public class HW_7 {

    public static void main(String[] args) {

//        Задача №1
//
//        Необходимо создать класс Person с полями: имя, возраст, пол.
//        Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ” если пол указан как мужской
//        и префикс “Mrs. ” если женский.

        Person prs1 = new Person();
        prs1.Name = "Alena";
        prs1.Age = 31;
        prs1.Gender = "female";

        Person prs2 = new Person();
        prs2.Name = "Artem";
        prs2.Age = 28;
        prs2.Gender = "male";

        Person prs3 = new Person();
        prs3.Name = "Gerasim";
        prs3.Age = 44;
        prs3.Gender = "male";

        Person[] prss = {prs1, prs2, prs3};

        for (int i = 0; i < prss.length; i++) {
            System.out.println("Name: " + prss[i].getName());
        }

        System.out.println();
        System.out.println("============================================================");
        System.out.println();

//        Задача №2
//
//        Необходимо создать класс Employee с полями
//        как у Person (из предыдущего задания) и поле зарплата.
//        Класс должен иметь метод isSameName(Employee employee),
//        который возвращает true, если у сотрудника, у которого был вызван метод,
//        и сотрудника, который был передан как параметр, одинаковое имя.

        Employee emp1 = new Employee();
        emp1.name = "Alena";
        emp1.age = 31;
        emp1.gender = "female";
        emp1.salary = 2300;

        Employee emp2 = new Employee();
        emp2.name = "Artem";
        emp2.age = 28;
        emp2.gender = "male";
        emp2.salary = 8900;

        Employee emp3 = new Employee();
        emp3.name = "Gerasim";
        emp3.age = 44;
        emp3.gender = "male";
        emp3.salary = 300;

        Employee emp4 = new Employee();
        emp4.name = "Alena";
        emp4.age = 31;
        emp4.gender = "female";
        emp4.salary = 4500;

        Employee[] emps = {emp1, emp2, emp3, emp4};

        for (int i = 0; i < emps.length; i++) {
            for (int j = 0; j < emps.length; j++) {
                if (emps[i].name == emps[j].name && emps[i] != emps[j]) {
                    System.out.println("RESULT " + (i+1) + " & " + (j+1) + emps[i].isSameName(emps[j]));
                    System.out.println();
                }
            }
        }

//        Задача №3
//
//        Необходимо создать класс Salary
//        с единственным методом - getSum(Employee[] employeeArray),
//        метод должен возвращать сумму зарплат всех сотрудников
//        из массива, переданного в качестве аргумента вызова метода.

        Employee[] employeeArray = {emp1, emp2, emp3, emp4};

        System.out.println("Сумма зарплат: " + Salary.getSum(employeeArray));

    }
}
