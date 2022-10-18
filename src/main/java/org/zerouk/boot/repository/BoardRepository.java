package org.zerouk.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.zerouk.boot.domain.Board;
import org.zerouk.boot.repository.search.BoardSearch;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardSearch {   // JpaRepository 상속시 <Entity 타입, @Id 타입> 지정

    @Query(value = "select now()", nativeQuery = true)
    String getTime();

}
