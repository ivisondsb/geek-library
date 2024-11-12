package br.com.ivisondsb.geek_library.services

import br.com.ivisondsb.geek_library.dto.CategoryDTO
import br.com.ivisondsb.geek_library.dto.CreateCategoryDTO
import br.com.ivisondsb.geek_library.models.Category
import br.com.ivisondsb.geek_library.repositories.CategoryRepository
import org.springframework.stereotype.Service

@Service
class CategoryService(private val categoryRepository: CategoryRepository) {

    fun toDTO(category: Category): CategoryDTO {
        return CategoryDTO(
            id = category.id,
            name = category.name,
            description = category.description
        )
    }

    fun fromDTO(categoryDto: CreateCategoryDTO): Category {
        return Category(
            name = categoryDto.name,
            description = categoryDto.description
        )
    }

    fun save(category: Category): Category = categoryRepository.save(category)
    fun findAll(): List<Category> = categoryRepository.findAll()
    fun findById(id: Long): Category? = categoryRepository.findById(id).orElse(null)
    fun deleteById(id: Long) = categoryRepository.deleteById(id)
}