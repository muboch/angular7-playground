package ch.mubo.bkmonitor.controller;

import ch.mubo.bkmonitor.entities.LogMessage;
import ch.mubo.bkmonitor.service.SgtkInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sgtkin")
public class SgtkInController {

    @Autowired
    private SgtkInService sgtkInService;

    @GetMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity getSgtkInlogs(){
       return new ResponseEntity(sgtkInService.getSgtkInLog(), HttpStatus.OK);
    }
}
