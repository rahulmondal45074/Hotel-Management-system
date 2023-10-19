package com.example.Restarentproject1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Res {

    private Integer resId;
    private String resName;
    private String resAddress;
    private Long resNumber;
    private String resSpeciality;
    private Integer resTotalStaffs;
    private Integer resRatting;

    private Integer countV;



}
