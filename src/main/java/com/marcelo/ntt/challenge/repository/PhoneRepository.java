package com.marcelo.ntt.challenge.repository;

import com.marcelo.ntt.challenge.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, String> {
}
