/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Address.Address;
import Business.Employee.Employee;

/**
 *
 * @author sadit
 */
public class Patient {

    private String patientName;
    private String id;
    private EncounterHistory encounterHistory;
    private Address address;
    private String number;
    private int age;
    private String gender;
    private String email;
    private Employee doctor;
    public Patient() {
        encounterHistory = new EncounterHistory();
    }

    public Patient(String id, String name, String phoneNo, Address address, int age, String gender, String email) {
        this.id = id;
        this.patientName = name;
        this.number = phoneNo;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.email = email;
        encounterHistory = new EncounterHistory();

    }

    public Employee getDoctor() {
        return doctor;
    }

    public void setDoctor(Employee doctor) {
        this.doctor = doctor;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
