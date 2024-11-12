package br.com.ivisondsb.geek_library.dto

import jakarta.validation.constraints.NotBlank

data class CreateCategoryDTO(
    @field:NotBlank
    val name: String,
    @field:NotBlank
    val description: String
)
