package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.S04T01N01GognomsNom.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    @ResponseBody
    public String greetings(@RequestParam(defaultValue = "UNKNOWN")  String name) {
        return "Hola, " + name + ". Estás ejecutando un proyecto Maven.";
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
    public String greetings2(@PathVariable(required = false) String name) {
        if (name == null) {
            name = "UNKNOWN";
        }
        return "Hola, " + name + ". Estás ejecutando un proyecto Maven.";
    }
}