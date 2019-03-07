package sorravit.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class People(
        @Id
        @GeneratedValue
        var id: Long = 0,
        var name: String = "",
        var age: Int = 0
)
