public class Hospital {

    public static void main(String[] args) {

        //Abstract sınıflardan nesne oluşturamayız
        IntensiveCare person = new IntensiveCare("Ali ", "41526336254", "24", "5", 101);
        RegularRoom person1 = new RegularRoom("Veli ","14253698785","29","3",201);

        person.login();
        person1.login();
    }
}
