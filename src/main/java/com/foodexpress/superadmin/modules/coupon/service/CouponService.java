package com.foodexpress.superadmin.modules.coupon.service;

import com.foodexpress.superadmin.infra.exception.OmittedRequireFieldException;
import com.foodexpress.superadmin.modules.coupon.dto.CouponDto;
import com.foodexpress.superadmin.modules.coupon.entity.Coupon;
import com.foodexpress.superadmin.modules.coupon.form.CouponForm;
import com.foodexpress.superadmin.modules.coupon.repository.CouponRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CouponService {

    private final CouponRepository couponRepository;

    public CouponDto createCoupon(CouponForm couponForm) {
        Optional<Coupon> optionalCoupon = couponRepository.findByCouponName(couponForm.getCouponName());

        if (optionalCoupon.isPresent()) {
            throw new OmittedRequireFieldException("쿠폰 명은 고유한 값이어야 합니다.");
        }

        Coupon coupon = Coupon.from(couponForm);
        couponRepository.save(coupon);

        return CouponDto.from(coupon);
    }

    public CouponDto updateCoupon(CouponForm couponForm) {
        Coupon coupon = couponRepository.findById(couponForm.getCouponId()).orElseThrow(() -> new OmittedRequireFieldException("쿠폰을 찾을 수 없습니다."));
        coupon.update(couponForm);

        return CouponDto.from(coupon);
    }

    public void disableCoupon(CouponForm couponForm) {
        Coupon coupon = couponRepository.findById(couponForm.getCouponId()).orElseThrow(() -> new OmittedRequireFieldException("쿠폰을 찾을 수 없습니다."));
        coupon.disableCoupon();
    }

    public List<CouponDto> getCoupons(Pageable pageable) {
        Page<Coupon> couponPages = couponRepository.findAll(pageable);
        return couponPages.stream().map(CouponDto::from).collect(Collectors.toList());
    }
}
