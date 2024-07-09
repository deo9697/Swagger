package controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {

	@GetMapping(path = "v1")
	public String getName(@RequestParam String name) {
		return "Hello, " + name + "!";
	}

	@PostMapping("/name/reverse")
	public String reverseName(@RequestParam String name) {
		StringBuilder reversedName = new StringBuilder(name);
		return reversedName.reverse().toString();
	}
}
