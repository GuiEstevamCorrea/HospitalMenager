import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hospital {
    private String name;
    private String address;

    private List<Patient> patientList;
    private List<Doctor> doctorList;



    public Hospital(String name, String address){
        this.name = name;
        this.address = address;

        this.patientList = new ArrayList<>();
        this.doctorList = new ArrayList<>();

    }
    public void displayPatients(){
        for (Patient patient: patientList){
            patient.display();
        }
    }

    public void addDoctors(Doctor doctor){
        doctorList.add(doctor);
    }


    public void runDiagnostic(Patient patient){
        patient.setDiagnostic(Disease.COVID);
    }

    public void admitPatient(Patient patient){

        assignDoctor(patient);

        this.patientList.add(patient);

    }

    private void assignDoctor(Patient patient){
        patient.setDoctor(doctorList.get(new Random().nextInt(doctorList.size())));
    }

    public void medicalConsult(Patient patient){
        Doctor doctor = patient.getDoctor();
        doctor.runDiagnostic(patient);
    }



}
