package ar.edu.unq.epers.tactics.persistencia.dao

import ar.edu.unq.epers.tactics.modelo.Pelea

interface PeleaDAO {
    fun crear(pelea:Pelea) : Pelea
    fun actualizar(pelea: Pelea)
    fun recuperar(idDeLaPelea: Long): Pelea
}