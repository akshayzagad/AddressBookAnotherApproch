package com.bridgelabz.addressbook_systeam.repository;

import com.bridgelabz.addressbook_systeam.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long>{

}
