public class Inheritance {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.Name = "Mehmet";
        t1.Age = 68;

        Students S1 = new Students();
        S1.Name = "Şahin";
        S1.Age = 22;
        S1.number = 1030521199;
    }
}

class Information // Super Class
{
    public String Name;
    public int Age;

}

class Teacher extends Information{} // Subclass
class Students extends Information // Subclass
{
    public int number;

}