package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Alert;

public interface AlertRepository extends JpaRepository<Alert, Integer> {

}