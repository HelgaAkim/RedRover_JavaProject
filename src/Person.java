public class Person {

//        Задача №1
//
//        Необходимо создать класс Person с полями: имя, возраст, пол.
//        Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ” если пол указан как мужской
//        и префикс “Mrs. ” если женский.

    String Name;
    int Age;
    String Gender;     // в разборе тип char

    String getName() {
        String Prefix;
        if (Gender.equals("male")) {      // в разборе используется метод Character.toLowerCase(Cender)

            Prefix = "Mr. ";
        } else {       // в разборе используется else if для женского пола
            Prefix = "Mrs. ";
        }
    return Prefix + Name;
    }

}


