package com.project.petpal.DTO;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@ToString
public class ReportDTO {
    private int report_num;
    private int report_type;
}
