package br.unitins.julieta.resource;

import javax.ws.rs.Path;

import br.unitins.julieta.model.Modulo;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

@Path("/modulos")
public interface ModuloResource extends PanacheEntityResource<Modulo, Long>{
    
}
