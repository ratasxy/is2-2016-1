package ucsp.is2.repository;

import org.springframework.data.repository.Repository;
import antlr.collections.List;
import ucsp.is2.model.Puntuation;

public interface PuntuationRepository extends Repository <Puntuation , Long> {
	void delete (Puntuation deleted);
	List findAll();
	List FindPuntuation (Long puntuation);
}