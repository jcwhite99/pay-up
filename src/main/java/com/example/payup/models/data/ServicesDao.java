package com.example.payup.models.data;

import com.example.payup.models.forms.Services;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;


@Repository
@Transactional
public interface ServicesDao extends CrudRepository<Services, Integer > {


}

