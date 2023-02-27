import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hospital {
    private String name;
    private String address;

    private List<Patient> patientList;
    private List<Doctor> doctorList;


    public Hospital(String name, String address) {
        this.name = name;
        this.address = address;

        this.patientList = new ArrayList<>();
        this.doctorList = new ArrayList<>();

    }

    public void displayPatients() {
        for (Patient patient : patientList) {
            System.out.println("Displaying patient.");
            patient.display();
            Doctor doc = this.getDoctorID(patient.getDoctorID());
            System.out.println("Displaying Doctor.");
            doc.display();
        }
    }

    public void addDoctors(Doctor doctor) {
        doctorList.add(doctor);
    }


    public void runDiagnostic(Patient patient) {
        patient.setDiagnostic(Disease.getRandomDisease());
    }

    public void admitPatient(Patient patient) {

        assignDoctor(patient);

        this.patientList.add(patient);

    }

    private void assignDoctor(Patient patient) {
        Doctor doctor = doctorList.get(new Random().nextInt(doctorList.size()));
        patient.setDoctorID(doctor.getId());
    }

    public void medicalAppointment(Patient patient) {
        Doctor doctor = this.getDoctorID((patient.getDoctorID()));

        doctor.runDiagnostic(patient);
    }

    private Doctor getDoctorID(String id) {
        for (Doctor doc: doctorList) {
            if (doc.getId().equals(id)) {
                return doc;
            }
        }
        return null;
    }
}

