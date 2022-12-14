package ru.javabegin.backend.todo.entity

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*
import javax.persistence.*

/*

справочноное значение - приоритет пользователя
может использовать для своих задач

 */
@Entity
@Table(name = "priority", schema = "todolist", catalog = "postgres")
class Priority {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    val id: Long? = null

    val title: String? = null

    val color: String? = null

    @Column(name = "user_id")
    private val userId:Long? = null

//    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id", referencedColumnName = "id") // по каким полям связывать (foreign key)
//    val user: User? = null


    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false
        val priority = o as Priority
        return id == priority.id
    }

    override fun hashCode(): Int {
        return Objects.hash(id)
    }

    override fun toString(): String {
        return title!!
    }
}