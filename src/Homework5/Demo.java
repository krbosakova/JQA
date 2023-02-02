package Homework5;

public class Demo {
    public static void main(String[] args) {

        Person[] personArr = new Person[10];
        personArr[0] = new Person("Merry", 34, false);
        personArr[1] = new Person("George", 17, true);

        personArr[2] = new Student("Will", 24, true, 6);
        personArr[3] = new Student("Carla", 33, false, 3);

        personArr[4] = new Employee("Cary", 50, false, 200);
        personArr[5] = new Employee("Toto", 23, true, 100);


        for (Person value : personArr) {
            if (value == null) {
                continue;
            } else {
                if (value instanceof Student) {
                    ((Student) value).showStudentInfo();
                } else if (value instanceof Employee) {
                    ((Employee) value).showEmployeeInfo();
                } else {
                    value.showPersonInfo();
                }
            }
        }
        for (Person person : personArr)
            if (person instanceof Employee) {
                System.out.println(person.getName() + " overtime for 2 hours: "
                        + ((Employee) person).calculateOvertime(2));
            }
    }
}

