package Practica_Idat.App_formulario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrometidoController {
    @GetMapping ("/Promedio")
    public String frmPromedio(){
        return  "frmPromedio";
    }
}
