package com.Project.Hope.Controller;
import com.Project.Hope.Entity.Doctor;
import com.Project.Hope.Exception.DoctorNotFoundException;
import com.Project.Hope.Exception.InvalidDoctorIdException;
import com.Project.Hope.Service.DoctorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api")
public class DoctorController {

    @Autowired
    private DoctorServiceImpl doctorService;

    public DoctorController(DoctorServiceImpl doctorService) {
        this.doctorService = doctorService;
    }


    @PostMapping("/Register/doctor")
    public ResponseEntity<?>createDoctor(@RequestBody Doctor doctor){
        Doctor createDoctor = doctorService.createDoctor(doctor);
        return ResponseEntity.status(HttpStatus.OK).body(createDoctor);
    }

    @PutMapping("/doctor/{doctorId}")
    public ResponseEntity<?>updateDoctor(@PathVariable int doctorId,@RequestBody Doctor doctorX) throws DoctorNotFoundException{
        Doctor doctor = doctorService.updateDoctor(doctorId,doctorX);
        return ResponseEntity.status(HttpStatus.OK).body(doctor);

    }

    @GetMapping("/doctors")
    public ResponseEntity<?>getAllDoctors(){
        List<Doctor>doctors = doctorService.getAllDoctors();
        return ResponseEntity.status(HttpStatus.OK).body(doctors);

    }
    @GetMapping("/doctor/{doctorId}")
    public ResponseEntity<?>getDoctorById(@PathVariable int doctorId) throws InvalidDoctorIdException{
        Doctor doctor = doctorService.getDoctorById(doctorId);
        return ResponseEntity.status(HttpStatus.OK).body(doctor);
    }
    @DeleteMapping("/doctor/{doctorId}")
    public ResponseEntity<?>deleteDoctorById(@PathVariable int doctorId) throws DoctorNotFoundException {
        doctorService.deleteDoctorById(doctorId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
