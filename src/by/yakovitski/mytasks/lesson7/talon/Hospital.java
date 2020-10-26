package by.yakovitski.mytasks.lesson7.talon;

import java.util.ArrayList;
import java.util.List;

public class Hospital extends Entity {
    private  String name;
    private int hospitalId;
    private List<Doctor> doctors;

    public Hospital(String name, int hospitalId) {
        doctors = new ArrayList<>();
        this.name = name;
        this.hospitalId = hospitalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public void addDoctor (Doctor doctor) {
        doctors.add(doctor);
    }

    public void deleteDoctor (Doctor doctor) {
        doctors.remove(doctor);
    }

    @Override
    public String toString() {
        return name + " № " + hospitalId;
    }
}
