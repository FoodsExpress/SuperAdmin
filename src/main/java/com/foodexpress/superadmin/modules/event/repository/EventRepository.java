package com.foodexpress.superadmin.modules.event.repository;

import com.foodexpress.superadmin.modules.event.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {}
