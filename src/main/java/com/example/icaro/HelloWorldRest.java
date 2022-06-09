//package com.example.icaro;
//
//import com.example.icaro.models.Client;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//
//@RestController
//public class HelloWorldRest {
//
////    @GetMapping("/helloBuscarNome")
//    public String buscarNome(@RequestParam(name = "fname") String nome){
//
//        //##############//
//        //MOCK DOS DADOS DO BANCO
//        List<Client> clientes = new ArrayList<>();//BUSQUEI OS DADOS DO BANCO
//        clientes.add(new Client("Jose","1234","asd@asd"));
//        clientes.add(new Client("RodolFo", "3333", "aaa@bbb"));
//        clientes.add(new Client("ZE", "1212","ccc@ddd"));
//        //##################//
//
//        Client clienteEncontrado = clientes.stream().filter(client -> client.getNome().equalsIgnoreCase(nome)).findFirst().orElse(null);
//
//        return clienteEncontrado!=null ? "Esta na lista" : "Nao esta na lista";
//    }
//
//    @GetMapping("/helloBuscarCPF")
//    public String buscarCPF(@RequestParam(name = "fCPF") String CPF){
//
//        //##############//
//        //MOCK DOS DADOS DO BANCO
//        List<Client> clientes = new ArrayList<>();//BUSQUEI OS DADOS DO BANCO
//        clientes.add(new Client("Jose","1234","asd@asd"));
//        clientes.add(new Client("RodolFo", "3333", "aaa@bbb"));
//        clientes.add(new Client("ZE", "1212","ccc@ddd"));
//        //##################//
//
//        Client clienteEncontrado = clientes.stream().filter(client -> client.getCPF().equalsIgnoreCase(CPF)).findFirst().orElse(null);
//
//        return clienteEncontrado!=null ? "Esta na lista" : "Nao esta na lista";
//    }
//}
