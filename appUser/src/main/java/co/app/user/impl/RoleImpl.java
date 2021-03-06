package co.app.user.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import co.app.user.genericRepository.GenericRepository;
import co.app.user.model.Role;
import co.app.user.repository.IRoleRepository;
import co.app.user.service.RoleService;
/**
 * 
 *This is a class where the generic class of the role of user is linked with the service class
 * @author yadira muñoz herrera
 *
 */
@Transactional
@Service
public class RoleImpl extends GenericRepository<Role, Long> implements RoleService{

	@Autowired
	IRoleRepository roleReposity;
	
	@Override
	public CrudRepository<Role, Long> getRepo() {
		
		return roleReposity;
	}

}
