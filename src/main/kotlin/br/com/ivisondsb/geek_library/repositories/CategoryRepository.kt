package br.com.ivisondsb.geek_library.repositories

import br.com.ivisondsb.geek_library.models.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository : JpaRepository<Category, Long>