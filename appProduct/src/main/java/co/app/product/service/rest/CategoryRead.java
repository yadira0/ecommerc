package co.app.product.service.rest;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.app.common.dto.GenericDto;
import co.app.common.util.Constant;
import co.app.product.service.CategoryService;
/**
 * This class already exposes the service and only works with DTO, this is for 
 * read DTO from datatable
 * @author yadira muñoz herrera
 *
 */

@Service
public class CategoryRead {
	
	@Autowired
	CategoryService categoryService;
	
	public GenericDto getAllCategories() {
		
		GenericDto response= new GenericDto();
		response.setListObjects(new ArrayList<>(categoryService.showCategories()));
		response.setCodeResponse(Constant.RESPONSE_CODE_OK);
		response.setMessageResponse(Constant.MESSAGE_CATEGORY_GET_ALL);
		return response;
	}

}
