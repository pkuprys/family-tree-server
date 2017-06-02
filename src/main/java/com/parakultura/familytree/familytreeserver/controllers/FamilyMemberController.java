package com.parakultura.familytree.familytreeserver.controllers;

import com.parakultura.familytree.familytreeserver.entities.FamilyMemberEntity;
import com.parakultura.familytree.familytreeserver.models.FamilyMember;
import com.parakultura.familytree.familytreeserver.models.FamilyMemberImpl;
import com.parakultura.familytree.familytreeserver.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"WeakerAccess", "unused"})
@Controller
@RequestMapping(path = "/familyMembers")
public class FamilyMemberController {

    @Autowired
    private FamilyMemberRepository familyMemberRepository;

    @PostMapping
    @ResponseBody
    public Long createNewFamilyMember(@RequestBody FamilyMemberImpl familyMember) {
        FamilyMemberEntity familyMemberEntity = FamilyMemberEntity.from(familyMember);
        familyMemberRepository.save(familyMemberEntity);
        return familyMemberEntity.getId();
    }

    @GetMapping
    @ResponseBody
    public List<FamilyMember> getAllFamilyMembers() {
        List<FamilyMember> familyMembers = new ArrayList<>();
        familyMemberRepository.findAll().iterator().forEachRemaining(familyMembers::add);
        return familyMembers;
    }
}
