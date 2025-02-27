package com.edstem.projecttracker.contract.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TicketRequest {
    private String title;
    private String requirements;
    private String description;
    private String comments;
    private Long categoryId;
}
