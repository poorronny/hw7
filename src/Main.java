public class Main {
    public static void main(String[] args) {

        //task1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        System.out.println(lastName + " " + firstName + " " + middleName);

        //task2

        String fullName = firstName + middleName + lastName;
        String result = lastName.toUpperCase() + " " + firstName.toUpperCase() + " " + middleName.toUpperCase() + " ";
        System.out.println("Данные ФИО сотрудника для заполнения отчёта - " + result);

        //task3
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName2);
    }

}