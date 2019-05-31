package com.utn.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.utn.bike.models.Bike;

//Esta Clase De Tipo Repositorio Permite Gestionar Las Operaciones CRUD

/**Se Puede Observar Que El Interface Repositorio Para Almacenar Los Objetos Bike Extiende De JPARepository
   Esta Es Una Clase Qque Pertenece A SpringData
   La Mera Declaracion Del Interface Ha Sido Suficiente Para Poder Salvar Informacion
   Al Utilizar Spring Data La Mayor Parte Del Codigo Que Tendriamos Que Implementar, 
   Es Aportada Por El Propio Framework
**/

public interface BikeRepository extends JpaRepository<Bike, Long>{

	
}
