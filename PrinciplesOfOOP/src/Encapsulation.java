public class Encapsulation {
    public static void main(String[] args) {

        PersonalInformation p1 = new PersonalInformation();
        p1.SetName("Mehmet");
        p1.SetAge(22);
        System.out.println("Person Information = "+p1.GetName()+p1.GetAge());
        p1.SetAge(-22);
    }
}

class PersonalInformation{
    private String Name;
    private int Age;

    public String GetName() // We access private data with Getter and Setter method
    {
        return Name;
    }
    public void SetName(String Name)
    {
        this.Name=Name;
    }

    public int GetAge()
    {
        return Age;
    }

    public void SetAge(int Age)
    {
        if (Age>0)
            this.Age=Age;
        else // If data is incorrect , We warn user with Setter method
            System.out.println("Error!!! Age is not be negative");
    }

}
