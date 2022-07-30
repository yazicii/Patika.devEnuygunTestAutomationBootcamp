// class'ın abstract olması gerekir.
public abstract class Person {
    private String name;
    private String idNo;
    private String age;
    protected String patientLevel;

    public Person(String name, String idNo, String age, String patientLevel){
        this.name=name;
        this.idNo=idNo;
        this.age=age;
        this.patientLevel=patientLevel;
    }

    //Abstract method kullanılarak uygulanır.
    public abstract void login();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPatientLevel() {
        return patientLevel;
    }

    public void setPatientLevel(String patientLevel) {
        this.patientLevel = patientLevel;
    }



}
