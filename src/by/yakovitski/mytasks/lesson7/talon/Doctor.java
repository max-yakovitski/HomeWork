package by.yakovitski.mytasks.lesson7.talon;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String doctorsName;
    private String occupation;
    private int doctorId;
    private List<Talon> talons;

    public Doctor(String doctorsName, String occupation, int doctorId) {
        talons = new ArrayList<>();
        this.doctorsName = doctorsName;
        this.occupation = occupation;
        this.doctorId = doctorId;
    }

    public String getDoctorsName() {
        return doctorsName;
    }

    public void setDoctorsName(String doctorsName) {
        this.doctorsName = doctorsName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public List<Talon> getTalons() {
        return talons;
    }

    public void setTalons(List<Talon> talons) {
        this.talons = talons;
    }

    public void addTalon (Talon talon) {
        talons.add(talon);
    }

    public void deleteTalon (Talon talon) {
        talons.remove(talon);
    }
}
