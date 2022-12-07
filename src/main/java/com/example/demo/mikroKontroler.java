package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
            
@CrossOrigin("http://localhost:8080")
@RestController
@RequestMapping("/reg")
public class mikroKontroler {
   	@Autowired
   	public registrasi regis;
   	
   	@PostMapping("/registrasi")
   	public ResponseEntity<String> regIs(@RequestParam("email") String email, @RequestParam("namapengguna") String username, @RequestParam("katasandi") String katasandi){
   		System.out.println(email+" "+username+" "+katasandi);
   			int model= regis.regis(email, username, katasandi);
   		return new ResponseEntity<>(String.valueOf(model),HttpStatus.ACCEPTED);
   	}
   	@GetMapping("/masuk")
   	public ResponseEntity<String> logIn(@RequestParam("email") String email, @RequestParam("katasandi")String katasandi){
   		modelLogin reg=regis.login(email, katasandi);
   		return new ResponseEntity<> (String.valueOf(reg), HttpStatus.ACCEPTED);
   	}
   	@GetMapping("/tarik")
   	public ResponseEntity<List<modelLogin>> fetAll(){//ResponseEntity<String> atau ResponseEntity<List<modelLogin>>
        List<modelLogin> fet= regis.tarikSemua();
   		return new ResponseEntity<>(fet, HttpStatus.ACCEPTED);	
   	}
   	
}
