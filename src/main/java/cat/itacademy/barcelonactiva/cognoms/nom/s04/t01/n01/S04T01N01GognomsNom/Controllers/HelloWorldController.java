package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.S04T01N01GognomsNom.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(defaultValue = "UNKNOWN") String nombre) {
        return "Hola, " + nombre + ". Estás ejecutando un proyecto Maven.";
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{nombre}"})
    public String saluda2(@PathVariable(required = false) String nombre) {
        if (nombre == null) {
            nombre = "";
        }
        return "Hola, " + nombre + ". Estás ejecutando un proyecto Maven.";
    }
}