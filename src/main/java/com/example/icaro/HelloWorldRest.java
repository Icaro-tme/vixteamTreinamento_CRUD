package com.example.icaro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRest {
    @GetMapping("/helloBuscarNome")
    public String buscar(@RequestParam(name = "fname") String nome){


        //FAER OBJETO CLIENTE
        String[] bancoClientes = {"Jose", "Jesué", "JoShua", "ZÉ"};

        boolean retorno = false;
        int x = 0;

        for (String s: bancoClientes) {
            if (bancoClientes[x].equalsIgnoreCase(nome)) {
                retorno = true;
            }else{x++;}
        }

        return retorno ? "Esta na lista" : "Nao esta na lista";
    }
}
