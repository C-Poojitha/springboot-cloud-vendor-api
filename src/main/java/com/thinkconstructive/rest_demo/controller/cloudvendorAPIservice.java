package com.thinkconstructive.rest_demo.controller;

import com.thinkconstructive.rest_demo.model.cloudvendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class cloudvendorAPIservice {
	cloudvendor cloudVendor;
	@GetMapping("/{vendorId}")
	public cloudvendor getcloudvendordetails(String vendorId) 
	{
		return cloudVendor;
			//	new cloudvendor("c1","vendor1","vendoraddress1","xxxxxxxxxx");
	}
	
	@PostMapping
	public String createcloudvendordetails(@RequestBody cloudvendor cloudVendor)
	{
		this.cloudVendor=cloudVendor;
		return "cloudevendor created successfully";
	}
	
	@PutMapping
	public String updatecloudvendordetails(@RequestBody cloudvendor cloudVendor)
	{
		this.cloudVendor=cloudVendor;
		return "cloudevendor updated successfully";
	}
	@DeleteMapping("{vendorId}")
	public String deletecloudvendordetails(String vendorId)
	{
		this.cloudVendor=null;
		return "cloudevendor deleted successfully";
	}
}
