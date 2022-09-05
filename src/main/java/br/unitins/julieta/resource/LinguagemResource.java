package br.unitins.julieta.resource;

import javax.ws.rs.Path;

import br.unitins.julieta.model.Linguagem;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

@Path("/linguagens")
public interface LinguagemResource extends PanacheEntityResource<Linguagem, Long> {
    
}
