package com.wearefrancis.aiplayer.dto.util;

import com.wearefrancis.aiplayer.dto.params.PageParams;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class PageableFactory {
    public static Pageable getPage(PageParams pageParams) {
        Sort sort = new Sort(Sort.Direction.ASC, "id");
        return new PageRequest(pageParams.getPage(), pageParams.getPerPage(), sort);
    }
}
