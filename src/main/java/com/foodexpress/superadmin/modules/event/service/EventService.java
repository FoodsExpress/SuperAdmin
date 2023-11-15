package com.foodexpress.superadmin.modules.event.service;

import com.foodexpress.superadmin.infra.exception.OmittedRequireFieldException;
import com.foodexpress.superadmin.modules.event.dto.EventDto;
import com.foodexpress.superadmin.modules.event.entity.Event;
import com.foodexpress.superadmin.modules.event.form.EventForm;
import com.foodexpress.superadmin.modules.event.repository.EventRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

/**
 * 이벤트 비즈니스 로직
 *
 * @author yeji.jo
 */
@RequiredArgsConstructor
@Service
public class EventService {

    private final EventRepository eventRepository;

    /**
     * 이벤트 생성 메소드
     *
     * @param eventForm 이벤트 폼
     * @return eventDto 이벤트 결과 dto
     */
    public EventDto createEvent(EventForm eventForm) {
        Event event = Event.from(eventForm);
        eventRepository.save(event);
        return EventDto.from(event);
    }

    /**
     * 이벤트 업데이트
     *
     * @param eventForm 이벤트 폼
     * @return eventDto 이벤트 결과 dto
     */
    public EventDto updateEvent(EventForm eventForm) {
        Optional<Event> optionalEvent = eventRepository.findById(eventForm.getEventId());
        if (optionalEvent.isEmpty()) {
            throw new OmittedRequireFieldException(HttpStatus.NOT_FOUND.getReasonPhrase());
        }
        Event event = optionalEvent.get();
        event.updateEvent(eventForm);

        return EventDto.from(event);
    }

    /**
     * 이벤트 조회
     *
     * @param pageable
     * @return List<EventDto> 이벤트 데이터
     */
    public List<EventDto> getEvents(Pageable pageable) {
        Page<Event> eventPages = eventRepository.findAll(pageable);

        return eventPages.stream().map(EventDto::from).collect(Collectors.toList());
    }
}
