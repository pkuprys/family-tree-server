package com.parakultura.familytree.familytreeserver.repositories;

import com.parakultura.familytree.familytreeserver.entities.FamilyMemberEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@SuppressWarnings("unused")
public interface FamilyMemberRepository extends CrudRepository<FamilyMemberEntity, Long> {
    List<FamilyMemberEntity> findByLastName(String name);
}