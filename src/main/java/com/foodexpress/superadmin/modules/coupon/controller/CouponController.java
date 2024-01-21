package com.foodexpress.superadmin.modules.coupon.controller;

import static com.foodexpress.superadmin.modules.utils.ApiUtils.success;

import com.foodexpress.superadmin.modules.coupon.dto.CouponDto;
import com.foodexpress.superadmin.modules.coupon.form.CouponForm;
import com.foodexpress.superadmin.modules.coupon.service.CouponService;
import com.foodexpress.superadmin.modules.utils.ApiUtils.ApiResult;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController("/coupon")
public class CouponController {

    private final CouponService couponService;

    @PostMapping
    public ApiResult<CouponDto> createCoupon(@Valid @RequestBody CouponForm couponForm) {
        return success(couponService.createCoupon(couponForm));
    }

    @PatchMapping
    public ApiResult<CouponDto> updateCoupon(@Valid @RequestBody CouponForm couponForm) {
        return success(couponService.updateCoupon(couponForm));
    }

    @GetMapping
    public ApiResult<CouponDto> getCoupons(@PageableDefault Pageable pageable) {
        return success(couponService.getCoupons(pageable));
    }
}
