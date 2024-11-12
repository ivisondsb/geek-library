package br.com.ivisondsb.geek_library.models

import jakarta.persistence.*

@Entity
@Table(name = "categories")
data class Category(
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = 0,
    @Column(name = "name")
    val name: String,
    @Column(name = "description")
    val description: String
)
