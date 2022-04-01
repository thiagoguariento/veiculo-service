package br.com.guariento.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "veiculo")
data class Veiculo(
        @Id
        @GeneratedValue
        val id: Long,
        val modelo: String,
        val marca: String,
        val Placa: String
)
