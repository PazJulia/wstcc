package br.unitins.julieta.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@MappedSuperclass
public class DefaultEntity extends PanacheEntityBase {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

}