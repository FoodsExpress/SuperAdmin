package com.foodexpress.superadmin.modules.business.service;

import com.foodexpress.superadmin.modules.business.dto.RequestBusinessDto;
import com.foodexpress.superadmin.modules.business.dto.ResponseBusinessDto;
import com.foodexpress.superadmin.modules.business.entity.BusinessMan;
import com.foodexpress.superadmin.modules.business.repository.BusinessRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BusinessService {

    private final BusinessRepository businessRepository;

    public ResponseBusinessDto createBusiness(RequestBusinessDto requestBusinessDto) {
        ResponseBusinessDto responseBusinessDto = new ResponseBusinessDto();
        BusinessMan businessMan = BusinessMan.from(requestBusinessDto);

        businessRepository.save(businessMan);

        return responseBusinessDto;
    }
}
