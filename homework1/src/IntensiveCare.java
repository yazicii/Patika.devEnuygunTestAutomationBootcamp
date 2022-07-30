public class IntensiveCare extends Person{
    private int roomNo;


    public IntensiveCare(String name, String idNo, String age, String patientLevel, int roomNo) {
        super(name, idNo, age, patientLevel);
        this.roomNo=roomNo;
    }

    //Kullanılan method sub sınıflarda Override edilmeli
    @Override
    public void login() {
        System.out.println(getName()+"yoğun bakımda yatıyor.");
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }
}
