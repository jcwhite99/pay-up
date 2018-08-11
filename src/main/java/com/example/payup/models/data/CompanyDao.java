package com.example.payup.models.data;

import com.example.payup.models.forms.Company;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;



@Repository
@Transactional
public interface CompanyDao extends CrudRepository<Company, Integer> {


}
