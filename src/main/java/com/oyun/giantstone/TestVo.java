package com.oyun.giantstone;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class TestVo {
    @NotNull
    private String id;
    @NotBlank
    private String name;
}
