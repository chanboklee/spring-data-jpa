package com.lee.springdatajpa.repository;

import com.lee.springdatajpa.entity.Member;

import java.util.List;

public interface MemberRepositoryCustom {
    List<Member> findMemberCustom();
}
