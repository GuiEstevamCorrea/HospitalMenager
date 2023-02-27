public class Patient extends Person{

    private String name;
    private String address;

    private Disease diagnostic;

    private String doctorID;

    public Patient(String name, String address){
        super(name,address);

        this.diagnostic = Disease.UNKNOWN;

    }

    public void display(){
        super.display();
        System.out.println("Patient Diagnostic: " + this.diagnostic);
    }

    public void setDiagnostic(Disease diagnostic){
        this.diagnostic = diagnostic;
    }

    public void setDoctorID(String doctorID){
        this.doctorID = doctorID;
    }

    public String getDoctorID(){
        return doctorID;
    }
}
