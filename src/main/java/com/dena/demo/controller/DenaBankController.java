package com.dena.demo.controller;

public class DenaBankController {
@GetMapping("/dena")
public ResponseEntity<Dena> getAllData()
{
return new ResponseEntity<Dena>(http.Status.Ok);
}
@PostMapping("/denaUserInfo")
public ResponseEntity<Dena> saveInfoData()
{
return new ResponseEntity<>
}

@PutMapping("/update/{udi}")
public ResponseEntity<Dena> updateByUserId()
{
return new ResponseEntity<Dena>(http.Status.Ok)
}





}
