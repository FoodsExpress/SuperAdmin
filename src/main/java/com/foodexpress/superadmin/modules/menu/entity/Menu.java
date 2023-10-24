package com.foodexpress.superadmin.modules.menu.entity;

import com.foodexpress.superadmin.modules.common.CommonEntity;
import jakarta.persistence.Entity;
import lombok.Getter;

/**
 * @author yeji
 * 메뉴
 */
@Getter
@Entity
public class Menu extends CommonEntity {

    // 상위 메뉴 PK
    private int menuParent;

    // 메뉴 명
    private String menuName;

    // 메뉴 클릭시 이동할 링크
    private String menuLink;

    // 메뉴 클릭시 새 창으로 열릴지 여부
    private String menuTarget;

    // 데스크 탑 버전 에서 보일지 여부
    private boolean menuDesktop;

    // 모바일 버전 에서 보일지 여부
    private boolean menuMobile;

    // a태그 안에 들어 가게 될 custom HTML 태그
    private String menuCustom;

    // 메뉴 정렬 순서
    private int menuOrder;

}
