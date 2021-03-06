package br.com.ulbra.tcc.restapi.resources;

import java.util.List;

import javax.ws.rs.core.Response;

import br.com.ulbra.tcc.common.exception.TCCWebServiceException;
import br.com.ulbra.tcc.common.vo.databasetask.TableVO;

/**
 * The DataQualityValidatorResource Interface
 * 
 * @author Paulo Pacheco
 *
 */
public interface DataQualityValidatorResource {

	public Response processRequest(List<TableVO> tableVOs) throws TCCWebServiceException;
	public Response downloadZipFile(String reportId) throws TCCWebServiceException;
}
