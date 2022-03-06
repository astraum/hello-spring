package astraum.hellospring.repository;

import astraum.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    void save(Member member);

    Optional<Member> findById(Long Id);

    Optional<Member> findByName(String name);

    List<Member> findAll();
}
