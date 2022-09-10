package br.unitins.julieta.resource;

import javax.ws.rs.Path;

import br.unitins.julieta.model.Comando;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

@Path("/comandos")
public interface ComandoResource extends PanacheEntityResource<Comando, Long>{
    
}
