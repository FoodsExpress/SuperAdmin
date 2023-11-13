package com.foodexpress.superadmin.modules.business.repository;

import com.foodexpress.superadmin.modules.business.entity.BusinessMan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessRepository extends JpaRepository<BusinessMan, Long> {}
