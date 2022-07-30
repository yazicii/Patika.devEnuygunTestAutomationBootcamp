public class RegularRoom extends Person{
    private int roomNo;


    public RegularRoom(String name, String idNo, String age, String patientLevel, int roomNo) {
        super(name, idNo, age, patientLevel);
        this.roomNo=roomNo;
    }

    //Kullanılan method sub sınıflarda Override edilmeli
    @Override
    public void login() {
        System.out.println(getName()+"normal odada yatıyor.");
    }



    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }
}
