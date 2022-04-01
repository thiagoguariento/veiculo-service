package br.com.guariento.controller

import br.com.guariento.model.Veiculo
import br.com.guariento.service.VeiculoService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Post


@Controller("/veiculos")
class VeiculoController(
        private val veiculoService: VeiculoService
) {

    @Post
    fun create(@Body veiculo: Veiculo): HttpResponse<Veiculo>{
        return HttpResponse.created(veiculoService.create(veiculo))
    }

    @Get("/{id}")
    fun findById(@PathVariable id: Long): Veiculo {
        return veiculoService.findById(id)
    }
}