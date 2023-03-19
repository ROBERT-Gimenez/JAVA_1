package Controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class users {

    @RequestMapping(value = "/hola",headers="Accept=*/*",method = { RequestMethod.GET })
    public String holaMundo() {
        String mensaje = "Hola desde Spring Boot!";
        System.out.println(mensaje);
        return "Hola Mundo!";
    }


}