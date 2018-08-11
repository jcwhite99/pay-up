package com.example.payup.models.data;

import com.example.payup.models.forms.User;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@Repository
@Transactional
public interface UserDao extends CrudRepository<User, Integer> {

    List<User> findByUsername(String user);


}

