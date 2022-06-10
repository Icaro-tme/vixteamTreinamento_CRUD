package com.example.icaro.controllers;

import com.example.icaro.models.Client;
import java.util.List;

public interface ClientService {


//    Client saveClient(Client client);
//    List<Client> saveAllClients(List<Client> clients);
//    List<Client> getAll();

    List<Client>  getClientByNome(String nome);

    Client saveClient(Client client);

    List<Client> saveAllClients(List<Client> clients);

    List<Client> getClients();

    Client  getClientById(long id);

    Client getClientByCpf(int Cpf);

    Client getClientByEmail(String email);


    String deleteClient(long id);

    Client updateClient(Client newclient);

}
