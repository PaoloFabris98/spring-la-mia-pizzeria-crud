package com.example.spring_la_mia_pizzeria_crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Il nome non può essere vuoto")
    private String nome;

    @Lob
    @NotBlank(message = "La descrizione non può essere vuota")
    private String descrizione;

    private String foto;

    @NotNull
    @Min(value = 1, message = "Il prezzo dev'essere superiore a 0 e almeno di 1 euro")
    private double prezzo;

    // ! allergeni
    @NotNull(message = "Il glutine dev'essere vero o falso")
    private Boolean glutine = false;
    @NotNull(message = "Il lattosio dev'essere vero o falso")
    private Boolean lattosio = false;
    @NotNull(message = "le uova devono essere vere o false")
    private Boolean uova = false;
    @NotNull(message = "la frutta_a_guscio dev'essere vera o falsa")
    private Boolean frutta_a_guscio = false;
    @NotNull(message = "la soia dev'essere vera o falsa")
    private Boolean soia = false;
    @NotNull(message = "i pesci e crostacei devono essere veri o falsi")
    private Boolean pesce_e_crostacei = false;
    @NotNull(message = "Il sesamo dev'essere vero o falso")
    private Boolean sesamo = false;
    @NotNull(message = "Il sedano dev'essere vero o falso")
    private Boolean sedano = false;
    @NotNull(message = "la senape dev'essere vera o falsa")
    private Boolean senape = false;

    public Pizza() {
    }

    public Pizza(int id, String nome, String descrizione, String foto, double prezzo, Boolean glutine, Boolean lattosio,
            Boolean uova, Boolean frutta_a_guscio, Boolean soia, Boolean pesce_e_crostacei, Boolean sesamo,
            Boolean sedano, Boolean senape) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.foto = foto;
        this.prezzo = prezzo;
        this.glutine = glutine;
        this.lattosio = lattosio;
        this.uova = uova;
        this.frutta_a_guscio = frutta_a_guscio;
        this.soia = soia;
        this.pesce_e_crostacei = pesce_e_crostacei;
        this.sesamo = sesamo;
        this.sedano = sedano;
        this.senape = senape;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getFoto() {
        return this.foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public double getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public Boolean isGlutine() {
        return this.glutine;
    }

    public Boolean getGlutine() {
        return this.glutine;
    }

    public void setGlutine(Boolean glutine) {
        this.glutine = glutine;
    }

    public Boolean isLattosio() {
        return this.lattosio;
    }

    public Boolean getLattosio() {
        return this.lattosio;
    }

    public void setLattosio(Boolean lattosio) {
        this.lattosio = lattosio;
    }

    public Boolean isUova() {
        return this.uova;
    }

    public Boolean getUova() {
        return this.uova;
    }

    public void setUova(Boolean uova) {
        this.uova = uova;
    }

    public Boolean isFrutta_a_guscio() {
        return this.frutta_a_guscio;
    }

    public Boolean getFrutta_a_guscio() {
        return this.frutta_a_guscio;
    }

    public void setFrutta_a_guscio(Boolean frutta_a_guscio) {
        this.frutta_a_guscio = frutta_a_guscio;
    }

    public Boolean isSoia() {
        return this.soia;
    }

    public Boolean getSoia() {
        return this.soia;
    }

    public void setSoia(Boolean soia) {
        this.soia = soia;
    }

    public Boolean isPesce_e_crostacei() {
        return this.pesce_e_crostacei;
    }

    public Boolean getPesce_e_crostacei() {
        return this.pesce_e_crostacei;
    }

    public void setPesce_e_crostacei(Boolean pesce_e_crostacei) {
        this.pesce_e_crostacei = pesce_e_crostacei;
    }

    public Boolean isSesamo() {
        return this.sesamo;
    }

    public Boolean getSesamo() {
        return this.sesamo;
    }

    public void setSesamo(Boolean sesamo) {
        this.sesamo = sesamo;
    }

    public Boolean isSedano() {
        return this.sedano;
    }

    public Boolean getSedano() {
        return this.sedano;
    }

    public void setSedano(Boolean sedano) {
        this.sedano = sedano;
    }

    public Boolean isSenape() {
        return this.senape;
    }

    public Boolean getSenape() {
        return this.senape;
    }

    public void setSenape(Boolean senape) {
        this.senape = senape;
    }

}
