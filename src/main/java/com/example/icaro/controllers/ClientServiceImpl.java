package com.example.icaro.controllers;

import com.example.icaro.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepositorio clientRepositorio;

    @Override
    public Client saveClient(Client client){
        return clientRepositorio.save(client);
    }

    @Override
    public List<Client> saveAllClients(List<Client> clients){
        return clientRepositorio.saveAll(clients);
    }

    @Override
        public List<Client> getClients(){
        return clientRepositorio.findAll();
    }

    @Override
    public Client getClientById(long id){
        return clientRepositorio.findById(id);
    }
    @Override
    public List<Client> getClientByNome(String nome){
        return clientRepositorio.findByNome(nome);
    }

    @Override
    public Client getClientByCpf(int cpf){
        return clientRepositorio.findByCpf(cpf);
    }

    @Override
    public Client getClientByEmail(String email){
        return clientRepositorio.findByEmail(email);
    }

    @Override
    public String deleteClient(long id) {
       clientRepositorio.deleteById(id);
       return "Removed client of ID:"+id ;
    }

    @Override
    public Client updateClient(Client newclient){
        long clientId = newclient.getId();
        Client existingClient = clientRepositorio.findById(clientId);
        existingClient.setNome(newclient.getNome());
        existingClient.setCpf(newclient.getCpf());
        existingClient.setEmail(newclient.getEmail());

        return clientRepositorio.save(newclient);
    }



}
