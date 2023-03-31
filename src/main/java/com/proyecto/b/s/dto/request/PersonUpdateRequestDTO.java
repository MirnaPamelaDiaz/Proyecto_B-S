package com.proyecto.b.s.dto.request;


import com.proyecto.b.s.entity.StatePerson;
import lombok.Data;

import java.util.List;

@Data
public class PersonUpdateRequestDTO {

    private String name;
    private String lastName;
    private String linkedin;
    private String recruiter;
    private String seniorityGeneral;
    private String dni;
    private String email;
    private String cuil;
    private String phoneNumber;
    private String remuneration;
    private Boolean active;


    private List<IndustryRequestDto> industries;

    private List<SourceRequestDto> sources;

    private List<RolRequestDto> roles;

    private List<SkillRequestDto> skills;

    private List<StatePersonRequestDto> people;





}