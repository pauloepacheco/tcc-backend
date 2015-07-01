package br.com.ulbra.tcc.restapi.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.ulbra.tcc.restapi.constants.URIResource;

/**
 * The My Resource Sample Class
 * 
 * @author Paulo Pacheco
 *
 */

//http://localhost:8080/tcc-rest-api/resource/getjson

@Path(URIResource.MY_RESOURCE)
public class MyResource {


	@GET
	@Path(URIResource.GET_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public DummyVO getResource(){
		
		DummyVO vo = new DummyVO();
		vo.setAddress("Dummy Address");
		vo.setName("Dummy Name");
		return vo;
	}
}
