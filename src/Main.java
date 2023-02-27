

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Policlin","Rua das Ambrósias");
        Doctor doctor = new Doctor("Rodrigo","Jorge Zarur", Specialty.CARDIOLOGY,"001");

        hospital.addDoctors(doctor);
        Patient patient = new Patient("Guilherme","Rua Cassiano Ricardo");

        hospital.admitPatient(patient);
        // hospital.displayPatients();

        hospital.medicalAppointment(patient);

        // hospital.runDiagnostic(patient);
        hospital.displayPatients();


    }

}