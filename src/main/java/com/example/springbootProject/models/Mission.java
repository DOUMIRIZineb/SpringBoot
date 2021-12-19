package com.example.springbootProject.models;



import javax.persistence.*;

@Entity
@Table(name = "mission")
public class Mission {

    private Integer id;

    private Long id_user;

    private String nom;

    private String fonction;

    private String destination;

    private String objet;

    private String transport;

    private String dateDepart;

    private String dateRetour;



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MISSION_ID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "nomAgent", nullable = false)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Column(name = "fonction", nullable = false)
    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    @Column(name = "destination", nullable = false)
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Column(name = "objet", nullable = false)
    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    @Column(name = "transport", nullable = false)
    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    @Column(name = "datedepart", nullable = false)
    public String getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(String dateDepart) {
        this.dateDepart = dateDepart;
    }

    @Column(name = "dateretour", nullable = false)
    public String getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(String dateRetour) {
        this.dateRetour = dateRetour;
    }

    @Column(name = "id_user", nullable = false)
    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public Mission() {
    }

    public Mission(String nom, String fonction, String destination,String transport, String objet, String dateDepart, String dateRetour, Long id_user) {
        this.nom = nom;
        this.fonction = fonction;
        this.destination = destination;
        this.transport = transport;
        this.objet = objet;
        this.dateDepart = dateDepart;
        this.dateRetour = dateRetour;
        this.id_user = id_user;
    }
}
