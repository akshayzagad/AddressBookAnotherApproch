package com.bridgelabz.addressbook_systeam.repository;

import com.bridgelabz.addressbook_systeam.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location,Long> {
}
