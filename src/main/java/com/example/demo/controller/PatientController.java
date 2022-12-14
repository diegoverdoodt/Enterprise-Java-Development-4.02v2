package com.example.demo.controller;

import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.model.Patient;
import com.example.demo.model.Status;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/patients")
    public List<Patient> list() {
        return patientService.list();
    }

    @GetMapping("/patients/{id}")
    public Patient get(@PathVariable String id) {
        return patientService.get(id);
    }

    @GetMapping("/patients/byDate")
    public List<Patient> findAllByDateOfBirthIsBetween(@RequestParam(value = "begin") @DateTimeFormat(pattern="yyyy/MM/dd") Date begin, @RequestParam(value = "end") @DateTimeFormat(pattern="yyyy/MM/dd") Date end){
        return patientService.findPatientBetweenBirth(begin, end);
    }

    @GetMapping("/patients/admittedby/{department}")
    public List<Patient> findPatientsDepartmentAdmittedBy(@PathVariable Department department) {
        return patientService.findPatientsDepartmentAdmittedBy(department);
    }

    @GetMapping("/patients/admittedby/OFF")
    public List<Patient> findPatientsAdmittedStatusOFF()
    {   Status status = Status.OFF;
        return patientService.findPatientsAdmittedStatus(status);
    }
}
