package com.test.model

import org.springframework.data.mongodb.core.mapping.Document

import com.test.common.model.BaseModel

@Document
class Product extends BaseModel {

	String name
	String brand
	BigDecimal buyingPrice
	BigDecimal sellingPrice
}
