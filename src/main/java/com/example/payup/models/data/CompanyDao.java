package com.example.payup.models.data;

import com.example.payup.models.Company;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@Repository
@Transactional
public interface CompanyDao extends CrudRepository<Company, Integer> {

    List<Company> findByCompany(String Company);
}
