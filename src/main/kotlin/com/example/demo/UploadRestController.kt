package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile
import javax.persistence.*

@RestController
@RequestMapping("upload")
class UploadRestController {

    @Autowired
    lateinit var repository: ItemRepository

    @PostMapping
    fun post(@RequestParam("file") file: MultipartFile){
        val item = Item(file = file.bytes)
        repository.save(item)
    }
}

@Repository
interface ItemRepository:CrudRepository<Item, Long> {

}

@Entity
class Item(
    @Id @GeneratedValue var id: Long? = null,
    @Lob var file:ByteArray)