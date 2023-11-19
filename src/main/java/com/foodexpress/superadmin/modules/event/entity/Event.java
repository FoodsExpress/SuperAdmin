package com.foodexpress.superadmin.modules.event.entity;

import com.foodexpress.superadmin.modules.common.CommonEntity;
import com.foodexpress.superadmin.modules.coupon.entity.Coupon;
import com.foodexpress.superadmin.modules.event.form.EventForm;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 이벤트 entity
 *
 * @author yeji
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Event extends CommonEntity {

    // 이벤트 명
    private String eventName;
    // 이벤트 코드
    private String eventCode;
    // 이벤트 진행 여부
    private boolean isOpen;
    // 이벤트 시작 기간
    private LocalDateTime startDateTime;
    // 이벤트 종료 기간
    private LocalDateTime endDateTime;
    // 이번트 적용 기간
    private String eventDuration;
    // 이벤트 이미지 1
    private String eventImageLink1;
    // 이벤트 이미지 2
    private String eventImageLink2;
    // 이벤트 이미지 3
    private String eventImageLink3;
    // 이벤트 주소
    private String eventLink;
    // 할인 적용 유무
    private boolean isDiscount;
    // 쿠폰
    @OneToOne(targetEntity = Coupon.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "coupon_id")
    private Coupon coupon;

    public Event(EventForm eventForm) {
        this.eventName = eventForm.getEventName();
        this.eventCode = eventForm.getEventCode();
        this.isOpen = eventForm.isOpen();
        this.startDateTime = eventForm.getStartDateTime();
        this.endDateTime = eventForm.getEndDateTime();
        this.eventDuration = eventForm.getEventDuration();
        this.eventImageLink1 = eventForm.getEventImageLink1();
        this.eventImageLink2 = eventForm.getEventImageLink2();
        this.eventImageLink3 = eventForm.getEventImageLink3();
        this.eventLink = eventForm.getEventLink();
    }

    public static Event from(EventForm eventForm) {
        return new Event(eventForm);
    }

    public void updateEvent(EventForm eventForm) {
        this.eventName = eventForm.getEventName();
        this.eventCode = eventForm.getEventCode();
        this.isOpen = eventForm.isOpen();
        this.startDateTime = eventForm.getStartDateTime();
        this.endDateTime = eventForm.getEndDateTime();
        this.eventDuration = eventForm.getEventDuration();
        this.eventImageLink1 = eventForm.getEventImageLink1();
        this.eventImageLink2 = eventForm.getEventImageLink2();
        this.eventImageLink3 = eventForm.getEventImageLink3();
        this.eventLink = eventForm.getEventLink();
        this.isDiscount = eventForm.isDiscount();
    }
}
