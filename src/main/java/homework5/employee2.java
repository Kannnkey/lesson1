package homework5;

public class employee2 {
    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Takana Keyn", "Java Developer", "java1@mail.ru", "89773088", 80000, 20);
        emplArray[1] = new Employee("Salvatore Stefan", "Python Developer", "teamdlead@mail.ru", "89279622", 75000, 47);
        emplArray[2] = new Employee("Murakami Kazumi", "SMM-Meneger", "qa1@mail.ru", "89940333", 48000, 43);
        emplArray[3] = new Employee("Chris Carrey", "Java Developer", "java2@mail.ru", "89274023", 78000, 38);
        emplArray[4] = new Employee("Emilia Davis", "Web-Designer", "qa2@mail.ru", "89239996", 60000,39);

        for (Employee employee : emplArray) {
            if (employee.Age() > 40) {
                employee.info();
            }
        }
    }
}
