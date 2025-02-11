package com.querydsl.examples.kotlin.entity

import javax.persistence.*
import java.io.Serializable

@MappedSuperclass
abstract class ExampleBaseEntity<ID : Serializable> {

	@field:Id
	@field:GeneratedValue(strategy = GenerationType.AUTO)
	var id: ID? = null
}