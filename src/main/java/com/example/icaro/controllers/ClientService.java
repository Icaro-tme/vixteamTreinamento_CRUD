package com.example.icaro.controllers;

import com.example.icaro.models.Client;
import java.util.List;

public interface ClientService {

    List<Client> getAllClient();
    List<Client>  getClientByNome(String nome);

    List<Client>  getClientById(long id);

    List<Client> deleteClientById(long id);
}
