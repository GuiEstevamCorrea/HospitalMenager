public class Doctor {

    private String name;
    private String address;
    private Specialty specialty;

    public Doctor(String name, String address, Specialty specialty){
        this.name = name;
        this.address = address;
        this.specialty = specialty;
    }

    public void display(){
        System.out.println("Doctor's name: " + this.name);
        System.out.println("Doctor's specialty: " + this.specialty);
    }

    public void runDiagnostic(Patient patient){
        patient.setDiagnostic(Disease.COVID);
    }

}
