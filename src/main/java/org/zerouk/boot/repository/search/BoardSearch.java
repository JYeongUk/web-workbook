package org.zerouk.boot.repository.search;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.zerouk.boot.domain.Board;

public interface BoardSearch {

    Page<Board> search1(Pageable pageable);

}
