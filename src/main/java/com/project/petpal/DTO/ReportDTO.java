package com.project.petpal.DTO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component("ReportDTO")
@Getter
@Setter
public class ReportDTO {
    private int report_num;
    private int report_type;
}
