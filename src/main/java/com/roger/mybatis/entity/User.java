package com.roger.mybatis.entity;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

	private static final long serialVersionUID = 7595101968424634707L;
	
	private Integer id;
	private String name;
	private LocalDate birthday;
	private Double salary;
}
