package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.EmpDto;

public class EmpDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("abc");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();

public void insert(EmpDto dto) {
	entityTransaction.begin();
	entityManager.persist(dto);
	entityTransaction.commit();
}

public EmpDto findbyId(String email) {
	EmpDto empDto=entityManager.find(EmpDto.class, email);
	return empDto;
}

public void deleteData(EmpDto empDto) {
	entityTransaction.begin();
	entityManager.remove(empDto);
	entityTransaction.commit();
}


public void updateData(EmpDto dto) {
	entityTransaction.begin();
	entityManager.merge(dto);
	entityTransaction.commit();
	

}

public EmpDto fetchData(String email) {
	entityTransaction.begin();
	EmpDto dto=entityManager.find(EmpDto.class, email);
	entityTransaction.commit();
	return dto;

}

public List<EmpDto> fetchAll() {
	Query query=entityManager.createQuery("select data from EmpDto data");
	List<EmpDto> dto=query.getResultList();
	return dto;
}

}
