package sorravit.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import sorravit.model.People

@RepositoryRestResource(path = "/people")
interface PeopleRepository:CrudRepository<People,Long>