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
    public List<Client> getAllClient(){
        return clientRepositorio.findAll();
    }

    @Override
    public List<Client> getClientById(long id){
        return clientRepositorio.findById(id);
    }

    @Override
    public List<Client> getClientByNome(String nome){
        return clientRepositorio.findByNome(nome);
    }

    @Override
    public List<Client> deleteClientById(long id) {return clientRepositorio.deleteById(id);}

}
