package com.example.icaro.controllers;

import com.example.icaro.models.Client;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientMapper implements RowMapper<Client> {
    @Override
    public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
        Client client = new Client();
        client.setId(rs.getLong("CLIENTE_ID"));
        client.setNome(rs.getString("CLIENTE_NOME"));
        client.setCPF(rs.getInt("CLIENTE_CPF"));
        client.setEmail(rs.getString("CLIENTE_EMAIL"));

        return client;
    }
}
