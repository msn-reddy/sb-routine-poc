package narayan.sbroutine.jpacrud.app.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import narayan.sbroutine.jpacrud.app.dto.AlphaServiceResponse;
import narayan.sbroutine.jpacrud.app.entity.Alpha;
import narayan.sbroutine.jpacrud.app.exception.AlphaServiceException;
import narayan.sbroutine.jpacrud.app.repo.AlphaRepo;

@Service
public class AlphaService {

	private AlphaRepo alphaRepo;

	public AlphaService(AlphaRepo alphaRepo) {
		this.alphaRepo = alphaRepo;
	}

	public AlphaServiceResponse<List<Alpha>> findAll() {
		return AlphaServiceResponse.of(alphaRepo.findAll());
	}

	public AlphaServiceResponse<Alpha> findById(Long id) {
		return AlphaServiceResponse.of(
				alphaRepo.findById(id).orElseThrow(() -> new AlphaServiceException("No record found with id : " + id)));
	}

	public AlphaServiceResponse<Alpha> save(Alpha alpha) {
		return AlphaServiceResponse.of(alphaRepo.save(alpha));
	}

	public AlphaServiceResponse<Alpha> update(Long id, Alpha newAlpha) {
		Alpha alpha = findById(id).getData();
		BeanUtils.copyProperties(newAlpha, alpha);
		alpha.setId(id);
		return AlphaServiceResponse.of(alphaRepo.save(alpha));
	}

}
