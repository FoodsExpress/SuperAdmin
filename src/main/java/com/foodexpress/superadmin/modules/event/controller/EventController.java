package com.foodexpress.superadmin.modules.event.controller;

import com.foodexpress.superadmin.modules.event.dto.EventDto;
import com.foodexpress.superadmin.modules.event.form.EventForm;
import com.foodexpress.superadmin.modules.event.service.EventService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 이벤트 관리용 컨트롤러
 *
 * @author yeji.jo
 */
@RequiredArgsConstructor
@RestController("/api/event")
public class EventController {

    private final EventService eventService;

    @PostMapping
    public EventDto createEvent(EventForm eventForm) {
        return eventService.createEvent(eventForm);
    }

    @PatchMapping
    public EventDto updateEvent(EventForm eventForm) {
        return eventService.updateEvent(eventForm);
    }

    @GetMapping
    public List<EventDto> getEvents(@PageableDefault Pageable pageable) {
        return eventService.getEvents(pageable);
    }
}
