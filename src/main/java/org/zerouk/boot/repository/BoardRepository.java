package org.zerouk.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerouk.boot.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {   // JpaRepository 상속시 <Entity 타입, @Id 타입> 지정
}
