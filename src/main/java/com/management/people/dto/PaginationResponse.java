package com.management.people.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PaginationResponse<T> {
    private int currentPage;
    private int perPage;
    private int totalPages;
    private Long totalItems;

    private List<T> data;

}