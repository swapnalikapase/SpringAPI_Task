package com.jbk.SpringAPI_Task;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/amazon")
public class MyController {
	@RequestMapping(value="/all" , method = RequestMethod.GET)
	public String firstapi() {
		return "ALL Amazon Product details here.....";
	}
	@RequestMapping(value="/fashion" , method = RequestMethod.POST)
	public String secondapi() {
		return "ALL fashion Product details here....";
	}
	@RequestMapping(value="/bestseller" , method = RequestMethod.PUT)
	public String thirdapi() {
		return "ALL bestseller Product details here.....";
	}
	@RequestMapping(value="/mobilesr" , method = RequestMethod.DELETE)
	public String fourthapi() {
		return "ALL mobiles Product details here.......";
	}
	@RequestMapping(value="/electronics" , method = RequestMethod.GET)
	public String fifthapi() {
		return "ALL electronics Product details here.......";
	}
	@RequestMapping(value="/prime" , method = RequestMethod.PUT)
	public String sixthhapi() {
		return "ALL prime Product details here.......";
	}
	@RequestMapping(value="/shop" , method = RequestMethod.PUT)
	public String seventhapi() {
		return "ALL shopping  details here.......";
	}
	@GetMapping("/sell")
	public String fapi() {
		return "sells details..";
	}
	@PutMapping("/amazon")
	public String sapi() {
		return "Amazon details..";
	}
	@DeleteMapping("/sell")
	public String tapi() {
		return "sells details..";
	}
	@PostMapping("/electronics")
	public String foapi() {
		return "Amazon electronics product details..";
	}
	@GetMapping("/HomeAndKitchen")
	public String fioapi() {
		return "Amazon Home And Kitchen product details..";
	}
	@PostMapping("/mobile")
	public String sioapi() {
		return "Amazon Mobiles product details..";
	}
	@PutMapping("/allproduct")
	public String seoapi() {
		return "Amazon All product details..";
	}
	@DeleteMapping("/service")
	public String eightapi() {
		return "Amazon customer service information here ..";
	}
}
