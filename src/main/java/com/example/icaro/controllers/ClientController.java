package com.example.icaro.controllers;

import com.example.icaro.models.Client;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientServiceImpl clientService;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/clientTodos")
    public String todosClientes(){
        List<Client> todosClientes = clientService.getClients();
        JSONArray clienteJson = new JSONArray(todosClientes);
        return "{\"success\": true,\"counters\":"+clienteJson.toString()+"}";
    }

    @GetMapping("/clientAdicionar")
    public String adicionarCliente(@RequestParam(name = "faddname") String nome, @RequestParam(name = "faddCPF")int cpf, @RequestParam(name = "faddemail")String email){
        Client clienteNovo = new Client();
        clienteNovo.setId(null);
        clienteNovo.setNome(nome);
        clienteNovo.setCpf(cpf);
        clienteNovo.setEmail(email);

        Client clienteAdicionado = clientService.saveClient(clienteNovo);

        JSONObject clienteJson = new JSONObject(clienteAdicionado);

        return "Cliente adicionado:"+clienteJson.toString();

    }

    @GetMapping("/clientAlterar")
    public String alterarCliente(@RequestParam(name = "faltid")long id, @RequestParam(name = "faltname") String nome, @RequestParam(name = "faltCPF")int cpf, @RequestParam(name = "faltemail")String email){
        Client clienteVelho = new Client();
        clienteVelho.setId(id);
        clienteVelho.setNome(nome);
        clienteVelho.setCpf(cpf);
        clienteVelho.setEmail(email);

        JSONObject clienteVelhoJson = new JSONObject(clienteVelho);

        Client clienteAlterado = clientService.updateClient(clienteVelho);

        JSONObject clienteJson = new JSONObject(clienteAlterado);
        return "Cliente alterado de:"+clienteVelhoJson.toString()+" para:"+clienteJson;

    }

    @GetMapping("/clientBuscarNome")
    public String buscarNome(@RequestParam(name = "fname") String nome){

        List<Client> clientesEncontrados = clientService.getClientByNome(nome);


        JSONObject clienteJson = null;

        if(!clientesEncontrados.isEmpty()){
            clienteJson = new JSONObject(clientesEncontrados.get(0));//Exemplo
        }
//
        return !clientesEncontrados.isEmpty() ? clienteJson.toString()  : "null";

    }

    @GetMapping("/clientBuscarId")
    public String buscarId(@RequestParam(name = "fid") long id){

        Client clientesEncontrados = clientService.getClientById(id);

        JSONObject clienteJson = null;
        clienteJson = new JSONObject(clientesEncontrados);

        return clienteJson.toString();
    }

    @GetMapping("/clientDeletar")
    public String deletarID(@RequestParam(name = "fdeleteid") long id){

        Client clienteEncontrado = clientService.getClientById(id);

        JSONObject clienteJson = new JSONObject(clienteEncontrado);
        //fun????o nao retorna nada
        clientService.deleteClient(id);


        return "Cliente adicionado:"+clienteJson.toString();
    }




//
//    @GetMapping("/clientAdicionarDados")
//    public String adicionarDados(@RequestParam(name = "fdados") int id, String nome, int CPF, String email){
//        String sql ="INSERT INTO cliente (CLIENTE_ID, CLIENTE_NOME, CLIENTE_CPF, CLIENTE_EMAIL) VALUES (?,?,?,?)";
//        int result = jdbcTemplate.update(sql,id,nome,CPF,email); //retorna 1
//        if (result>0){
//            return("A new row has been inserted:"+result);
//        }else{
//            return("Wasn't possible to insert row:"+result);
//        }
//    }
//
//    @GetMapping("/clientMostrarTodos")
//    public List<Client> findAllUsersTest() {
//        String sql = "SELECT * FROM cliente";
//        List<Client> clientes = new ArrayList<>();
//        clientes = jdbcTemplate.query(sql, new ClientMapper());
//        return(clientes);
//    }
//


//    String sql ="SELECT * FROM treinamento_vixteam_2022.cliente where CLIENTE_NOME = \""+nome"\";";
//    cliente = jdbcTemplate.query(sql,new ClientMapper());


//    @GetMapping("/clientBuscarCPF")
//    public String buscarCPF(@RequestParam(name = "fCPF") String CPF){
//
//        //##################//
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
//
//    }
}
