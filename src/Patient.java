public class Patient {

    private String name;
    private String address;

    private Disease diagnostic;

    private Doctor doctor;

    public Patient(String name, String address){
        this.name = name;
        this.address = address;

        this.diagnostic = Disease.UNKNOWN;

    }

    public void display(){
        if(doctor != null){
            doctor.display();
        }else {
            System.out.println("No doctor has been assigned.");
        }

        System.out.println("Patient Name: " + this.name);
        System.out.println("Patient Address: " + this.address);
        System.out.println("Patient Diagnostic: " + this.diagnostic);
    }

    public void setDiagnostic(Disease diagnostic){
        this.diagnostic = diagnostic;
    }

    public void setDoctor(Doctor doctor){
        this.doctor = doctor;
    }

    public Doctor getDoctor(){
        return doctor;
    }
}
