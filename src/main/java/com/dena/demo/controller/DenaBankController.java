package com.dena.demo.controller;

public class DenaBankController {
@GetMapping("/dena")
public ResponseEntity<Dena> getAllData()
{
return new ResponseEntity<Dena>(http.Status.Ok);
}

@PutMapping("/update/{udi}")
public ResponseEntity<Dena> updateByUserId()

{
return new ResponseEntity<Dena>(http.Status.Ok)
}

}
